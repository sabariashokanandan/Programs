import java.util.Scanner;

class PatternStar2
{
	public static void main(String[] args) 
	{
		printStar();
	}

	public static void printStar()
	{
		int number,i,j;
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the number:");
		number=scan.nextInt();

		for(i=0;i<number;i++) 
		{
			for(j=0;j<=number-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
	}

}