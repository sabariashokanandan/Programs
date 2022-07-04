import java.util.Scanner;

class PatternNumber3
{
	public static void main(String[] args) 
	{
		printNumber();
	}

	public static void printNumber()
	{
		int number;
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the number:");
		number=scan.nextInt();

		for(int i=number;i>=1;i--) 
		{
			for(int j=1;j<i;j++)  //
			{
				System.out.print(" "+" ");
			}
			for(int j=i;j<=number;j++) // 5<=
			{
				System.out.print(j+" ");

			}
			System.out.println("");
		}
	}

}