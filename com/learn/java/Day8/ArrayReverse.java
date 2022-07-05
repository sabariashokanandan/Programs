import java.util.Scanner;
class ArrayReverse
{
	public static void main(String[] args) {
		printReverse();
	}

	public static void printReverse()
	{
		int	num[];
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the size of array:");
		int size=scan.nextInt();
		num=new int[size];

		System.out.print("Enter the values:\n");
		for(int i=0;i<size;i++)
		{
			num[i]=scan.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			System.out.println("num["+i+"]="+num[i]);
		}
		System.out.println();
		System.out.println("Reverse order:");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println("num["+i+"]="+num[i]);
		}
	}
}