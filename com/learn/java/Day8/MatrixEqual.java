import java.util.Scanner;

class MatrixEqual
{
public static void main(String[] args) 
{
	checkMatrix();
}

public static void checkMatrix()
{
		boolean check=true;
		int row,column;
		Scanner scan = new Scanner(System.in);
		System.out.println("Row count for matrix: ");
		row = scan.nextInt();

		System.out.println("Column count for matrix: ");
		column = scan.nextInt();

		int matrix1[][] = new int[row][column];
		int matrix2[][] = new int[row][column];

		System.out.println("\nEnter the matrix 1 value: ");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix1[i][j]=scan.nextInt();
			}
		}

		System.out.println("\nEnter the matrix 2 value: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix2[i][j]=scan.nextInt();
			}
		}

			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					if(matrix1[i][j]!=matrix2[i][j])
					{
						check=false;
						break;
					}
				}
			}

		if(check)
		{
			System.out.println("\nMatrices are equal");
		}
		else 
		{
			System.out.println("\nMatrices are not equal");
		}

		
}
}