import java.util.*;

public class trap_water {

  public static int TrapedWater(int height[]) {
    int n = height.length;

    //For Left Max
    int LeftMax[] = new int[n];

    LeftMax[0] = height[0];

    for (int i = 1; i < n; i++) {
      LeftMax[i] = Math.max(height[i],LeftMax[i-1]);
      
    }

    //For Right Max
    int RightMax[] = new int[n];

    RightMax[n-1] = height[n-1];

    for (int i = n-2; i >= 0; i--) {
      RightMax[i] = Math.max(height[i],RightMax[i+1]);
    }

    int trap_water = 0;

    for (int i = 0; i < n; i++) {
      
      int waterlevel = Math.min(LeftMax[i], RightMax[i]);

      trap_water = trap_water + (waterlevel-height[i]);

    }
  return trap_water;

  }
  public static void main(String[] args) {
    int height[] = {4, 2, 0, 3, 2, 5};
    System.out.println(TrapedWater(height));
  }
}
