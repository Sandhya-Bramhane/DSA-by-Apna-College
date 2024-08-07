public class MergeArray {

  public static void Merge(int nums1[], int m, int nums2[], int n) {
    int i = 0;
    int j = 0;
    int k = 0;

    int[] temp = new int[m + n];

    while (i < m && j < n) {
      
      if (nums1[i] <= nums2[j]) {
        temp[k] = nums1[i];
        k++;
        i++;
      }
      else{
        temp[k] = nums2[j];
        k++;
        j++;
      }
    }

    //copy remaining nums1
    while (i < m) {
      temp[k] = nums1[i];
      k++;
      i++;
    }
    
    //copy remaining nums2
    while (j < n) {
      temp[k] = nums2[j];
      k++;
      j++;
    }

    //give temp[k] elements to nums1
    for (int l = 0; l < m + n; l++) {
      nums1[l] = temp[l];
    }
  }

  public static void main(String[] args) {
    int nums1[] = {1,2,4,0,0,0};
    int m = 3;
    int nums2[] = {4,5,6};
    int n = 3;

    Merge(nums1, m, nums2, n);

    for (int i = 0; i < m + n; i++) {
      System.out.print(nums1[i]+" ");
    }
  }
}
