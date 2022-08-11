import java.util.Scanner;

class MatrixMultiply
{
	public static void main(String[] args) 
	{
		multiplyMatrix();
	}

	public static void multiplyMatrix()
	{
		int row1,row2,column1,column2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Row count for matrix1: ");
		row1 = scan.nextInt();

		System.out.println("Column count for matrix1: ");
		column1 = scan.nextInt();

		System.out.println("Row count for matrix2: ");
		row2 = scan.nextInt();

		System.out.println("Column count for matrix2: ");
		column2 = scan.nextInt();


		int matrix1[][] = new int[row1][column1];
		int matrix2[][] = new int[row2][column2];
		int matrix3[][] = new int[row1][column1];

		System.out.println("\nEnter the matrix 1 value: ");

		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				matrix1[i][j]=scan.nextInt();
			}
		}

		System.out.println("\nEnter the matrix 2 value: ");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<column2;j++)
			{
				matrix2[i][j]=scan.nextInt();
			}
		}

		System.out.println();

		if(row1!=row2 || column1!=column2)
		{
			System.out.println("matrices are not equal");
		}

		else 
		{
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					matrix3[i][j]=matrix1[i][j]*matrix2[i][j];
				}
				System.out.println();
			}
		}
		
		System.out.println();

		for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					System.out.print(matrix3[i][j]+" ");
				}
				System.out.println();
			}
	}
}