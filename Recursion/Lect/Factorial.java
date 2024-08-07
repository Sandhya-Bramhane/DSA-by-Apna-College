public class Factorial {
  public static int facto(int n) {
    
  if (n == 0) {
    return 1;
  }

    int factminone = facto(n-1);
    int factorial =  n * (factminone);
    return factorial;
  }
  public static void main(String[] args) {
    int n = 5;
    System.out.println(facto(n));
  }
}
