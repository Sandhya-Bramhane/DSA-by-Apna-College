public class Bubble_Sort {

public static void Bubble_sort(int bubbles[]) {
  

for (int i = 0; i < bubbles.length-1; i++) {
  

for (int j = 0; j < bubbles.length-i-1; j++) {
  

if (bubbles[j] > bubbles[j+1]) {
  

int temp = bubbles[j];
bubbles[j]=bubbles[j+1];
bubbles[j+1] = temp;

}
}

}
for (int i = 0; i < bubbles.length; i++) {
  System.out.print(bubbles[i] +" ");
}
}




  public static void main(String[] args) {
    int bubbles[] = {2,3,5,6,7,1,0};
    Bubble_sort(bubbles);
  }
}
