import java.util.Scanner;

class ArraySmallest
{
	public static void main(String[] args) 
	{
		findSmallest();
	}

	public static void findSmallest()
	{
		int num[];
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the size of array:");
		int size=scan.nextInt();
		num=new int[size];


		System.out.print("Enter the values:\n");
		for(int i=0;i<size;i++)
		{
			num[i]=scan.nextInt();
		}

		
		int low1=num[size-1];//Integer.MAX_VALUE;
		int low2=num[size-1];//Integer.MAX_VALUE;
		int low3=num[size-1];//Integer.MAX_VALUE;


		for (int i = 0; i < size; i++)
		{
			if (num[i] < low1)
			{
					low3 = low2;
               		low2 = low1;
               		low1 = num[i];
			}

			else if(num[i] < low2)
			{
				low3=low2;
				low2=num[i];
			}
			else if(num[i]<low3)
			{
				low3=num[i];
			}
			
		}

		System.out.println("The third smallest is:"+low3);
	}
}