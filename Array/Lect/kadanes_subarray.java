
public class kadanes_subarray {

    public static void KadanesSubArray(int arr[]) {
      
      int MaxSum = Integer.MIN_VALUE;
      int currentsum = 0;
      boolean allNegative = true;
      int maxNegative = Integer.MIN_VALUE;
  
      for (int i = 0; i < arr.length; i++) {
        // Check if there are any non-negative numbers
        if (arr[i] >= 0) {
          allNegative = false;
        } else {
          // Track the maximum (least negative) number
          maxNegative = Math.max(maxNegative, arr[i]);
        }
  
        currentsum += arr[i];
        
        if (currentsum < 0) {
          currentsum = 0;
        }
        MaxSum = Math.max(MaxSum, currentsum);
      }
  
      // If all numbers are negative, print the least negative number
      if (allNegative) {
        System.out.println("Maximum Sum array is: " + maxNegative);
      } else {
        System.out.println("Maximum Sum array is: " + MaxSum);
      }
    }
  

  public static void main(String[] args) {
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    KadanesSubArray(arr);
  }
  
}