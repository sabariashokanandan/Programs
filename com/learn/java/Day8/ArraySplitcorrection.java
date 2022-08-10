import java.util.Scanner;

class ArraySplit
{
	public static void main(String[] args)
	{
		splitArray();
	}

	public static void splitArray()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the Array size: ");
		int size = scan.nextInt();

		int num[] = new int[size];
		int odd[] = new int[size];
		int even[] = new int[size];
		System.out.println("\nEnter the Array values: ");

		for(int i=0;i<size;i++)
		{
			num[i]=scan.nextInt();
		}

		System.out.print("\nOriginal array is: ");

		for(int j=0;j<size;j++)
		{
			System.out.print(num[j]+" ");
		}
		System.out.println();

		for(m=0;m<size;m++)
		{
			for(n=0;m<)
		}
	}
}