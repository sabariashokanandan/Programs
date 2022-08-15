import java.util.Scanner;

public class ReverseString
{
  public static void main(String[] args)
   {
      reverseString();
   }
   public static void reverseString()
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your String: ");
      String str=scan.nextLine();
      String reverse="";
      for(int i=str.length()-1;i>=0;i--)
      {
      	reverse = reverse+str.charAt(i);
      }
      System.out.println("Reversed String is: "+reverse);
   }

 
}