# storage.py

"""
storage.py
----------
Handles:
- Loading/saving JSON to notes_data.json
- CRUD operations on notes list in memory
"""

from pathlib import Path
from typing import List, Dict, Optional
import json
import time

from models import Note, create_note_object


BASE_DIR = Path(__file__).parent
DATA_FILE = BASE_DIR / "notes_data.json"


def _init_data_file():
    """
    Ensure the data file exists with demo notes on first run.
    """
    if DATA_FILE.exists():
        return

    demo_data = {
        "next_id": 4,
        "notes": [
            {
                "id": 1,
                "title": "Welcome to Notes API",
                "content": "This is a demo note created automatically when the server starts.",
                "created_at": 0,
                "updated_at": 0
            },
            {
                "id": 2,
                "title": "How to use this API",
                "content": "Use POST /notes to create, GET /notes to read, PUT to update, and DELETE to remove notes.",
                "created_at": 0,
                "updated_at": 0
            },
            {
                "id": 3,
                "title": "Persistence Enabled",
                "content": "Notes are stored in a local JSON file. Restarting the server will not erase them.",
                "created_at": 0,
                "updated_at": 0
            }
        ]
    }

    DATA_FILE.write_text(
        json.dumps(demo_data, indent=2),
        encoding="utf-8"
    )



def _load_data() -> Dict:
    _init_data_file()
    raw = DATA_FILE.read_text(encoding="utf-8")
    try:
        data = json.loads(raw)
    except json.JSONDecodeError:
        # Reset if corrupted
        data = {"next_id": 1, "notes": []}
    return data


def _save_data(data: Dict) -> None:
    DATA_FILE.write_text(json.dumps(data, indent=2), encoding="utf-8")


def get_all_notes() -> List[Dict]:
    data = _load_data()
    return data.get("notes", [])


def get_note_by_id(note_id: int) -> Optional[Dict]:
    data = _load_data()
    for note in data.get("notes", []):
        if note["id"] == note_id:
            return note
    return None


def create_note(title: str, content: str) -> Dict:
    data = _load_data()
    next_id = data.get("next_id", 1)

    note_obj: Note = create_note_object(next_id, title, content)
    data.setdefault("notes", []).append(note_obj.to_dict())
    data["next_id"] = next_id + 1

    _save_data(data)
    return note_obj.to_dict()


def update_note(note_id: int, title: str, content: str) -> Optional[Dict]:
    data = _load_data()
    notes = data.get("notes", [])
    updated_note = None

    for n in notes:
        if n["id"] == note_id:
            n["title"] = title.strip()
            n["content"] = content.strip()
            n["updated_at"] = time.time()
            updated_note = n
            break

    if updated_note is None:
        return None

    _save_data(data)
    return updated_note


def delete_note(note_id: int) -> bool:
    data = _load_data()
    notes = data.get("notes", [])
    new_notes = [n for n in notes if n["id"] != note_id]

    if len(new_notes) == len(notes):
        # No deletion happened
        return False

    data["notes"] = new_notes
    _save_data(data)
    return True
