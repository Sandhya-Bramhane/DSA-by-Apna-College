/**
 * buy_sell_stock
 */
public class buy_sell_stock {

  public static int BuyAndSell(int prices[]) {
  
    int BuyPrices = Integer.MAX_VALUE;
    int MaxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      
      if (BuyPrices <= prices[i]) {
        int Profit = prices[i] - BuyPrices;
        MaxProfit = Math.max(MaxProfit, Profit);
        return MaxProfit;
      }
      else{
        BuyPrices = prices[i];
      }
    }
     
  return 0;
    
  }
  public static void main(String[] args) {
    int prices[] = {7,1,5,3,6,4};
    System.out.println(BuyAndSell(prices));
  }
}