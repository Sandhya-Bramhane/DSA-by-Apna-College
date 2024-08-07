public class LastZero {

  public static void moveZeroes(int[] arr) {
      int n = arr.length;
      int lastNonZeroFoundAt = 0; // position to place the next non-zero element

      // Move all non-zero elements to the front of the array
      for (int i = 0; i < n; i++) {
          if (arr[i] != 0) {
              arr[lastNonZeroFoundAt++] = arr[i];
          }
      }

      // Fill the remaining positions with zeroes
      for (int i = lastNonZeroFoundAt; i < n; i++) {
          arr[i] = 0;
      }
  }

  public static void main(String[] args) {
      int arr[] = {0, 1, 0, 3, 12};
      moveZeroes(arr);

      for (int element : arr) {
          System.out.print(element + " ");
      }
  }
}
