
public class buy_sell {

  public static int SellandBuy(int price[]) {

   int Buy_value = Integer.MAX_VALUE;
   int MaxProfit = 0;

   for (int i = 0; i < price.length; i++) {
    
      if (Buy_value < price[i]) {

        int profit = price[i] - Buy_value;

        MaxProfit = Math.max(MaxProfit, profit);
      }
      else{
        Buy_value = price[i];
      }

   }

    return MaxProfit;
  }
  public static void main(String[] args) {
    int price[] = {7,1,5,3,6,4};
 System.out.println(SellandBuy(price));
  }
  
}