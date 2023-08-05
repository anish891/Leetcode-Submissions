public class BiweeklyContest(AccountBalanceAfterPurchase) {
    int initialBalance = 100;
int roundedAmount = (purchaseAmount + 5) / 10 * 10;

        // Subtract the rounded purchase amount from the initial balance
        int remainingBalance = initialBalance - roundedAmount;

        return remainingBalance;
}
