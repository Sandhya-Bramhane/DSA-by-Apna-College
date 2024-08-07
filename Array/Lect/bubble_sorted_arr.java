public class bubble_sorted_arr {
  public static void BubbleSort(int arr[]) {
      boolean swapped;
      for (int i = 0; i < arr.length - 1; i++) {
          swapped = false;
          for (int j = 0; j < arr.length - 1 - i; j++) {
              if (arr[j] < arr[j + 1]) {  // Change this comparison to sort in descending order
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
                  swapped = true;
              }
          }
          // If no two elements were swapped by inner loop, then break
          if (!swapped) break;
      }
  }

  public static void PrintArr(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();
  }

  public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5};
      BubbleSort(arr);
      PrintArr(arr);
  }
}
