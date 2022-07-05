import java.util.Scanner;

class ArrayReplace
{
	public static void main(String[] args) 
	{
		ArrayReplace replace=new ArrayReplace();
		replace.findReplace();
	}

	public static void findReplace()
	{
		int numbers[];
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the size of array:");
		int size=scan.nextInt();
		numbers=new int[size];

		System.out.print("Enter the values:\n");
		for(int i=0;i<size;i++)
		{
			numbers[i]=scan.nextInt();
		}

		System.out.print("\nEnter the number to check repeated:");
		int temp=scan.nextInt();
		

		for(int j=0;j<size;j++)
		{
				if(numbers[j]==temp)
			{
				System.out.print("The "+temp+" is found\n");
				System.out.print("Enter the value:");
				numbers[j]=scan.nextInt();
				break;
				
			}

		}

		System.out.println("The array is:");
		for(int j=0;j<size;j++)
		{
			System.out.println(numbers[j]);
		}

	}
}