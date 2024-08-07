import java.util.Arrays;


public class All_dupli_find {

   public static int findDuplicates(int[] nums) {
        
        Arrays.sort(nums);
        //1,2,2,3,3,4,7,8
        int duplicate = 0;
        
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] == nums[i+1]){
                
                nums[duplicate] = nums[i];
                duplicate++;
            }
            
            
        }
        return duplicate;
    }
  public static void main(String[] args) {
    int nums[] = {4,3,2,7,8,2,3,1};
    System.out.print(findDuplicates(nums));

     System.out.println();

    int result = findDuplicates(nums);
    for (int i = 0; i < result-1; i++) {
      System.out.print(nums[i]+" ");
    }
  }
}
