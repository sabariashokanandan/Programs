import java.util.Scanner;
import java.util.Arrays;

class ArraySplit
{
	public static void main(String[] args)
	{
		splitArray();
	}

	public static void splitArray()
	{
		int array;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nNumber of Arrays: ");
		array = scan.nextInt();

		int index[] = new int[array];
		System.out.println("\nIndex of Value is: ");
		for(int i=0;i<array;i++)
		{
			index[i] = scan.nextInt();
		}
		System.out.println("Number of Arrays is: "+array+" ,and the index Value is: "+ Arrays.toString(index));
		
		System.out.print("\nThe Array of Odd Element: ");
		for(int j=1;j<array;j+=2)
		{
			
			System.out.print( index[j]+" " );
		
		}
		
		System.out.println();
		System.out.print("\nThe Array of Even Element: ");
		for(int k=0;k<array;k+=2)		
		{
			System.out.print(index[k]+" ");
		}
		System.out.println();
	
	}
}