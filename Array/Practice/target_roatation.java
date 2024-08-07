public class target_roatation {

  //==================using linear serch==============
  /*public static int Rotation(int nums[],int target) {
    for (int i = 0; i < nums.length; i++) {
      if (target == nums[i]) {
        return nums[target];
      }
    }
    return -1;
   }
*/

//===============using binary serch============

public static int Rotation(int nums[],int target) {
  int start = 0;
  int end = nums.length-1;

  while (start <= end) {
    
    int mid = (start + end)/2;

    if (nums[mid] == target) {
      return mid;
    }

    // Check if the left half is sorted
    if (nums[start] <= nums[mid]) {
      if (nums[start] <= target && target < nums[mid]) {
        end = mid-1;
      }
      else{
        start = mid +1;

      }
    }
    else { // The right half must be sorted
      // Check if the target is in the right half
      if (nums[mid] < target && target <= nums[end]) {
          start = mid + 1;
      } else {
          end = mid - 1;
      }
  }

  }
  return -1;
 }


  public static void main(String[] args) {
    int nums[] = {4,5,6,7,0,1,2};
    int target = 3;
    int output = Rotation(nums,target);
    System.out.println(output);
}
}