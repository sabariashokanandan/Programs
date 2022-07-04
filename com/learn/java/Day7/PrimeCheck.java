import java.util.Scanner;

class PrimeCheck
{
	public static void main(String[] args) 
	{
	int number;
	Scanner scan=new Scanner(System.in);
	boolean isPrime= true;
	System.out.print("\nEnter the value: ");
	number=scan.nextInt();

	if(number >=1)
	{
		for(int i=2;i<=number/2;i++) //2<13 //2<12 //checks given which divisible by which numbers
		{
			if(number%i == 0) //1=0 //0=0 condition true when non prime number remainder gives 0
			{
				isPrime= false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(number + " is Prime number");
		}
		else
		{
			System.out.println(number + " is not a prime number");
		}
	}	
	else
	{
		System.out.println("Please Enter Correct value");
	}
	}
}