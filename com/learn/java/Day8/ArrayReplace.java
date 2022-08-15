import java.util.Scanner;

import java.util.Arrays;

class ArrayReplace
{
	public static void main(String[] args)
	{
		findAndReplace();
	}

	public static void findAndReplace()
	{
		int array,search,rentry,count=0,replace;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nNumber of Arrays: ");
		array = scan.nextInt();

		int index[] = new int[array];
		System.out.println("\nNumber of index value: ");
		for(int i=0;i<array;i++)
		{
			index[i]=scan.nextInt();
		}
		do
		{
			System.out.println();
			System.out.print("\nArray of Value is: "+array+",and index value is: "+Arrays.toString(index));
			System.out.println();
		
			System.out.print("\nFind the Array index Value: ");
			search = scan.nextInt();
			 for(int j=0;j<array;j++)
			{
				if(index[j]==search)
				{
					System.out.print("\nReplace Value is: ");
					replace = scan.nextInt();
					index[j]=replace;
					count++;
				}
			}
			System.out.print("\nArray of Value is: "+array+",and index value is: "+Arrays.toString(index));
			System.out.println();
			if(count>0)
			{
				System.out.print("Index Modified");
				System.out.println();
			}
			else
			{
				System.out.print("Index Not Found");
				System.out.println();
			}
			System.out.print("\nContinue the Voting Process[Y/N]:");	//y	
			rentry = scan.next().charAt(0);
		}
		while((rentry =='Y') ||(rentry == 'y'));
	}
}