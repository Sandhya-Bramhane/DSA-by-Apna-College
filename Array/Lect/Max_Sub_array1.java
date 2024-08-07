public class Max_Sub_array1 {

  public static int MaximumSum(int arr[]) {
    int n = arr.length;
    int sum = 0;

    int MaxSum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        
        if (arr[j] > MaxSum) {
          MaxSum = arr[j];
          MaxSum = MaxSum + arr[j];
        }
      }
    }
    return MaxSum;
  }
  public static void main(String[] args) {
    int arr[] = {2,3,6,3};
    System.out.println(MaximumSum(arr));
  }
}
