import java.util.Scanner;
class ArrayReverseGiven
{
	public static void main(String[] args) {
		printReverse();
	}

	public static void printReverse()
	{
		Scanner scan=new Scanner(System.in);
		int	num[]=new int[5];

		System.out.println("Enter the five numbers:");
		for(int i=0;i<num.length;i++)
		{
			num[i]=scan.nextInt();
		}

		System.out.println("Array elements are: ");  
		for(int i=0;i<num.length;i++)
		{
			System.out.println("num["+i+"]="+num[i]);
		}
		System.out.println();
		
		System.out.println("Reverse order:");
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println("num["+i+"]="+num[i]);
		}
	}
}