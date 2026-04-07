# storage.py

"""
storage.py
----------
Responsible for:
- Saving text lines to a .txt file
- Saving structured data (articles) to CSV
- Downloading images to a folder
"""

from typing import List, Dict
from pathlib import Path
from urllib.parse import urljoin, urlparse
import csv
import os
import requests


def save_lines_to_text(lines: List[str], filepath: str) -> None:
    """
    Save a list of strings, one per line, to a text file.
    """
    path = Path(filepath)
    path.parent.mkdir(parents=True, exist_ok=True)

    with path.open("w", encoding="utf-8") as f:
        for line in lines:
            f.write(line + "\n")

    print(f"[INFO] Saved {len(lines)} lines to {path}")


def save_articles_to_csv(articles: List[Dict[str, str]], filepath: str) -> None:
    """
    Save a list of {title, url} dicts into a CSV file.
    """
    path = Path(filepath)
    path.parent.mkdir(parents=True, exist_ok=True)

    with path.open("w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=["title", "url"])
        writer.writeheader()
        for art in articles:
            writer.writerow(art)

    print(f"[INFO] Saved {len(articles)} articles to {path}")


def _guess_filename_from_url(url: str, index: int) -> str:
    """
    Try to guess a filename for an image from its URL.
    If not possible, fallback to 'image_<index>.jpg'.
    """
    parsed = urlparse(url)
    name = os.path.basename(parsed.path)
    if not name:
        name = f"image_{index}.jpg"
    return name


def download_images(image_srcs: List[str], base_url: str, folder: str = "images") -> None:
    """
    Download images from the list of srcs.
    - base_url is used to resolve relative paths.
    - folder is the local folder where images are saved.
    """
    out_dir = Path(folder)
    out_dir.mkdir(parents=True, exist_ok=True)

    count = 0
    for idx, src in enumerate(image_srcs, start=1):
        # Resolve relative URLs
        img_url = urljoin(base_url, src)

        try:
            resp = requests.get(img_url, timeout=10)
            resp.raise_for_status()

            filename = _guess_filename_from_url(img_url, idx)
            filepath = out_dir / filename

            with filepath.open("wb") as f:
                f.write(resp.content)

            count += 1
            print(f"[IMG] Saved {filepath}")
        except Exception as e:
            print(f"[ERROR] Failed to download {img_url}: {e}")

    print(f"[INFO] Downloaded {count} images into '{out_dir}'")
