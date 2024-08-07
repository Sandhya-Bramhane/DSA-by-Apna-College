public class Buy_Sell_II {

    public static int BuysellII(int prices[]) {
        int totalProfit = 0;

        // Iterate through the prices array
        for (int i = 1; i < prices.length; i++) {
            // If today's price is higher than yesterday's, calculate the profit
            if (prices[i] > prices[i - 1]) {
                totalProfit = totalProfit + prices[i] - prices[i - 1];
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Total Profit = " + BuysellII(prices)); // Expected output: Total Profit = 7
    }
}

/* 
Detailed Explanation Using Elements

Day 1 to Day 2:

Price on Day 1: 7, Price on Day 2: 1
No profit as 1 < 7.

Day 2 to Day 3:

Price on Day 2: 1, Price on Day 3: 5
Profit: 5 - 1 = 4
Add profit to totalProfit: 0 + 4 = 4.

Day 3 to Day 4:

Price on Day 3: 5, Price on Day 4: 3
No profit as 3 < 5.

Day 4 to Day 5:

Price on Day 4: 3, Price on Day 5: 6
Profit: 6 - 3 = 3
Add profit to totalProfit: 4 + 3 = 7.

Day 5 to Day 6:

Price on Day 5: 6, Price on Day 6: 4
No profit as 4 < 6.
Result
Total profit after all profitable transactions: 7.

*/