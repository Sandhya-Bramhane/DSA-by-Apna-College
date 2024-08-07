public class L_jump_Game {
  
  public static boolean jumpgame(int nums[]) {
   int start = 0;
   int end = nums.length-1;

    while (start <= end) {

      int maxjump = nums[start];
      
       if (nums[maxjump] == nums[end]) {
        return true;
       }
       start = start + nums[maxjump];

    }
  
    return false;
}


public static void main(String[] args) {
  int nums[] = {2,3,1,1,4};
  System.out.println(jumpgame(nums));
}
}