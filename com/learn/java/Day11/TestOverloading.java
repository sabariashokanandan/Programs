import java.util.*;
class Addition
{  
	static int add(int a, int b)
	{
		return a+b;
	}  
	static double add(double a, double b)
	{
		return a+b;
	}  
}  

class TestOverloading
{  
	public static void main(String[] args)
	{  
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter integer values for a and b");

		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.print("result:-" + Addition.add(a,b) + "\n");

		System.out.println("Enter integer values for a and b");

		double c=scan.nextDouble();
		double d=scan.nextDouble();

		System.out.println("result:-" + Addition.add(c,d));  
	}
}  
