import java.io.*;

import java.util.Scanner;

public class Reversal
{
	public static void main(String[] args)
   {
      reverseWord();
   }

   public static void reverseWord()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nEnter your String: ");
      String str=scan.nextLine();

      String[] words=str.split(" ");
      String reverseString="";

      for(String w:words)
      {
         String reversewords="";
         for(int i=w.length()-1;i>=0;i--)
         {
            reversewords=reversewords+w.charAt(i);
         }
         reverseString=reverseString+reversewords+" ";
      }
      System.out.println("\nReverse String"+reverseString);
   }
}