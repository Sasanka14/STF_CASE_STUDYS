# basic_web_scraper.py

"""
Concepts:
- requests for HTTP
- BeautifulSoup for HTML parsing
- for loops & list building
"""

import requests
from bs4 import BeautifulSoup


def fetch_titles(url):
    resp = requests.get(url, timeout=10)
    resp.raise_for_status()

    soup = BeautifulSoup(resp.text, "html.parser")
    titles = []

    for h2 in soup.find_all("h2"):
        text = h2.get_text(strip=True)
        if text:
            titles.append(text)
    return titles


def main():
    print("=== Basic Web Scraper ===")
    url = input("Enter a URL to scrape (e.g. a blog or news site): ").strip()
    try:
        titles = fetch_titles(url)
        if not titles:
            print("No <h2> titles found.")
        else:
            print(f"Found {len(titles)} titles:\n")
            for i, t in enumerate(titles, start=1):
                print(f"{i}. {t}")
    except Exception as e:
        print("Error while scraping:", e)


if __name__ == "__main__":
    main()
