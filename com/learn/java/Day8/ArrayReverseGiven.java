import java.util.Scanner;
class ArrayReverseGiven
{
	public static void main(String[] args) {
		printReverse();
	}

	public static void printReverse()
	{
		Scanner scan=new Scanner(System.in);
		int	num[]=new int[20];
		int temp;

		System.out.print("\nEnter the size of array:");
		int size=scan.nextInt();

		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++)
		{
			num[i]=scan.nextInt();
		}

		System.out.println();
		
		System.out.println("Reverse order:");

		for(int i=0;i<size;i++)
		{
			for(int j=size-1;j>=0;j--)
			{
				temp=num[j];
				num[i]=num[j];
				num[i]=temp;
			}
		}

		for(int i=0;i<size;i++)
		{
			System.out.println(num[i]);
		}
		
	}
}