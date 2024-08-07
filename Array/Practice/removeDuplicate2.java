public class removeDuplicate2 {
  

public static int RemoveDuplicate(int arr[]) {
  
 int n = arr.length;
 int k = 1;

 for (int i = 1; i < arr.length; i++) {
       
  if (arr[i] != arr[i-1]) {
    
      arr[k] = arr[i];
      k++;
  }

 }
  

return k;

}

  public static void main(String[] args)
  {

    int arr [] = {1,1,4,5,6,6};

    int result = RemoveDuplicate(arr);

    System.out.println(result);

    for (int i = 0; i < result; i++) {
      System.out.print(arr[i]);
    }

  }
  
}
