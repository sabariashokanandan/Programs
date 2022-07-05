import java.util.Scanner;
class ArrayReverseGiven
{
	public static void main(String[] args) {
		printReverse();
	}

	public static void printReverse()
	{
		Scanner scan=new Scanner(System.in);
		int	num[],numcopy[];
		int temp;

		System.out.print("\nEnter the size of array:");
		int size=scan.nextInt();
		num=new int[size];
		numcopy=new int[size];

		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++)
		{
			num[i]=scan.nextInt();
		}

		System.out.println();
		int n=size;
		
		System.out.println("Reverse order:");

		for(int i=0;i<size;i++,n--)
		{
			numcopy[n-1]=num[i];
		}

		for(int i=0;i<size;i++)
		{
			System.out.println(numcopy[i]);
		}
		
	}
}