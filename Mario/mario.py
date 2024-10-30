from cs50 import get_int

# Prompt user for a valid height between 1 and 8 inclusive
while True:
    n = get_int("Height: ")
    if n > 0 and n < 9:
        break

# Print the pyramid
for i in range(n):
    # Print leading spaces
    for j in range(n - i - 1):
        print(" ", end="")

    # Print left-side hashes
    for j in range(i + 1):
        print("#", end="")

    # Print gap
    print("  ", end="")

    # Print right-side hashes
    for j in range(i + 1):
        print("#", end="")

    # Move to the next line after each row
    print()
