import java.util.*;
public class waterquantity {

  public static int trapedwater(int height[]) {
    
    int n = height.length;
  //1) i will create a new array for store left maximum bar
  int[] leftmax = new int[n];

  //2) strating bar not will be consider 
  leftmax[0] = height[0];

  //3) for loop for one by one store left maximum bar heights

  for (int i = 1; i < n; i++) {
    leftmax[i] = Math.max(height[i], leftmax[i-1]);
  }

  //4) same for rightmax but in this we start from count heigh n-2

  int rightmax[] = new int[n];
  rightmax[n-1] = height[n-1];

  for (int i = n-2; i >= 0; i--) {
    rightmax[i] = Math.max(height[i], rightmax[i+1]);
  }

  int totalwater = 0;
for (int i = 0; i < n; i++) {
  int waterlevel = Math.min(leftmax[i], rightmax[i]);

  totalwater = totalwater + (waterlevel - height[i]);
}
  return totalwater;
}
  public static void main(String[] args) {
    int height[]  = {4, 2, 0, 3, 2, 5};
    System.out.println(trapedwater(height));
  }
}
