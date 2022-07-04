import java.util.Scanner;

class OddEvenAverage
{
	public static void main(String[] args)
	{
		int odd,even,start,end,totalodd=0,totaleven=0,averageodd,averageeven,countodd=0,counteven=0;
		Scanner scan =new Scanner(System.in);

		System.out.print("\nEnter the start range:");
		start = scan.nextInt();
		System.out.print("Enter the end range:");
		end=scan.nextInt();

		System.out .println("The given range from " + start +" to " +end);
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				{
					totaleven = i+totaleven;
					counteven++;
		        }
		    else 
				{
		            totalodd=i+totalodd;
		            countodd++;
		        }

		}

		averageeven = totaleven/counteven;
		averageodd = totalodd/countodd;


		System.out.println("The total of odd is :" + totalodd + " and average is :" +averageodd);
		System.out.println("The total of even is :" + totaleven + " and average is :" +averageeven);
	}
}