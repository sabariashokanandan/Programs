import java.util.Scanner;

class PatternNumber5
{
	public static void main(String[] args) 
	{
		printNumber();
	}

	public static void printNumber()
	{
		Scanner scan=new Scanner(System.in);
		int number;
		System.out.print("\nEnter the number:");
		number=scan.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int k= number-1;k>=i;k--)
			{
				System.out.print("  ");
			}

			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int m=1;m<=i;m++)
			{
				System.out.print(m+" ");
			}

			System.out.println();
			
		}
		
	}
}