import java.util.Scanner;
class BiggestTwo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("\nEnter two numbers:");
		System.out.print("a= ");
		a=sc.nextInt();
		System.out.print("b= ");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+" is largest");
		}
		else if(a<b)
		{
			System.out.println(b+" is largest");
		}
		else
		{
			System.out.println("Both are same");
		}
	}
}