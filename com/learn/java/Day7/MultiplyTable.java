import java.util.Scanner;

class MultiplyTable
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int n,multiply;

		System.out.println("\n---------Multiple table---------");
		System.out.print("\nGive Multiply value :");
		multiply=scan.nextInt();

		System.out.print("\nNumber of Time Multiply: ");
		n=scan.nextInt();

		for(int i=1;i<=n;i++)
		{
			System.out.printf("%2d x %2d = %3d \n",i,multiply,multiply*i);
			
		}
		
	}
}