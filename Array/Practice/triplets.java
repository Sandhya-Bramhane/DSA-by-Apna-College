public class triplets {

  public static int Triplets(int nums[]) {



    return 0;
  }
  public static void main(String[] args) {
    int nums[] = {-1,0,1,2,-1,-4};

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        for (int k = 0; k < nums.length; k++) {
          
          if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
            System.out.println();
          }
        }
      }
    }
  }
}
