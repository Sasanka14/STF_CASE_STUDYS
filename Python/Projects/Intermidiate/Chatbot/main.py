from chatbot_engine import Chatbot


BANNER = r"""
        PYTHON INTERMEDIATE CHATBOT
Type 'exit', 'quit' or 'bye' to leave.
You can also say 'my name is ...' so I remember you.
"""


def main():
    bot = Chatbot(intents_path="intents.json", log_path="chat_log.txt")
    print(BANNER)

    # Greeting
    print("Bot: Hello! Jarvis. What would you like to talk about?")

    while True:
        try:
            user = input("You: ").strip()
        except (EOFError, KeyboardInterrupt):
            print("\nBot: Goodbye. See you soon.")
            break

        if not user:
            continue

        if user.lower() in ("exit", "quit", "bye"):
            print("Bot: Goodbye! Stay disciplined.")
            break

        # If user asks directly for stored name and none is set, handle gently
        if "what is my name" in user.lower() and bot.get_user_name() is None:
            print("Bot: I don't know your name yet. You can say 'my name is ...'")
            continue

        reply = bot.reply(user)
        print(f"Bot: {reply}")


if __name__ == "__main__":
    main()
