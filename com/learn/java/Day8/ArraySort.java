import java.util.Scanner;
class ArraySort
{
	public static void main(String[] args) 
	{
		sortArray();
	}
	public static void sortArray()
	{
		Scanner scan=new Scanner(System.in);
		int num[];
		char order;
		int temp;

		System.out.print("\nEnter the size of array:");
		int size=scan.nextInt();
		num=new int[size];

		System.out.print("Enter the values:\n");
		for(int i=0;i<size;i++)
		{
			num[i]=scan.nextInt();
		}

		System.out.print("\nEnter the order(a/d):");
		order=scan.next().charAt(0);

		if(Character.toLowerCase(order)=='a')
		{
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					if(num[i]>num[j])
					{
						temp=num[i];
						num[i]=num[j];
						num[j]=temp;
					}
				}
			}
		}

		else if(Character.toLowerCase(order)=='d')
		{
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					if(num[i]<num[j])
					{
						temp=num[i];
						num[i]=num[j];
						num[j]=temp;
					}
				}
			}
		}

		System.out.println(Character.toLowerCase(order) == 'a' ? "Ascending Order:" : "Descending Order:");

		for(int k=0;k<size;k++)
		{
			System.out.println(num[k]);
		}
	}
}