# chatbot_engine.py

import json
import random
import re
from datetime import datetime
from pathlib import Path


class Chatbot:
    """
    Simple intent-based chatbot with:
    - pattern matching over intents.json
    - basic context memory (user name)
    - time/date responses
    - conversation logging
    """

    def __init__(self, intents_path: str = "intents.json", log_path: str = "chat_log.txt"):
        # ✅ Base directory where THIS file (chatbot_engine.py) lives
        base_dir = Path(__file__).parent

        # ✅ Always resolve paths relative to this folder
        self.intents_path = base_dir / intents_path
        self.log_path = base_dir / log_path

        self.intents = self._load_intents()
        self.memory = {
            "name": None
        }

    def _load_intents(self):
        if not self.intents_path.exists():
            raise FileNotFoundError(f"Could not find intents file: {self.intents_path}")
        with self.intents_path.open("r", encoding="utf-8") as f:
            data = json.load(f)
        return data.get("intents", [])

    @staticmethod
    def _normalize(text: str) -> str:
        text = text.lower()
        text = re.sub(r"[^a-z0-9\s]", "", text)
        return text.strip()

    def _tokenize(self, text: str):
        return self._normalize(text).split()

    def _log(self, speaker: str, message: str):
        line = f"[{datetime.now().isoformat(timespec='seconds')}] {speaker}: {message}\n"
        with self.log_path.open("a", encoding="utf-8") as f:
            f.write(line)

    #  Intent Matching 

    def _score_pattern(self, user_text: str, pattern: str) -> int:
        """
        Very simple scoring:
        - +2 if pattern is a substring
        - +1 for each common token
        """
        user_norm = self._normalize(user_text)
        pat_norm = self._normalize(pattern)

        score = 0
        if pat_norm and pat_norm in user_norm:
            score += 2

        user_tokens = set(user_norm.split())
        pat_tokens = set(pat_norm.split())
        score += len(user_tokens & pat_tokens)

        return score

    def _find_best_intent(self, user_text: str):
        best_tag = None
        best_score = 0

        for intent in self.intents:
            tag = intent.get("tag")
            patterns = intent.get("patterns", [])
            for pat in patterns:
                s = self._score_pattern(user_text, pat)
                if s > best_score:
                    best_score = s
                    best_tag = tag

        # Threshold to avoid random matches
        if best_score == 0:
            return "fallback"
        return best_tag or "fallback"

    #  Dynamic Response Helpers 

    def _format_response(self, tag: str, template: str) -> str:
        """
        Insert dynamic values like {name}, {time}, {date}
        """
        if "{name}" in template:
            name = self.memory.get("name") or "my friend"
            template = template.replace("{name}", name)

        if "{time}" in template:
            now_time = datetime.now().strftime("%H:%M")
            template = template.replace("{time}", now_time)

        if "{date}" in template:
            today = datetime.now().strftime("%d %B %Y (%A)")
            template = template.replace("{date}", today)

        return template

    def _choose_response(self, tag: str) -> str:
        for intent in self.intents:
            if intent.get("tag") == tag:
                responses = intent.get("responses", [])
                if responses:
                    template = random.choice(responses)
                    return self._format_response(tag, template)
        # fallback if tag missing
        for intent in self.intents:
            if intent.get("tag") == "fallback":
                return random.choice(intent.get("responses", []))
        return "I'm not sure what to say."

    #  Public Interface 

    def set_user_name(self, name: str):
        self.memory["name"] = name

    def get_user_name(self):
        return self.memory.get("name")

    def reply(self, user_text: str) -> str:
        """
        Main entry:
        - logs user message
        - detects special commands (set name)
        - finds best intent
        - logs and returns response
        """
        user_text = user_text.strip()
        self._log("USER", user_text)

        # Special: user tells their name explicitly
        # e.g. "my name is Sasanka"
        name_match = re.search(r"\bmy name is ([a-zA-Z ]+)", user_text, re.IGNORECASE)
        if name_match:
            name = name_match.group(1).strip()
            self.set_user_name(name)
            response = f"Nice to meet you, {name}!"
            self._log("BOT", response)
            return response

        # Normal intent flow
        tag = self._find_best_intent(user_text)
        response = self._choose_response(tag)

        self._log("BOT", response)
        return response
