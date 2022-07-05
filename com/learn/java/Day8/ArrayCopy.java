import java.util.Scanner;
class ArrayCopy
{
	public static void main(String[] args) 
	{
		copyArray();
	}

	public static void copyArray()
	{
		int a[];
		int b[];
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the size of array:");
		int size=scan.nextInt();
		a=new int[size];
		b=new int[size];

		System.out.print("Enter the values:\n");
		for(int i=0;i<size;i++)
		{
			a[i]=scan.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			b[i]=a[i];
		}
		System.out.println("\nThe elements of a is:");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nThe elements of b is:");
		for(int i=0;i<size;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}