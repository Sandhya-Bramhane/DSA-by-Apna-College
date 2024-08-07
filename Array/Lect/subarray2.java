public class subarray2 {

  public static void SubArray(int arr[]) {

    int Max = Integer.MIN_VALUE;
    int Min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {

        for (int k = i; k <= j; k++) {
          
          System.out.print(arr[k]+ " ");

          sum = sum + arr[k];
        }
        System.out.println(" => "+ sum);

        if (sum > Max) {
          Max = sum;
        }
        if (sum < Min) {
          Min = sum;
        }
      }
      System.out.println();

    }

    System.out.println("Max Sum of array : "+ Max);
    System.out.println("Min Sum of array : "+ Min);
  }
  public static void main(String[] args) {
    int arr[]= {2,3,6,3};
    SubArray(arr);
  }
}
