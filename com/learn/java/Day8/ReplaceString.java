import java.util.Scanner;

public class ReplaceString
{
  public static void main(String[] args)
   {
      replaceStr();
   }
   public static void replaceStr()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nEnter your String: ");
      String str=scan.nextLine();

      System.out.print("\nFind the Character given String: ");
      char find = scan.next().charAt(0);

      System.out.print("\nReplace the Character given String: ");
      char replace = scan.next().charAt(0);

      System.out.println("\nBefore Given String: "+str);

      String replaceString = str.replace(find,replace);
      System.out.println("\nThe After Change String: "+replaceString);
      }

 
}