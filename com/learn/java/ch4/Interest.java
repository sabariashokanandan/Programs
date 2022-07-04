import java.util.Scanner;
import java.io.*;

class Interest
{
	public static void main(String[] args)
	{
		Interest interest=new Interest();

		System.out.println("\n---------Simple interest------------");
		SimpleInterest();

		System.out.println("\n--------Compound interest-----------");
		interest.CompoundInterest();
	}

	public static void SimpleInterest()
	{
		double si,principal,rateofinterest,years;
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the value for principal amount");
		principal=scan.nextDouble();

		System.out.println("Enter the value for rate of interest");
		rateofinterest=scan.nextDouble();

		System.out.println("Enter the value for years");
		years=scan.nextDouble();

		si=(principal*rateofinterest*years)/100;
		System.out.println("Simple Interest= " +si);
	}

	public void CompoundInterest()
	{
		double ci,principal,rateofinterest,years;
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the value for principal amount");
		principal=scan.nextDouble();

		System.out.println("Enter the value for rate of interest");
		rateofinterest=scan.nextDouble();

		System.out.println("Enter the value for years");
		years=scan.nextDouble();

		ci=principal*Math.pow((1+rateofinterest/100),years);
		System.out.println("Compound Interest= " +ci);
	}
}