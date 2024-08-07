public class SearchKeyInMatrix {

public static boolean SearchKey(int arr[][], int key) {
  int row = 0;
  int col = arr[0].length-1;

  while (row < arr.length && col >= 0) {
    
  if (key == arr[row][col]) {
    System.out.println("("+row+","+col+")");
    return true;
  }
  else if (key < arr[row][col]) {
    row++;
  }
  else{
    col--;
  }
  }
  System.out.println("Number Not found");
  return false;
}

  public static void main(String[] args) {
    int arr[][]={
      {4,7,3},
      {8,3,9},
    };
    
    int key = 7;

    SearchKey(arr, key);
  }
}
