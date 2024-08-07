public class subarray {


  public static void SubArray(int arr[]) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      
       for (int j = i; j < arr.length; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
       
          System.out.print(arr[k] + " ");
          
          sum += arr[k];

        }
        System.out.println("=> Sum: " + sum);

        System.out.println();
        if (sum > max) {
          max = sum;
        }
        if (sum < min ) {
          min = sum;
        }
       }

        System.out.println("Max value among all subarrays: " + max);
        System.out.println("Min value among all subarrays: " + min);

    }


  }
  public static void main(String[] args) {
    int arr[]= {2,4,6,8,10};
    SubArray(arr);
  }
}

//===========homework=================
//1) print sum of subarray
//2) max and min of  all subarray between