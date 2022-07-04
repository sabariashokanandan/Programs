import java.util.Scanner;
class BiggestSmall
{
	public static void main(String[] args)
	{
		int a,b,c; 
		Scanner ob=new Scanner(System.in);
		System.out.print("\nEnter a:");
		a=ob.nextInt();
		System.out.print("Enter b:");
		b=ob.nextInt();
		System.out.print("Enter c:");
		c=ob.nextInt();
		if(a>=b && a>=c) // 5>=5 && 5>=10
		{
			System.out.println(a+" is largest");
		}
		else if(b>=c) // 5 >=10
		{
			System.out.println(b+" is largest");
		}
		else
		{
			System.out.println(c+" is largest");
		}
		if(a<=b && a<=c)
		{
			System.out.println(a+" is smallest");
		}
		else if(b<=c)
		{
			System.out.println(b+" is smallest");
		}
		else
		{
			System.out.println(c+" is smallest");
		}
	}
}