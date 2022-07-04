import java.util.Scanner;

class PatternNumber
{
	public static void main(String[] args) 
	{
		printNumber();
	}

	public static void printNumber()
	{
		int number,i,j;
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the number:");
		number=scan.nextInt();

		for(i=1;i<=number;i++) //0
		{
			for(j=1;j<i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}