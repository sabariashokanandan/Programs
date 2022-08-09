import java.util.Scanner;

class ArrayOccurance
{
	public static void main(String[] args) {
		findOccurance();
	}

	public static void findOccurance()
	{
		int values[];
		int check;
		boolean countOccurence=false;
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the size of array:");
		int size=scan.nextInt();
		values=new int[size];

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
				countOccurence=true;
				
			}
	
		}
		if(countOccurence==false)// check this condition as tree ways(boolean!=true)
		{
			//System.out.println("The occurence of "+check+" is "+"values["+index+"]");
			System.out.println("Not found");
		}
		/*else 
		{
			System.out.println("Not found");
		}*/

	}
}