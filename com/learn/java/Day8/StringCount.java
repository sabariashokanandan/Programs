import java.util.Scanner;

public class StringCount
{
 public static void main(String[] args)
   {
      countStr();
   }
   public static void countStr()
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your String: ");
      String str=scan.nextLine();

      int vowels=0,words=0,specialChar=0,digit=0;

      for(int i=0;i<str.length();i++)
      {
         char ch = str.charAt(i);
         if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
         {
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch == 'u')
            {
               ++vowels;
            }
            else
            {
               ++words;

            }
         }
         else if(ch >= '0' && ch<='9')
         {
            ++digit;
         }
         else
         {
            ++specialChar;
         }
        
         }
         int character = (vowels+words);
         System.out.println("Number of Character: "+ character);
         System.out.println("Number of words: "+ words);
         System.out.println("Number of vowels: "+ vowels);
         System.out.println("Number of digit: "+ digit);
         System.out.println("Number of specialChar: "+ specialChar);
      }
}