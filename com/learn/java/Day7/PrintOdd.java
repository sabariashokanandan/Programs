import java.util.Scanner;
class PrintOdd
{
	public static void main(String[] args)
	{
		Scanner ob =new Scanner(System.in);
		System.out.print("\nEnter the Starting range:");
		int n1=ob.nextInt();
		System.out.print("Enter the Ending range:");
		int n2=ob.nextInt();
		System.out.println("The odd values are:");
		for(int i=n1;i<=n2;i++)
		{
			int remainder = i%2;
			if (remainder!=0) 
		    {
		    	System.out.println(i);
		    } 
		    
		}
	}
}