# easy_text_adventure.py

"""
Concepts:
- dictionaries
- while loop (game loop)
- simple Player class
- basic inventory
- if/elif command handling
"""

class Player:
    def __init__(self, start_room: str):
        self.current_room = start_room
        self.inventory = []

    def move(self, direction: str, rooms: dict):
        room = rooms[self.current_room]
        exits = room["exits"]

        if direction in exits:
            self.current_room = exits[direction]
            print(f"You move {direction}.")
        else:
            print("You can't go that way.")


ROOMS = {
    "start": {
        "description": "You are in a small room. There is a door to the SOUTH and a passage to the EAST.",
        "exits": {"south": "door_room", "east": "key_room"},
        "items": []
    },
    "key_room": {
        "description": "This room is empty… except for a shiny key on the floor.",
        "exits": {"west": "start"},
        "items": ["key"]
    },
    "door_room": {
        "description": "You are in front of a locked door. This looks like the exit.",
        "exits": {"north": "start"},
        "items": []
    },
}


def show_help():
    print("""
Commands:
  north / south / east / west - move
  take <item>                 - pick up an item
  inventory                   - show what you have
  open door                   - try to open the door (in door room)
  help                        - show this help
  quit                        - exit the game
""")


def show_room(player: Player):
    room = ROOMS[player.current_room]
    print(f"\n== {player.current_room.upper()} ==")
    print(room["description"])
    if room["items"]:
        print("You see:", ", ".join(room["items"]))


def main():
    print("=== Simple Escape Game ===")
    print("Goal: find the key and open the door to escape.\n")

    player = Player(start_room="start")
    has_won = False

    show_help()

    while not has_won:
        show_room(player)
        command = input("\n> ").strip().lower()

        if not command:
            continue

        # Movement
        if command in ("north", "south", "east", "west"):
            player.move(command, ROOMS)

        elif command.startswith("take "):
            item = command.split(" ", 1)[1]
            room_items = ROOMS[player.current_room]["items"]

            if item in room_items:
                room_items.remove(item)
                player.inventory.append(item)
                print(f"You take the {item}.")
            else:
                print("No such item here.")

        elif command == "inventory":
            print("Inventory:", player.inventory or "empty")

        elif command == "open door":
            if player.current_room != "door_room":
                print("There is no door here.")
            elif "key" not in player.inventory:
                print("The door is locked. You need a key.")
            else:
                print("You use the key, open the door, and escape. You win!")
                has_won = True

        elif command == "help":
            show_help()

        elif command in ("quit", "exit"):
            print("You stop trying to escape and sit down. Game over.")
            break

        else:
            print("Unknown command. Type 'help' to see commands.")

    print("Thanks for playing.")


if __name__ == "__main__":
    main()
