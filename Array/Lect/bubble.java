public class bubble {

  public static void BubbleSort(int arr[]) {

    for (int i = 0; i < arr.length-1; i++) {

      for (int j = 0; j < arr.length-1-i; j++) {
        
          if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;

          }
      }
    }
    
  }

  public static void PrintArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    BubbleSort(arr);
    PrintArr(arr);
  }
}