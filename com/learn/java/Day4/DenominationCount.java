import java.util.Scanner;

class DenominationCount
{
	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		int cash2000,cash500,cash200,cash100,cash50,cash20,cash10,coins,amt;
		System.out.println("\nEnter the denominations");
		System.out.print(" 2000 =");
		cash2000= sc.nextInt();

		System.out.print("  500 =");
		cash500= sc.nextInt();

		System.out.print("  200 =");
		cash200= sc.nextInt();

		System.out.print("  100 =");
		cash100= sc.nextInt();

		System.out.print("   50 =");
		cash50= sc.nextInt();

		System.out.print("   20 =");
		cash20= sc.nextInt();

		System.out.print("   10 =");
		cash10= sc.nextInt();

		System.out.print("   coins =");
		coins=sc.nextInt();	

		cash2000=(cash2000*2000);
		cash500=(cash500*500);
		cash200=(cash200*200);
		cash100=(cash100*100);
		cash50=(cash50*50);
		cash20=(cash20*20);
		cash10=(cash10*10);
		coins= (coins<=9) ? coins : 0;

		amt=cash2000+cash500+cash200+cash100+cash50+cash20+cash10+coins;
		System.out.println("-------------------------------------");
		System.out.println("Total =" +amt);
	}
}