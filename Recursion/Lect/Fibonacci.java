/**
 * Fibonacci
 */
public class Fibonacci {

  public static int SumFibo(int n) {
    
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    int fibominone = SumFibo(n-1);
    int fibomintwo = SumFibo(n-2);
    
    int fibo = fibominone + fibomintwo;

    return fibo;


  }
  public static void main(String[] args) {
    int n = 27;
    System.out.println(SumFibo(n));
  }
}