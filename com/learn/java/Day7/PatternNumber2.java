import java.util.Scanner;

class PatternNumber2
{
	public static void main(String[] args) 
	{
		printNumber();
	}

	public static void printNumber()
	{
		int number,incrementOrder;

		/** Receiving input **/
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the number:");
		number=scan.nextInt();

		System.out.print("Enter increment order:");
		incrementOrder=scan.nextInt();

		/** Processingg input and Printing output **/
		for(int i=1;i<=number;i++) 
		{
			for(int j=1,k=1;j<=i;j++,k+=incrementOrder)
			{
				
				System.out.print(k+" ");
				
			}
			System.out.println("");
		}
	}

}