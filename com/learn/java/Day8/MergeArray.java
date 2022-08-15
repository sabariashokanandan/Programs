import java.util.Scanner;
import java.util.Arrays;

class MergeArray
{
	public static void main(String[] args)
	{
		mergeArray();
	}

	public static void mergeArray()
	{
		int firstArray,secondArray;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nNumber of First Array Value is: ");
		firstArray = scan.nextInt();

		int index[] = new int[firstArray];
		System.out.println("\nIndex Value is: ");
		for(int i=0;i<firstArray;i++)
		{
			index[i]= scan.nextInt();
		}
	
		System.out.print("\nNumber of Second Array Value is: ");
		secondArray = scan.nextInt();

		int index1[] = new int[secondArray];
		System.out.println("\nIndex Value is: ");
		for(int j=0;j<secondArray;j++)
		{
			index1[j]= scan.nextInt();
		}
		System.out.println("Number of First Arrays is: "+firstArray+" ,and the index Value is: "+ Arrays.toString(index));
		System.out.println("Number of Second Arrays is: "+secondArray+" ,and the index Value is: "+ Arrays.toString(index1));

		int[] merge = new int[index.length+index1.length];
		int count=0;

		for(int k=0;k<index.length;k++)
		{
			merge[k]=index[k];
			count++;
		}

		for(int l=0;l<index1.length;l++)
		{
			merge[count++] = index1[l];
		}
		
		System.out.print("\nThe Merge of Two Arrays value is: ");

		for(int m =0;m<merge.length;m++)
		{
			System.out.print("["+merge[m]+"] ");
		}
	}
}