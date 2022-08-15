import java.util.Scanner;

public class ArrangeString
{
   public static void main(String[] args)
   {
      strArrange();
   }
   public static void strArrange()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nEnter your String: ");
      String str=scan.nextLine();

      char array[] = str.toCharArray();
      char temp;
      for(int i=0;i<array.length;i++)
      {
         for(int j=i+1;j<array.length;j++)
         {
            if(array[j]<array[i])
            {
               temp=array[i];
               array[i]=array[j];
               array[j]=temp;
            }
         }
      }
      System.out.println("The given String is to change alphabet: "+array);
   }
}