import java.util.*;
class Adder2
{
   public static void main(String args[]) 
   {
      Adder2 tester = new Adder2();
      byte a = 1, b= 2;
      short c = 1, d = 2;
      float e = 1, f = 2;
      System.out.println(tester.add(a, b));
      System.out.println(tester.add(c, d));
      System.out.println(tester.add(e, f));
   }

   public int add(int a, int b) 
   {
      return a + b;
   }
}