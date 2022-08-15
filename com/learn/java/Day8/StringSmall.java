import java.util.Scanner;

public class StringSmall
{
   public static void main(String[] args)
   {
      subString();
   }

   public static void subString()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nEnter your String: ");
      String str1=scan.nextLine();

      System.out.println("Enter the Starting Position: ");
      int starting = scan.nextInt();

      System.out.println("Enter the Ending Position: ");
      int ending = scan.nextInt();

      System.out.println("The Given String is: "+str1);
      System.out.println("\nSubString is: "+str1.substring(starting,ending));
      }
}