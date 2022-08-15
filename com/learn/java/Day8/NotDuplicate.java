import java.util.Scanner;
import java.util.Arrays;

class NotDuplicate
{
	public static void main(String[] args)
	{
		notDuplication();
	}

	public static void notDuplication()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nGiven Array Size: ");
		int index = scan.nextInt();

		int check=Integer.MIN_VALUE;
		int[] array = new int[index];
		System.out.println("Enter the array  Value: ");
		for(int i=0;i<index;i++)
		{
			array[i]=scan.nextInt();
			if(array[i]>check)
			{
				check=array[i];
			}
			else if(array[i]==check)
			{
				System.out.println("Duplicate not allowed. Please enter another number.");
				i--;
			}
			else
			{
				System.out.println("Number must be greater than previous Value.");
				i--;
			}
		}
		System.out.print("\nArray of given ");
		for(int i=0;i<index;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}	
}