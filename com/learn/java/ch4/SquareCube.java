import java.util.Scanner;

class SquareCube
{
	public static void main(String[] args)
	{
		int a,square,cube;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		a=scan.nextInt();
		square=a*a;
		cube=square*a;
		System.out.println("The square value= " +square);
		System.out.println("The cube value= " +cube);
	}
}