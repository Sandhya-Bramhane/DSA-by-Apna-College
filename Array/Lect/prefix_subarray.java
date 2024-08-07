public class prefix_subarray {

  public static void Prefix_SubArray(int arr[]) {
    
    int currentsum = 0;
    int MaxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];

    prefix[0] = arr[0];
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i-1] + arr[i];
    }

    for (int i = 0; i < arr.length; i++) {

      for (int j = i; j < arr.length; j++) {

        currentsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

        if (MaxSum < currentsum) {
          MaxSum = currentsum;
        }

      }
    }
    System.out.println("Max sum is = " + MaxSum);
  }
  public static void main(String[] args) {
    int arr[] = {1,-2 , 6, -1 , 3};
    Prefix_SubArray(arr);
  }
}
