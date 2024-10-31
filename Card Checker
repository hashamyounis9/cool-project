#include <stdbool.h>
#include <stdio.h>
#include <string.h>

bool isValidCardNumber(const char *cardNumber);
bool isAmericanExpress(const char *cardNumber);
bool isMasterCard(const char *cardNumber);
bool isVisa(const char *cardNumber);

int main()
{
    char cardNumber[20];
    printf("Enter the credit card number: ");
    scanf("%s", cardNumber);

    if (isValidCardNumber(cardNumber))
    {
        printf("The credit card number is valid.\n");
        if (isAmericanExpress(cardNumber))
        {
            printf("It's an American Express card.\n");
        }
        else if (isMasterCard(cardNumber))
        {
            printf("It's a MasterCard.\n");
        }
        else if (isVisa(cardNumber))
        {
            printf("It's a Visa card.\n");
        }
        else
        {
            printf("It's a different type of card.\n");
        }
    }
    else
    {
        printf("The credit card number is invalid.\n");
    }

    return 0;
}

bool isValidCardNumber(const char *cardNumber)
{
    int sum = 0;
    bool alternate = false;
    int length = strlen(cardNumber);

    for (int i = length - 1; i >= 0; i--)
    {
        int n = cardNumber[i] - '0';
        if (alternate)
        {
            n *= 2;
            if (n > 9)
            {
                n -= 9;
            }
        }
        sum += n;
        alternate = !alternate;
    }

    return (sum % 10 == 0);
}

bool isAmericanExpress(const char *cardNumber)
{
    return (strlen(cardNumber) == 15) && (cardNumber[0] == '3') &&
           (cardNumber[1] == '4' || cardNumber[1] == '7');
}

bool isMasterCard(const char *cardNumber)
{
    return (strlen(cardNumber) == 16) && (cardNumber[0] == '5') &&
           (cardNumber[1] >= '1' && cardNumber[1] <= '5');
}

bool isVisa(const char *cardNumber)
{
    int length = strlen(cardNumber);
    return (length == 13 || length == 16) && (cardNumber[0] == '4');
}
