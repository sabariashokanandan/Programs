import java.util.*;
class Adder
{
   public static void main(String args[]) 
   {
      Adder tester = new Adder();
      byte a = 1, b= 2;
      short c = 1, d = 2;
      int e = 1, f = 2;
      System.out.println(tester.add(a, b));
      System.out.println(tester.add(c, d));
      System.out.println(tester.add(e, f));
   }

   public int add(int a, int b) 
   {
      return a + b;
   }
}