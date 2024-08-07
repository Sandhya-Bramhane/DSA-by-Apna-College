public class sorting_descending {

  public static void BubbubleSort(int arr[]) {
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length-1-i; j++) {
        
        if (arr[j+1] > arr[j]) {
          
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;

        }
      }
    }
  }

  public static void SelectionSort(int arr[]) {
    
    for (int i = 0; i < arr.length-1; i++) {
      int minvalue = i;

      for (int j = i+1; j < arr.length; j++) {
        
          if (arr[minvalue] < arr[j]) {
            minvalue = j;
          }
      }

      int temp = arr[minvalue];
      arr[minvalue] = arr[i];
      arr[i] = temp;
    }  
}

public static void InsertionSort(int arr[]) {
  
  for (int i = 1; i < arr.length; i++) {
    int current = arr[i];
    int prev = i - 1;

    while(prev >= 0 && arr[prev] < current) {
      
      arr[prev + 1] = arr[prev];
      prev--;
    }
    arr[prev + 1] = current;
  }

}

public static void Print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] +" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = {3,6,2,1,8,7,4,5,3,1};
    // BubbubleSort(arr);
    // SelectionSort(arr);
    InsertionSort(arr);
    Print(arr);
  }
}
