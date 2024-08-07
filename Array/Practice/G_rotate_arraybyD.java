public class G_rotate_arraybyD {

  // Function to reverse a portion of the array
  public static void reverse(int nums[], int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

  // Function to rotate the array by d elements
  public static void rotateArr(int nums[], int d) {
    int n = nums.length; // Calculate the length of the array

    // Handle cases where d is greater than n
    d = d % n;
    if (d == 0) return; // No rotation needed

    // Step 1: Reverse the first d elements
    reverse(nums, 0, d - 1);

    // Step 2: Reverse the remaining elements
    reverse(nums, d, n - 1);

    // Step 3: Reverse the entire array
    reverse(nums, 0, n - 1);
  }

  public static void main(String[] args) {
    int nums[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int d = 3;
    rotateArr(nums, d);

    // Print the rotated array
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }
}
