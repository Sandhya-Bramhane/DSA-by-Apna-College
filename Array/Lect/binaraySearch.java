
public class binaraySearch {
  

public static int BinaraySearch(int numbers[], int key)

{
 int start = 0; //index[0]
 int end = numbers.length-1; // index[7-1] = > index[6]

  while (start <= end) { 
      int mid = (start + end) / 2;

//comparisons
      if(numbers[mid] == key)
      {
        return  mid;
      }
      else if (numbers[mid] < key) { // right
        start = mid + 1;
      }
      else{//left
        end = mid - 1;
      }
    
  }
  return  -1;
  
}

  public static void main(String[] args) {

      int numbers[] = {2,4,6,8,10,12,14}; // array take 

      int key = 4;//kry take 

      System.out.println("Index for key is: "+ BinaraySearch(numbers,key));
  }
}
