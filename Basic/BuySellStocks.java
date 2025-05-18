public class BuySellStocks {

    public static int maxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] > buyPrice) { // if profit available
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice); // here prices[i] gives selling price
            } else {
                buyPrice = prices[i]; // here prices[i] is the buying price for future selling
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices));
    }
}
