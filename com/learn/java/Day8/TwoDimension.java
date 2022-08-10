import java.util.Scanner;

class TwoDimension
{
	public static void main(String[] args)
	{
		twoDimensionArray();
	}

	public static void twoDimensionArray()
	{
		int row,column;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Size of row: ");
		row = scan.nextInt();

		System.out.println("Enter Size of column: ");
		column = scan.nextInt();

		int[][] num = new int[row][column];
		System.out.println("\nEnter array values: ");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				num[i][j]=scan.nextInt();
			}
		}
		
		System.out.println();

		for(int m=0;m<row;m++)
		{
			for(int n=0;n<column;n++)
			{
				System.out.print(num[m][n]+" ");
			}	
		}

		System.out.println();

	}

}