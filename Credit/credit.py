from cs50 import get_int

# Prompt user for card number
while True:
    card = get_int("Card: ")
    if card > 0:
        break

# Luhn's Algorithm to validate the card number
def luhn_checksum(card):
    def digits_of(n):
        return [int(d) for d in str(n)]
    digits = digits_of(card)
    odd_digits = digits[-1::-2]
    even_digits = digits[-2::-2]
    checksum = sum(odd_digits)
    for d in even_digits:
        checksum += sum(digits_of(d * 2))
    return checksum % 10

# Get card length
length = len(str(card))

# Identify card type based on starting digits and length
def identify_card(card):
    card_str = str(card)
    if length == 15 and (card_str.startswith('34') or card_str.startswith('37')):
        return "AMEX"
    elif length == 16 and 51 <= int(card_str[:2]) <= 55:
        return "MASTERCARD"
    elif (length == 13 or length == 16) and card_str.startswith('4'):
        return "VISA"
    else:
        return "INVALID"

# Validate the card using Luhn's algorithm and print the card type
if luhn_checksum(card) == 0:
    print(identify_card(card))
else:
    print("INVALID")
