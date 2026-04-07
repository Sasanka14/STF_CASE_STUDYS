# models.py

"""
models.py
---------
Defines the structure and validation for a Note object.
"""

from dataclasses import dataclass, asdict
from typing import Optional, Dict, Any
import time


@dataclass
class Note:
    id: int
    title: str
    content: str
    created_at: float
    updated_at: float

    def to_dict(self) -> Dict[str, Any]:
        return asdict(self)


def validate_note_payload(data: Dict[str, Any], partial: bool = False) -> Dict[str, str]:
    """
    Validate incoming JSON for note create/update.
    - partial=True means it's allowed to miss fields (for PATCH-like behavior).
    Returns dict of errors (field -> message). Empty dict means valid.
    """
    errors: Dict[str, str] = {}

    if not partial:
        # For full create / full update
        if "title" not in data or not str(data["title"]).strip():
            errors["title"] = "Title is required."
        if "content" not in data or not str(data["content"]).strip():
            errors["content"] = "Content is required."
    else:
        # For partial update
        if "title" in data and not str(data["title"]).strip():
            errors["title"] = "Title cannot be empty."
        if "content" in data and not str(data["content"]).strip():
            errors["content"] = "Content cannot be empty."

    return errors


def create_note_object(note_id: int, title: str, content: str) -> Note:
    now = time.time()
    return Note(
        id=note_id,
        title=title.strip(),
        content=content.strip(),
        created_at=now,
        updated_at=now,
    )
