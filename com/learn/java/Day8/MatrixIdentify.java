import java.util.Scanner;

class MatrixIdentify
{
	public static void main(String[] args) 
	{
		identifyMatrix();
	}

	public static void identifyMatrix()
	{
		int row;
		boolean flag1,flag2,flag3,flag4;
		Scanner scan = new Scanner(System.in);
		flag1=true;
		flag2=true;
		flag3=true;
		flag4=true;

		System.out.println("Enter the Size: ");
		row = scan.nextInt();

		int[][] num = new int[row][row];
		System.out.println("\nEnter array values: ");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				num[i][j]=scan.nextInt();
			}
		}
		
		int x=num[0][0];
		System.out.println();

		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < row; j++)
			{
				if(i == j && num[i][j] != 1)
				{
				 	flag1 = false;    
                    break;  
				}

				if(i != j && num[i][j] != 0)
				{
				 	flag1 = false;    
                    break; 
				}
			}
		}

		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < row; j++)
			{
				if (i != j && num[i][j] != 0)
				{
					flag2=false;
					break;
				}
				
				if (i == j && (num[i][j] == 0 || num[i][j] != x))
				{
					flag3=false;
					break;
				}
			}
		}

		for(int i = 0;i < row;i++)
		{
			for(int j = 0;j < row;j++)
			{
				if(i == j)
				{
					if(num[i][j] == 0)
					{
						flag4=false;
						break;
					}
				}
				else if(num[i][j] != 0)
				{
						flag4=false;
						break;
				}
			}
		}



			if(flag1)
				System.out.println("Given matrix is an Identity matrix"); 
			else if(flag2 && flag3)
				System.out.println("Given matrix is an Scalar matrix"); 
			else if(flag4)
				System.out.println("Given matrix is an Diagonal matrix");
			else 
				System.out.println("Given matrix is not an identity,scalar or diagonal matrix");  

	}
}
