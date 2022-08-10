import java.util.Scanner;

class NotDuplicate
{
	public static void main(String[] args)
	{
		withoutDuplicates();
	}

	public static void withoutDuplicates()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the Array size: ");
		int size = scan.nextInt();

		int num[] = new int[size];
		int temp;

		System.out.println("\nEnter the Array values: ");
		for(int i=0;i<size;i++)
		{
			temp=scan.nextInt();//1

			for(int j=0;j<size;j++)
			{
				if(temp!=num[j])//1==1
				{
					num[i]=temp;
				}

				else 
				{
					System.out.println("Duplicate not allowed");
					System.out.println("Enter another number");
					break;
				}
			}
		}

		System.out.print("\nArray values: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(num[i]+" ");
		}

	}
}