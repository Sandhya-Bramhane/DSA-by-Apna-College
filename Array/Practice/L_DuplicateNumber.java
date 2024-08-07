import java.util.Arrays;

public class L_DuplicateNumber {

   public static int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-1; i++)
        {
          if(nums[i] == nums[i+1])
          {
              return nums[i];
          }
        }
        return -1;
    }

  public static void main(String[] args) {
    int nums[] = {3,3,3,3,3};
    System.out.println(findDuplicate(nums));
  }
}
