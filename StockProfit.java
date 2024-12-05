public class StockProfit {
    
        public static int maxProfit(int[] prices) {
            int n = prices.length;
            if (n == 0) return 0;
    
            int maxProfit = 0;
    
            // Traverse through the array
            for (int i = 1; i < n; i++) {
                // Add to the profit if the stock price goes up
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }
    
            return maxProfit;
        }
    
        public static void main(String[] args) {
            int[] prices = {100, 180, 260, 310, 40, 535, 695};
            int result = maxProfit(prices);
            System.out.println("Maximum Profit: " + result);
        }
    }
    
    

