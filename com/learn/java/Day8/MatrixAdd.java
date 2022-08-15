import java.util.Scanner;

class MatrixAdd
{
	public static void main(String[] args) 
	{
		addMatrix();
	}

	public static void addMatrix()
	{
		int row,column;
		Scanner scan = new Scanner(System.in);
		System.out.print("Row count for matrix: ");
		row = scan.nextInt();

		System.out.print("Column count for matrix: ");
		column = scan.nextInt();

		int matrix1[][] = new int[row][column];
		int matrix2[][] = new int[row][column];
		int matrix3[][] = new int[row][column];

		System.out.println("\nEnter the matrix 1 value: \n");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix1[i][j]=scan.nextInt();
			}
		}

		System.out.println("\nEnter the matrix 2 value: \n");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix2[i][j]=scan.nextInt();
			}
		}

		System.out.println();
		
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
				}
				
			}

			System.out.println("\nMatrix1:\n");

			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(matrix1[i][j]+" ");
				}
				System.out.println();
			}

			System.out.println("\nMatrix2:\n");

			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(matrix2[i][j]+" ");
				}
				System.out.println();
			}
		/*print matrix 1 and matrix2*/
		
		System.out.println("\nAddtion matrix:\n");

		for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(matrix3[i][j]+" ");
				}
				System.out.println();
			}
	}
}