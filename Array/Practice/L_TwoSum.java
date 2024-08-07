public class L_TwoSum {

  public static int[]  twoSum(int[] nums, int target) {
        
    for(int i = 0; i < nums.length-1; i++)
    {
       for (int j = i+1; j < nums.length; j++) {

        if(nums[i] + nums[j] == target)
        {
            return new int[] {i,j};
            
        }
       }
    }
    return null;
}
  public static void main(String[] args) {
    int nums[] = {2,2,7,15};
    int target = 9;

    int[] result = twoSum(nums, target);

    if (result != null) {
      System.out.print(result[0] +","+result[1]);
    }
    else {
      System.out.println("No pair found");
    }
  }
}
