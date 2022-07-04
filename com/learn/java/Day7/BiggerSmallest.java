import java.util.Scanner;
class BiggerSmallest
{
	public static void main(String[] args)
	{
		Scanner ob =new Scanner(System.in);
		System.out.print("\nEnter the number of values:");
		int n=ob.nextInt();
		int largest = Integer.MIN_VALUE; 
		int smallest = Integer.MAX_VALUE;
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++)
		{
			int current = ob.nextInt();//10 25 5 30 2
			if (current > largest) 
		    {
		    	largest = current; //10 25 30
		    } 
		    if (current < smallest) 
		    { 
		    	smallest = current;//10 5 2

		    }
		}
		System.out.println("The largest number is:" +largest);
		System.out.println("The smallest number is:" +smallest);
	}
}