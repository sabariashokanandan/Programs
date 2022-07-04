import java.util.Scanner;

class PatternStar3
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

		for(i=1;i<=number;i++) 
		{
			for(j=2*(number-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*"+" ");

			}
			System.out.println("");
		}
	}

}