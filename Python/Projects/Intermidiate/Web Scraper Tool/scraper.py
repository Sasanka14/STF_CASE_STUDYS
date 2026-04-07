# scraper.py

"""
scraper.py
----------
Responsible for:
- Making HTTP GET requests
- Handling timeouts and errors
- Returning HTML text safely
"""

from typing import Optional
import requests


DEFAULT_HEADERS = {
    "User-Agent": "SasankaWebScraper/1.0 (+https://example.com)"
}


def fetch_html(url: str, timeout: int = 10) -> Optional[str]:
    """
    Fetch HTML content from the given URL.
    Returns HTML text or None if there is an error.
    """
    try:
        resp = requests.get(url, headers=DEFAULT_HEADERS, timeout=timeout)
        resp.raise_for_status()
        return resp.text
    except requests.exceptions.RequestException as e:
        print(f"[ERROR] Failed to fetch {url}: {e}")
        return None