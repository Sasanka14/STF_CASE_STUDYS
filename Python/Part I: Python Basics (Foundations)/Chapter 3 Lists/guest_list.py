# guest_list.py
# Invite 3 friends for dinner, then change one guest and reprint.
guests = ["Panda", "Arjun", "Riya"]

# Original invitations
print("Original Invitations:")
for guest in guests:
    print(f"Dear {guest}, you are invited to dinner.")

# One guest can't make it
print("\nOh no! Arjun can't make it.")

# Replace guest
guests[1] = "Ankita"

# New invitations
print("\nUpdated Invitations:")
for guest in guests:
    print(f"Dear {guest}, you are invited to dinner.")
