import java.util.Scanner;

class ConcatenateArray
{
	public static void main(String[] args) 
	{
		arrayMerge();
	}

	public static void arrayMerge()
	{
		int values1[];
		int values2[];
		int values3[];
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the size of array1:");
		int size1=scan.nextInt();
		values1=new int[size1];

		System.out.println("Enter the array 1:");
		for(int i=0;i<size1;i++)
		{
			values1[i]=scan.nextInt();
		}

		System.out.print("\nEnter the size of array2:");
		int size2=scan.nextInt();
		values2=new int[size2];

		System.out.println("Enter the array 2:");
		for(int j=0;j<size2;j++)
		{
			values2[j]=scan.nextInt();
		}

		int size3=size1+size2;
		values3=new int[size3];

		for(int j=0;j<size1;j++)
		{
			values3[j]=values1[j];
		}

		for(int j=size1,m=0;j<size3;j++,m++)
		{
			values3[j]=values2[m];
		}

		System.out.println("Concatenated Array:");
		for(int k=0;k<size3;k++)
		{
			System.out.println(values3[k]);
		}
	}
}