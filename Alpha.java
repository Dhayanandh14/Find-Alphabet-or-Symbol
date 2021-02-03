import java.util.*;
public class FindTheAlphabets{
  public static void main(String[] args){
    Scanner kbd=new Scanner(System.in);
    System.out.println("Enter Character: ");
    char ch=kbd.next().charAt(0); 
   if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
      System.out.print("Alphabets");
    }
    else if(ch>='0' && ch<='9')
    {
      System.out.print("Numeric");
    }
    else {
      System.out.print("Symbol");
    }
    
  }
  
}
