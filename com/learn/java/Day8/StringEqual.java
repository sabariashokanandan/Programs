import java.util.Scanner;

public class StringEqual
{

   public static void main(String[] args)
   {
      equalStr();
   }

   public static void equalStr()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nEnter your First String: ");
      String str1=scan.nextLine();

      System.out.print("\nEnter your Second String: ");
      String str2=scan.nextLine();

      if(str1.equalsIgnoreCase(str2))
      {
         System.out.println("\nGiven Strings are Equal.");
      }
      else
      {
         System.out.println("\nGiven String Not Matched.");
      }

   }

}