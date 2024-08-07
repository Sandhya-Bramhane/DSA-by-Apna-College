public class L_merge_sorted_arr {
  
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = 0; // Pointer for nums1
    int j = 0; // Pointer for nums2
    int k = 0; // Pointer for the merged array
    
    // Temporary array to store the merged result
    int[] temp = new int[m + n];
    
    while (i < m && j < n) {
      if (nums1[i] <= nums2[j]) {
        temp[k] = nums1[i];
        k++;
        i++;
      } else {
        temp[k] = nums2[j];
        k++;
        j++;
      }
    }
    
    // Copy remaining elements from nums1, if any
    while (i < m) {
      temp[k] = nums1[i];
      k++;
      i++;
    }
    
    // Copy remaining elements from nums2, if any
    while (j < n) {
      temp[k] = nums2[j];
      k++;
      j++;
    }
    
    // Copy the merged result back to nums1
    for (int l = 0; l < m + n; l++) {
      nums1[l] = temp[l];
    }
  }

  public static void main(String[] args) {
    int[] nums1 = {1,2,4,0,0,0};
    int[] nums2 = {4,5,6};
    int m = 3;
    int n = 3;
    
    merge(nums1, m, nums2, n);
    
    for (int i = 0; i < m + n; i++) {
      System.out.print(nums1[i] + " ");
    }
  }
}
