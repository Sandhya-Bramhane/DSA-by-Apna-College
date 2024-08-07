public class zeroesToLast {
  

  public static void moveZeroesLast(int arr[]) {
    
   int left = 0;

   for (int right = 0; right < arr.length; right++) {
    
    if (arr[right] != 0) {
      
       int temp = arr[right];
       arr[right] = arr[left];
       arr[left] = temp;

       left++;

    }
 
   }

  }


  public static void main(String[] args) {
    int arr[]  = {1,0,3,0,2};
    moveZeroesLast(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    
  }

}
