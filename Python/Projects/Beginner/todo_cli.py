# todo_cli.py

"""
Concepts:
- lists & dicts
- JSON file I/O
- separating logic into functions
"""

import json
from pathlib import Path

TASKS_FILE = Path("/Users/zoro/Developer/Python/Projects/Beginner/tasks.json")


def load_tasks():
    if not TASKS_FILE.exists():
        return []
    with TASKS_FILE.open("r", encoding="utf-8") as f:
        return json.load(f)


def save_tasks(tasks):
    with TASKS_FILE.open("w", encoding="utf-8") as f:
        json.dump(tasks, f, indent=2)


def list_tasks(tasks):
    if not tasks:
        print("No tasks.")
        return
    for idx, t in enumerate(tasks, start=1):
        status = "✓" if t["done"] else "✗"
        print(f"{idx}. [{status}] {t['title']}")


def main():
    tasks = load_tasks()

    while True:
        print("\n=== To-Do List ===")
        print("1. Add task")
        print("2. List tasks")
        print("3. Mark task as done")
        print("4. Delete task")
        print("5. Exit")

        choice = input("Choose: ").strip()

        if choice == "1":
            title = input("Task title: ").strip()
            if title:
                tasks.append({"title": title, "done": False})
                save_tasks(tasks)
                print("Task added.")
        elif choice == "2":
            list_tasks(tasks)
        elif choice == "3":
            list_tasks(tasks)
            try:
                idx = int(input("Task number to mark done: "))
                tasks[idx - 1]["done"] = True
                save_tasks(tasks)
                print("Marked as done.")
            except (ValueError, IndexError):
                print("Invalid task number.")
        elif choice == "4":
            list_tasks(tasks)
            try:
                idx = int(input("Task number to delete: "))
                removed = tasks.pop(idx - 1)
                save_tasks(tasks)
                print(f"Deleted: {removed['title']}")
            except (ValueError, IndexError):
                print("Invalid task number.")
        elif choice == "5":
            print("Goodbye.")
            break
        else:
            print("Invalid option.")


if __name__ == "__main__":
    main()
