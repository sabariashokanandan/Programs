import java.util.Scanner;

class ArrayOccurance
{
	public static void main(String[] args) {
		findOccurance();
	}

	public static void findOccurance()
	{
		int values[]=new int[20];
		int check;
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the size of array:");
		int size=scan.nextInt();

		System.out.print("Enter the values:\n");
		for(int i=0;i<size;i++)
		{
			values[i]=scan.nextInt();
		}

		System.out.print("\nEnter the number to find ocurrence in array:");
		check=scan.nextInt();

		for(int i=0;i<size;i++)
		{
			if(check==values[i])
			{
				System.out.println("The occurence of "+check+" is "+"values["+i+"]");
				
			}
	
		}

	}
}