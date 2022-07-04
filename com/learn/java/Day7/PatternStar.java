import java.util.Scanner;

class PatternStar
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

		for(i=0;i<number;i++) //0
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
	}

}