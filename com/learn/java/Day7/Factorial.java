import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		long f=1,n;
		Scanner ob=new Scanner(System.in);
		System.out.print("\nEnter the value for factorial:");
		n=ob.nextLong(); //5
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("\nThe factorial is:" + f);
	}
}