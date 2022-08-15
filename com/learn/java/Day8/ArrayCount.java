import java.util.Scanner;
import java.util.Arrays;

class CountArray
{
	public static void main(String[] args)
	{
		arrayCount();
	}
	public static void arrayCount()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the Given index: ");
		int index = scan.nextInt();
		
		int[] array = new int[index];
		System.out.println("Enter Elements: ");
		for(int i=0;i<index;i++)
		{
			array[i] = scan.nextInt();
		
		}

		System.out.println("\nNumber of Arrays is: "+index+ ", and value of index is: "+Arrays.toString(array));

		Arrays.sort(array);
		for(int i=0;i<index-1;i++)
		{
			int count=1;
			for(int j=i+1;j<index;j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}
				else
				{
					break;
				}
				System.out.println();
				System.out.println("The index of array value is "+array[i]+" ,and it's comes "+ count+" times.");
				i+=(count-1);
			}
		}		

	}
}