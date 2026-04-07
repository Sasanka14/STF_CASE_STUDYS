# ai.py

import random
from board import Board

HUMAN = "X"
AI = "O"


# ---------- Minimax Core (Hard Mode) ----------

def minimax(board: Board, is_maximizing: bool, depth: int):
    """
    Minimax algorithm:
    - board: current board state
    - is_maximizing: True if it's AI's turn, False if human's turn
    - depth: depth of recursion (used to prefer faster wins, slower losses)
    Returns: (score, best_move)
    """
    # Terminal states
    if board.check_winner(AI):
        return 10 - depth, None  # AI wins
    if board.check_winner(HUMAN):
        return depth - 10, None  # Human wins
    if board.is_full():
        return 0, None           # Draw

    if is_maximizing:
        best_score = float("-inf")
        best_move = None

        for (row, col) in board.available_moves():
            new_board = board.clone()
            new_board.place_mark(row, col, AI)
            score, _ = minimax(new_board, False, depth + 1)

            if score > best_score:
                best_score = score
                best_move = (row, col)

        return best_score, best_move

    else:
        best_score = float("inf")
        best_move = None

        for (row, col) in board.available_moves():
            new_board = board.clone()
            new_board.place_mark(row, col, HUMAN)
            score, _ = minimax(new_board, True, depth + 1)

            if score < best_score:
                best_score = score
                best_move = (row, col)

        return best_score, best_move


# ---------- Difficulty Strategies ----------

def easy_move(board: Board):
    """Random move – easy to beat."""
    return random.choice(board.available_moves())


def medium_move(board: Board):
    """
    Medium difficulty:
    1. If AI can win in one move → win.
    2. Else if human can win in one move → block.
    3. Else random move.
    """
    # 1. AI winning move
    for (row, col) in board.available_moves():
        temp = board.clone()
        temp.place_mark(row, col, AI)
        if temp.check_winner(AI):
            return row, col

    # 2. Block human winning move
    for (row, col) in board.available_moves():
        temp = board.clone()
        temp.place_mark(row, col, HUMAN)
        if temp.check_winner(HUMAN):
            return row, col

    # 3. Otherwise random
    return random.choice(board.available_moves())


def hard_move(board: Board):
    """
    Hard difficulty:
    Perfect play using Minimax. Very hard to beat.
    Includes an opening optimization: take center if free.
    """
    # Opening optimization
    if board.cells[1][1] == " ":
        return 1, 1

    _, best_move = minimax(board, True, 0)
    return best_move


def get_ai_move(board: Board, difficulty: str):
    """
    Public function used by main.py
    difficulty: 'easy' | 'medium' | 'hard'
    """
    difficulty = difficulty.lower()
    if difficulty == "easy":
        return easy_move(board)
    elif difficulty == "medium":
        return medium_move(board)
    else:
        # default to hard
        return hard_move(board)
