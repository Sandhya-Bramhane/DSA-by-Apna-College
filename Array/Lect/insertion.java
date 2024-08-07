public class insertion {

  public static void Insertion_Sort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int current = i;
      int prev = i-1;

      while (prev >= 0 && prev > arr[current]) {
        arr[prev+1] = arr[prev];
        prev--;
      }

      arr[prev+1] = arr[current];
    }

  }
  public static void main(String[] args) {
    
  }
}
