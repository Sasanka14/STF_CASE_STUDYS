# app.py

"""
app.py
------
RESTful API for Notes.

Endpoints:
- GET    /notes            -> list notes
- GET    /notes/<id>       -> single note
- POST   /notes            -> create note
- PUT    /notes/<id>       -> full update
- DELETE /notes/<id>       -> delete note
"""

from flask import Flask, jsonify, request
from typing import Any, Dict

from storage import (
    get_all_notes,
    get_note_by_id,
    create_note,
    update_note,
    delete_note,
)
from models import validate_note_payload

app = Flask(__name__)


def _error(message: str, status: int = 400):
    return jsonify({"error": message}), status


@app.get("/notes")
def list_notes():
    notes = get_all_notes()
    return jsonify(notes), 200


@app.get("/notes/<int:note_id>")
def get_note(note_id: int):
    note = get_note_by_id(note_id)
    if not note:
        return _error("Note not found.", 404)
    return jsonify(note), 200


@app.post("/notes")
def create_note_endpoint():
    if not request.is_json:
        return _error("Request body must be JSON.")

    data: Dict[str, Any] = request.get_json()
    errors = validate_note_payload(data, partial=False)
    if errors:
        return jsonify({"errors": errors}), 400

    title = data["title"]
    content = data["content"]

    note = create_note(title, content)
    return jsonify(note), 201


@app.put("/notes/<int:note_id>")
def update_note_endpoint(note_id: int):
    if not request.is_json:
        return _error("Request body must be JSON.")

    data: Dict[str, Any] = request.get_json()
    errors = validate_note_payload(data, partial=False)
    if errors:
        return jsonify({"errors": errors}), 400

    title = data["title"]
    content = data["content"]

    updated = update_note(note_id, title, content)
    if not updated:
        return _error("Note not found.", 404)

    return jsonify(updated), 200


@app.delete("/notes/<int:note_id>")
def delete_note_endpoint(note_id: int):
    ok = delete_note(note_id)
    if not ok:
        return _error("Note not found.", 404)
    return jsonify({"message": "Note deleted."}), 200


@app.get("/")
def root():
    return jsonify(
        {
            "message": "Notes REST API running.",
            "endpoints": [
                "GET    /notes",
                "GET    /notes/<id>",
                "POST   /notes",
                "PUT    /notes/<id>",
                "DELETE /notes/<id>",
            ],
        }
    )


if __name__ == "__main__":
    # Debug server (development only)
    app.run(debug=True)
