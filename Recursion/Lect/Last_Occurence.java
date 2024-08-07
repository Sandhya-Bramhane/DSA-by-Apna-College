public class Last_Occurence {

  public static int LastOccur(int arr[], int key,int i) {


    if (i == arr.length) {
      return -1;
    }

    int isFound = LastOccur(arr, key, i+1);

    if (isFound == -1 && arr[i] == key) {
      return i;
    }
   
    return isFound;

  }
  public static void main(String[] args) {
    int arr[] = {2,5,3,4,2,5,3,2,6};
    int key = 3;
    System.out.println(LastOccur(arr,key,0));
  }
}
