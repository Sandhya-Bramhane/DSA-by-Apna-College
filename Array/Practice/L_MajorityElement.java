import java.util.Arrays;

public class L_MajorityElement {
    public static int majorityElement(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        // Return the middle element
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
                    //1,1,1,2,2,2,2
        int result = majorityElement(nums);
        System.out.println("The majority element is: " + result);
    }
}
