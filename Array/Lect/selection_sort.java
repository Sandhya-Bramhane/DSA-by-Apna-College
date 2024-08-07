public class selection_sort {

public static void SelectionSort(int arr[]) {
  
  for (int i = 0; i < arr.length-1; i++) {
    int MinPos = i;

    for (int j = i+1; j < arr.length; j++) {
      
      if (arr[MinPos] > arr[j]) {
        MinPos = j;
      }
    }

    int temp = arr[MinPos];
    arr[MinPos] = arr[i];
    arr[i] = temp;

  }
 
}

public static void Printarr(int arr[]) {
  for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
  }
  System.out.println();
}


  public static void main(String[] args) {
    int arr[]= {5,3,6,4,7};
    SelectionSort(arr);
    Printarr(arr);
    }

}
