import java.util.Scanner;

class ArrayOccurance
{
	public static void main(String[] args) {
		findOccurance();
	}

	public static void findOccurance()
	{
		int values[]={47,65,34,98,23};
		int check;
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the number to find ocurrence in array:");
		check=scan.nextInt();

		for(int i=0;i<values.length;i++)
		{
			if(check==values[i])
			{
				System.out.println("The occurence of "+check+" is "+"values["+i+"]");
				break;
			}
			else 
			{
				System.out.println("The no occurences found");
				
			}
		}

	}
}