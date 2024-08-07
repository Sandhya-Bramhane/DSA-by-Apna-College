public class min_max {


  public static void Max_Min(int arr[]) {
    int Max = Integer.MIN_VALUE;
    int Min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      
      if (arr[i] > Max) {
        Max = arr[i];
      }
      if (arr[i] < Min) {
        Min = arr[i];
      }
    }
    System.out.println("Max value among array: " + Max);
    System.out.println("Min value among array: " + Min);

    System.out.println();
  }
  public static void main(String[] args) {
    int arr[]= {1,299,3,45};
    Max_Min(arr);
  }
}
