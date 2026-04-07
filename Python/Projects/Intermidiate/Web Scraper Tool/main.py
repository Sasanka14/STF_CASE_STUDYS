# main.py

"""
main.py
-------
Entry point for the Intermediate Web Scraper Tool.

Features:
1. Scrape all <h2> titles from a page.
2. Scrape article links (title + URL) from <h2><a>.
3. Scrape all <p> text and save line-by-line to a .txt file.
4. Download all images on a page into an images/ folder.

Usage:
    python main.py

Then follow the on-screen menu.
"""

from typing import Optional
from scraper import fetch_html
from parser import (
    parse_h2_titles,
    parse_article_links,
    parse_paragraphs,
    parse_image_sources,
)
from storage import (
    save_lines_to_text,
    save_articles_to_csv,
    download_images,
)


def prompt_url() -> str:
    url = input("Enter URL: ").strip()
    return url


def ensure_html(url: str) -> Optional[str]:
    html = fetch_html(url)
    if html is None:
        print("[ERROR] Could not fetch HTML. Returning to menu.")
    return html


def action_titles():
    print("\n[1] Scrape <h2> Titles")
    url = prompt_url()
    html = ensure_html(url)
    if not html:
        return

    titles = parse_h2_titles(html)
    if not titles:
        print("[INFO] No <h2> titles found.")
        return

    print(f"[INFO] Found {len(titles)} titles:")
    for i, t in enumerate(titles, start=1):
        print(f"  {i}. {t}")

    choice = input("\nSave to file? (y/n): ").strip().lower()
    if choice == "y":
        filename = input("Enter filename (e.g., data/titles.txt): ").strip() or "data/titles.txt"
        save_lines_to_text(titles, filename)


def action_articles():
    print("\n[2] Scrape Article Links from <h2><a>")
    url = prompt_url()
    html = ensure_html(url)
    if not html:
        return

    articles = parse_article_links(html)
    if not articles:
        print("[INFO] No article links found in <h2><a>.")
        return

    print(f"[INFO] Found {len(articles)} articles:")
    for i, art in enumerate(articles, start=1):
        print(f"  {i}. {art['title']} -> {art['url']}")

    choice = input("\nSave to CSV? (y/n): ").strip().lower()
    if choice == "y":
        filename = input("Enter filename (e.g., data/articles.csv): ").strip() or "data/articles.csv"
        save_articles_to_csv(articles, filename)


def action_paragraphs():
    print("\n[3] Scrape Paragraph Text (<p>)")
    url = prompt_url()
    html = ensure_html(url)
    if not html:
        return

    paragraphs = parse_paragraphs(html)
    if not paragraphs:
        print("[INFO] No <p> tags with text found.")
        return

    print(f"[INFO] Found {len(paragraphs)} paragraphs.")
    preview = input("Show first 5 lines? (y/n): ").strip().lower()
    if preview == "y":
        for i, p in enumerate(paragraphs[:5], start=1):
            print(f"{i}. {p}")

    filename = input("\nEnter filename to save (e.g., data/content.txt): ").strip() or "data/content.txt"
    save_lines_to_text(paragraphs, filename)


def action_images():
    print("\n[4] Download All Images")
    url = prompt_url()
    html = ensure_html(url)
    if not html:
        return

    srcs = parse_image_sources(html)
    if not srcs:
        print("[INFO] No <img> tags found.")
        return

    print(f"[INFO] Found {len(srcs)} <img> tags.")
    folder = input("Enter folder name to save images (default: images): ").strip() or "images"
    download_images(srcs, base_url=url, folder=folder)


def main():
    while True:
        print("\n=============================")
        print("  Intermediate Web Scraper  ")
        print("=============================")
        print("1. Scrape <h2> Titles")
        print("2. Scrape Article Links (<h2><a>)")
        print("3. Scrape Paragraph Text (<p>)")
        print("4. Download Images")
        print("5. Exit")

        choice = input("Select an option (1–5): ").strip()

        if choice == "1":
            action_titles()
        elif choice == "2":
            action_articles()
        elif choice == "3":
            action_paragraphs()
        elif choice == "4":
            action_images()
        elif choice == "5":
            print("Exiting. Stay curious, keep scraping.")
            break
        else:
            print("[WARN] Invalid choice. Please try again.")


if __name__ == "__main__":
    main()
