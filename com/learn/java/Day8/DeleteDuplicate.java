import java.util.Scanner;

class DeleteDuplicate
{
	public static void main(String[] args)
	{
		removeDuplicates();
	}

	public static void removeDuplicates()
	{

		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the Array size: ");
		int size = scan.nextInt();

		int num[] = new int[size];
		System.out.println("\nEnter the Array values: ");

		for(int i=0;i<size;i++)
		{
			num[i]=scan.nextInt();
		}

		System.out.print("\nOriginal array is: ");

		for(int i=0;i<size;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println();

		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(num[i]==num[j]) //56==56
				{
					num[j]=num[size-1];
					size--;	
				}
			}
		}

		System.out.print("\nArray without duplicate: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}

}