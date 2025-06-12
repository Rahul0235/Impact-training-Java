public class buySellStock {
    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                
                if(prices[i] < prices[j]){
                    buy = prices[i];
                    return buy;
                }
                
                for(int k=buy+1; k<prices.length; k++){
                if(prices[k] > prices[k+1]){
                    sell = prices[k];
                    return sell;
                    }
                }
            }
        }
        int profit = sell-buy;
        System.out.print(profit);
        return profit;
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.print(maxProfit(prices));
    }
}

