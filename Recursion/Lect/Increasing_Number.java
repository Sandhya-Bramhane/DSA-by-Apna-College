/**
 * Increasing_Number
 */
public class Increasing_Number {

  public static void Inc_Order(int n) {
    
   if (n == 1) {
    System.out.print(1+" ");
    return;
   }
   
   Inc_Order(n-1);
   System.out.print(n+" ");


  }


  public static void main(String[] args) {
    int n = 10;
    Inc_Order(n);
  }
}