import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the value:");
		a=sc.nextInt();
		if(a%2==1)
		{
			System.out.println(a+" is odd");
		}
		else
		{
			System.out.println(a+" is even");
		}
	}
}