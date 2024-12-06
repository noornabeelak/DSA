public class maximumProfit {
    
        public int maxProfit(int[] prices) {
            if(prices==null || prices.length<2){
                return 0;
            }
            
            int lowest=prices[0];
            int maxProfit=0;
            int n=prices.length;
            
            for(int i = 0;i<n;i++){
                if(prices[i]<lowest){
                    lowest=prices[i];
                }
                else{
                    int currProfit=prices[i]-lowest;
                    if(currProfit>maxProfit){
                        maxProfit=currProfit;
                        
                    }
                }
            }
            
            return maxProfit;
                
            }

            public static void main(String[] args) {
                maximumProfit calculator = new maximumProfit();
                int[] prices = {7, 1, 5, 3, 6, 4};
                int maxProfit = calculator.maxProfit(prices);
                System.out.println("Maximum Profit: " + maxProfit); // Expected Output: 5
            }
        
}
