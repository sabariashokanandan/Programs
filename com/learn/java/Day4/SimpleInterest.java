import java.util.Scanner;

class SimpleInterest
{
	
	public static void main(String[] args)
	{
		System.out.println("\n-----------Simple interest--------------");
		interestcalculation();
	}


	public static void interestcalculation()
	{
		float principal,rateofInterest,si,net,month,years,percent,days;

		Scanner ob=new Scanner(System.in);

		System.out.print("\nEnter the principal amount: ");
		principal=ob.nextInt();

		System.out.print("Enter the rate of interest: ");
		rateofInterest=ob.nextInt();

		rateofInterest=rateofInterest/365;

		System.out.print("Enter the no of days: ");
		days=ob.nextInt();

		System.out.println("-------------------------------");
		si=principal*rateofInterest*days/100;

		month=(si/days)*30;

		years=(si/days)*365;

		net=(int)si+(int)principal;

		percent=(si*100)/principal;
		
		System.out.println("Simple Interest: " +si);
		System.out.println("Net amount: " +net);
		System.out.println("Month get:" +month);
		System.out.println("Year get:" +years);
		System.out.println("Percentage: " +percent);
	}
	
}