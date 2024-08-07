public class Sort_Color {

  public static void sortcolor(int colors[]) {
    int n = colors.length;
    int start= 0;
    int mid = 0;
    int end = n - 1;

   while (mid <= end) {
    
     switch (colors[mid]) {
      case 0:
        swap(colors, start , mid);
        mid++;
        start++;
        break;
     
        case 1:
        mid++;
        break;

         case 2:
        //swap with end
        swap(colors, mid, end);
        end--;
        break;
     }
   }

  }
  private static void swap(int[] arr, int pos1, int pos2)
  {
    int temp = arr[pos1];
    arr[pos1] = arr[pos2];
    arr[pos2] = temp;
  }
  public static void main(String[] args) {
    int colors[] = {2,0,2,1,1,0};
    sortcolor(colors);

    for (int color : colors) {
      System.out.print(color + " ");
  }
  
  }
}
