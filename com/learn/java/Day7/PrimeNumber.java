import java.util.Scanner;

class PrimeNumber
{
	public static void main(String[] args) 
	{
		int number,count,range;
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter Range: ");
		range=scan.nextInt();
		System.out.println("Prime numbers between 1 to "+range+" are ");

		if(range>=1)
		{
			for(int i=2;i<=range;i++)
			{
				count=0;
				for(number=1;number<=i;number++)
				{
					if(i%number==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(i+" ");
				}
			}
		}
		else 
		{
			System.out.println("Give minium range 2.");
		}
	}
}