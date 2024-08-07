import java.util.Arrays;

public class remove_duplicates {


  public static int RemoveDupli(int nums[]) {

    int k = 1;

    for (int i = 1; i < nums.length; i++) {
      
        if(nums[i] != nums[i-1]) {
         
          nums[k] = nums[i];
          k++;
        }
    }
    return k;

  }

  public static void main(String[] args) {
    int nums[] = {1,1,2}; // 1,2,3,4,5,_,_,_

    int result = RemoveDupli(nums);
    System.out.println("duplicate elements are: "+ result);
    
    for (int i = 0; i < result; i++) {
      System.out.print(nums[i]);
    }
  }
}
