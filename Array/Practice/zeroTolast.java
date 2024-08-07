public class zeroTolast {

public static void movezeroes(int packets[]) {
  
  for (int i = 0; i < packets.length; i++) {

         if (packets[i] == 0) {
          
          int temp = packets[i];
           packets[i] = packets[packets.length-1];
           packets[packets.length-1] = temp; 
         }

         System.out.print(packets[i]);
    }

  }


  public static void main(String[] args) {
    int packets[] = {4,5,0,1,9,0,5,0};
    movezeroes(packets);
  }
}
