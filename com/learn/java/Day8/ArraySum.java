import java.util.Scanner;

class ArraySum
{
	public static void main(String[] args) {
		printSum();
	}

	public static void printSum()
	{
		Scanner scan=new Scanner(System.in);
		int num[];
		int oddSum=0,evenSum=0;

		System.out.println("\nEnter the n:");
		int n=scan.nextInt();
		num=new int[n];

		System.out.println("Enter the"+n+" numbers:");
		for(int i=0;i<n;i++)
		{
			num[i]=scan.nextInt();
		}

		for(int i=0;i<n;i++)//num[0]+num[2]=even num[1]+num[3]=odd
		{
			if(i%2==0)
			{
				evenSum+=num[i];
			}
			else 
			{
				oddSum+=num[i];
			}
		}
		System.out.println("The dum of odd position:"+oddSum);
		System.out.println("The sum of even position:"+evenSum);
	}
}