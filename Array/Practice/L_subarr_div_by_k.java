// public class L_subarr_div_by_k {
  
//   public static int subarraysDivByK(int[] nums, int k) {
//     int count = 0;
    
//     //[4,5,0,-2,-3,1]
    
//     for(int i = 0; i < nums.length; i++)
//     {
//         int sum = 0;
//         for(int j=i; j < nums.length; j++)
//         {
            
//             sum = sum + nums[j];
            
//             if(sum % k == 0 )
//             {
//                 count++;
//             }
//             else{
//               count = count;
//             }
            
//         }
//     }
//     if (count == 0) {
//       return 0;
//      } 
//     return count;
// }

// public static void main(String[] args) {
//   int nums[] = {5};
//   int k = 9;

//   int result =  subarraysDivByK(nums, k);
//   System.out.println(result);
// }


// }


/**
 * L_subarr_div_by_k
 */
public class L_subarr_div_by_k {

  public static int subarraysDivByK(int[] nums, int k) {

    //4, 5, 0, -2, -3, 1
    
    int count = 0;
    int prefixSum = 0;
    // Initialize an array to store the frequency of each remainder
    int[] remainderCount = new int[k];
    // Start with the remainder 0 having one count (for subarrays starting from the beginning)
    remainderCount[0] = 1;
    
    for (int num : nums) {
        // Update the prefixSum with the current number
        prefixSum = prefixSum + num;
        
        // Calculate the remainder when prefixSum is divided by k
        // Adding k and taking modulo k ensures the remainder is non-negative
        int remainder = ((prefixSum % k) + k) % k;
        
        // Add to count the number of times this remainder has appeared before
        count = count + remainderCount[remainder];
        
        // Update the count for the current remainder
        remainderCount[remainder]++;
    }
    
    return count;
}




  public static void main(String[] args) {
      int nums[] = {4, 5, 0, -2, -3, 1};
      int k = 5;
    
      int result = subarraysDivByK(nums, k);
      System.out.println(result);
    }
}
