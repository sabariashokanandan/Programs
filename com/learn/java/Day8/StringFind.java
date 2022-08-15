import java.util.Scanner;

public class StringFind
{
   public static void find()
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your String: ");
      String str=scan.nextLine();

      System.out.println("Which Character you want to find: ");
      char get = scan.next().charAt(0);

      System.out.println("Find the Character index value: "+str.indexOf(get));
   }

   public static void main(String[] args)
   {
      find();
   }
}