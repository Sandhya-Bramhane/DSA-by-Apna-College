public class RowSumMatrix {

public static int RowsSum(int nums[][]) {
  
  int sum = 0;
  int n = nums[0].length;
  

  for (int j = 0; j < n; j++) {
    sum = sum + nums[1][j];
  }
  return sum;
}
  public static void main(String[] args) {
    int nums[][] = {
      {1,4,9},
      {11,4,3},
      {2,2,3}
    };

    System.out.println(RowsSum(nums));
  }
}
