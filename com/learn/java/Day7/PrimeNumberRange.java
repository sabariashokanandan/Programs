import java.util.Scanner;

class PrimeNumberRange
{
	public static void main(String[] args)
	{
		int range,init;
		System.out.print("\nEnter the first number: ");

		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();

		System.out.print("Enter the second number: ");
		int n2=scan.nextInt();

		System.out.print("\nThe even numbers between "+n1+" and "+n2+" are :");

		for(init=n1; init<=n2; init++)
		{
			range=init%2;
			if(range==0)
				System.out.println(init);
		}
		System.out.print("\nThe odd numbers between "+n1+" and "+n2+" are :");

		for(init=n1; init<=n2; init++)
		{
			range=init%2;
			if(range==1)
				System.out.println(init);
		}
	}
}