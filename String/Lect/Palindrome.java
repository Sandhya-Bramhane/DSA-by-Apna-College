//"noon", "madam"

public class Palindrome {

  public static boolean Palindrome(String string) {
    int n = string.length();
    int m = n-1;
    for (int i = 0; i < string.length() / 2; i++) {
      
      if (string.charAt(i) != string.charAt(m-i) ) {
         return false;
      }
    }

      return true;
  }


  public static void main(String[] args) {
    String string = "rpcppr";
    System.out.println(Palindrome(string));
  }
}