public class Sorting {

  public static void Bubble_Sort(int arr[]) {

    for (int i = 0; i < arr.length-1; i++) {

      for (int j = 0; j < arr.length-1-i; j++) {
        
        if (arr[j] > arr[j+1] ) {
          
          //swap
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;

        }
      }
    }
  }

  public static void Selection(int arr[]) {

    for (int i = 0; i < arr.length-1; i++) {

      int MinValue = i;

      for (int j = i+1; j < arr.length; j++) {
        
        if (arr[MinValue] > arr[j]) {
          MinValue = j;
        }
      }

      int temp = arr[MinValue];
      arr[MinValue] = arr[i];
      arr[i] = temp;

    }

  }

  public static void Inseration(int arr[]) {
    
  for (int i = 1; i < arr.length; i++) {
    int current = i;
    int prev = i - 1;

    while (prev >= 0 && arr[prev] > arr[current]) {
      
      arr[prev + 1] = arr[prev];
       prev--;
    }
//insertion

  arr[prev + 1] = current;

  }

  }

  public static void Printer(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }


  public static void main(String[] args) {
    int arr [] = {5,4,3,2,1};
    // Bubble_Sort(arr);
    // Selection(arr);
    Inseration(arr);
    Printer(arr);
  }
}
