
public class L_Buy_sell_stock {

  public static int buysellstock(int price[]) {
    

  int BuyPrice = Integer.MAX_VALUE;
  int MaxProfit = 0;


  for (int i = 0; i<price.length; i++) {
    
    if (BuyPrice < price[i]) {
      
      int profit = price[i] - BuyPrice;
      MaxProfit = Math.max(MaxProfit, profit);
    }
    else{
      BuyPrice = price[i];
    }
  }
  return MaxProfit;
  }
public static void main(String[] args) {
  int price[] = {7,1,5,3,6,4};
  System.out.println(buysellstock(price));
}
  
}