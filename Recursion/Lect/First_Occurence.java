public class First_Occurence {

  public static int FirstOccur(int arr[],int key,int i) {
    
  if (i == arr.length) {
    return - 1;
  }
  if (arr[i] == key) {
    return i;
  }

  return FirstOccur(arr,key,i+1);

  }
  public static void main(String[] args) {
    int arr[] = {2,5,3,4,2,5,3,2,6};
    int key = 3;
    System.out.println(FirstOccur(arr,key,0));
  }
}
