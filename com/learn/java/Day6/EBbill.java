import java.util.Scanner;

class EBbill
{
	public static void main(String[] args)
	{
		double amt;
		int unit;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the unit: ");
		unit=sc.nextInt();
		if(unit<=100)
		{
			amt=0;
		}
		else if(unit<=300)
		{
			amt=(unit-100)*2.50;
		}
		else if(unit<=500)
		{
			amt=(unit-100)*3;
		}
		else if(unit<=1000)
		{
			amt=(unit-100)*6;
		}
		else
		{
			amt=(unit-100)*7;
		}
		System.out.println("The amount to be paid: "+amt);
	}
}