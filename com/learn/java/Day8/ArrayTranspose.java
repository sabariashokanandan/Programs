import java.util.Scanner;

class ArrayTranspose
{

	public static void main(String[] args)
	{
		transposeArray();
	}

	public static void transposeArray()
	{
		int row,column;
		Scanner scan = new Scanner(System.in);
		System.out.println("Row count: ");
		row = scan.nextInt();

		System.out.println("Column count: ");
		column = scan.nextInt();

		int matrix[][] = new int[row][column];
		int  result[][] = new int[row][column];

		System.out.println("\nEnter the matrix value: ");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
		
		for(int m=0;m<row;m++)
		{
			for(int n=0;n<column;n++)
			{
				result[n][m] = matrix[m][n];
			}
		}

		System.out.println();

		for(int k=0;k<row;k++)
		{
			for(int l=0;l<column;l++)
			{
				System.out.print(result[k][l]+" ");
			}
			System.out.println();
		}
		

	}
	
}