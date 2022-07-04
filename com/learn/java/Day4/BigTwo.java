import java.util.Scanner;
class BigTwo
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the value a and b ");
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c;
		System.out.println("The biggest value is " +(c=a>b? a :b));
	}
}