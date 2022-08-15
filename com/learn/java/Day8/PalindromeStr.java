import java.util.Scanner;

public class PalindromeStr
{
   public static void palindromeStr()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nEnter your String: ");
      String str=scan.nextLine();

      String reverse="";
      for(int i=str.length()-1;i>=0;i--)
      {
         reverse = reverse+str.charAt(i);
      }
      if(str.equalsIgnoreCase(reverse))
      {
         System.out.println("\nThe Given String is Palindrome String.");
      }
      else
      {
         System.out.println("\nThe Given String is Not Palindrome String.");
      }

   }

   public static void main(String[] args)
   {
      palindromeStr();
   }
}