import java.util.*;

//less that one and two bar not allowed
//bars will not be in ascending & decending order
//i will find bars left and right side Max for each bar and between that will find Minimum
//this will both in the array form
//left side first bar rainwater of bar is always 0
//right side first bar rainwater is 0
//Waterfall = Minimum
//now will find Traped water
//formula is : traped water = waterfall - height of bar

public class trapped_Rainwater {

  public static int Trapped_Rainwater(int height[]) {
    int n = height.length;
    //Left Max Boundary
    int LeftMax[] = new int[n];

    //index[0] bar of left will not have waterlevel
    LeftMax[0] = height[0];

    //loop for check every bar one by one for MAX value of boundary
    for (int i = 1; i < n; i++) {
      
      LeftMax[i] = Math.max(height[i],LeftMax[i-1]);
    }

    //Right Max Boundary

    int RightMax[] = new int[n];

    RightMax[n-1] = height[n-1];

    for (int i = n-2; i >= 0; i++) {
      
      RightMax[i] = Math.max(height[i],RightMax[i+1]);
    }

    int traped_water =0;
    for (int i = 0; i < n; i++) {
      int WaterLevel = Math.min(LeftMax[i],RightMax[i]);
      traped_water = traped_water + (WaterLevel - height[i]);
    }
    return traped_water;
  }
  public static void main(String[] args) {
    int height[] ={1,8,6,2,5,4,8,3,7};

    System.out.println(Trapped_Rainwater(height));
  }
}
