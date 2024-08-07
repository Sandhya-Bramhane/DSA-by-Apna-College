public class Letter_UpperCase {

  public static void UPperCase(String name) {

  name = " " + name;

  String newstr = "";

  for (int i = 0; i < name.length(); i++) {
    
    char ch = name.charAt(i);

    if (ch == ' ') {
      
      newstr = newstr + ch;

      i++;
      ch = name.charAt(i);
      newstr = newstr + Character.toUpperCase(ch);

    }
    else{
      newstr = newstr + ch;
    }
  }
  newstr = newstr.trim();
  System.out.println(newstr);
  }

  public static void main(String[] args) {
    String name = "sandhya Brmahane is good girl";
    UPperCase(name);
  }
}
