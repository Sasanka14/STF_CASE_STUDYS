# parser.py

"""
parser.py
---------
Responsible for:
- Parsing HTML using BeautifulSoup
- Extracting titles, links, paragraphs, images
"""

from typing import List, Dict
from bs4 import BeautifulSoup


def parse_h2_titles(html: str) -> List[str]:
    """
    Extract all <h2> texts from the HTML.
    """
    soup = BeautifulSoup(html, "html.parser")
    titles = []
    for h2 in soup.find_all("h2"):
        text = h2.get_text(strip=True)
        if text:
            titles.append(text)
    return titles


def parse_article_links(html: str) -> List[Dict[str, str]]:
    """
    Example: Find all <a> tags inside <h2> that look like article links.
    Returns a list of { 'title': ..., 'url': ... }
    """
    soup = BeautifulSoup(html, "html.parser")
    articles = []

    for h2 in soup.find_all("h2"):
        a = h2.find("a")
        if a and a.get("href"):
            title = a.get_text(strip=True)
            url = a["href"]
            if title:
                articles.append({"title": title, "url": url})
    return articles


def parse_paragraphs(html: str) -> List[str]:
    """
    Extract line-by-line text from <p> tags.
    """
    soup = BeautifulSoup(html, "html.parser")
    paragraphs = []
    for p in soup.find_all("p"):
        text = p.get_text(strip=True)
        if text:
            paragraphs.append(text)
    return paragraphs


def parse_image_sources(html: str) -> List[str]:
    """
    Extract all image src attributes found in the page.
    Does not resolve relative URLs; that is handled in storage.py.
    """
    soup = BeautifulSoup(html, "html.parser")
    srcs = []
    for img in soup.find_all("img"):
        src = img.get("src")
        if src:
            srcs.append(src)
    return srcs
