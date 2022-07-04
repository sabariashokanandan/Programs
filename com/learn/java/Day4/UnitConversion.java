import java.util.Scanner;

class UnitConversion
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		float cm,m,inch,sqft,gms,rupees,fahrenheit;

		System.out.println("\nEnter the values");

		System.out.print("centimetere =");
		cm=ob.nextInt();
		metreconversion(cm);

		System.out.print("metere =");
		m=ob.nextInt();
		kilometreconversion(m);

		System.out.print("inch =");
		inch=ob.nextInt();
		feetconversion(inch);

		System.out.print("sqft =");
		sqft=ob.nextInt();
		centconversion(sqft);

		System.out.print("grams =");
		gms=ob.nextInt();
		kilogramconversion(gms);

		System.out.print("rupees =");
		rupees=ob.nextInt();
		dollarconversion(rupees);

		System.out.print("fahrenheit =");
		fahrenheit=ob.nextInt();
		celsiusconversion(fahrenheit);
	}

	public static void metreconversion(float cen)
	{
		float metere=cen/100;
		System.out.println("metere =" +metere);
	}

	public static void kilometreconversion(float meter)
	{
		float km=meter/1000;
		System.out.println("kilometre =" +km);
	}
	public static void feetconversion(float inc)
	{
		float feet=inc/12;
		System.out.println("feet =" +feet);
	}
	public static void centconversion(float sqrft)
	{
		double cent=sqrft*0.0023;
		System.out.println("cent =" +cent);
	}
	public static void kilogramconversion(float grams)
	{
		float kg=grams/1000;
		System.out.println("kilogram= " +kg);
	}
	public static void dollarconversion(float rupee)
	{
		double dollar=rupee*76.75;
		System.out.println("dollar =" +dollar);
	}
	public static void celsiusconversion(float fahren)
	{
		float celsius=(fahren - 32) * 5/9;
		System.out.println("celsius =" +celsius);
	}
}