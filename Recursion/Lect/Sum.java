public class Sum {
  public static int sum_Elem(int n) {
    
    if (n == 1) {
      return 1;
    }

    int summinone = sum_Elem(n-1);
    int Totalsum = n + summinone;

    return Totalsum;
  }
  public static void main(String[] args) {
    int n = 5;
    System.out.println(sum_Elem(n));
  }
}
