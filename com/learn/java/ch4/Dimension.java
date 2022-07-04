import java.util.Scanner;

class Dimension
{
	public static void main(String[] args)
	{
		int l,w,a,square,rectangle;
		float pi,r,circle;
		pi=3.14f;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		l=scan.nextInt();
		System.out.println("Enter the width of rectangle");
		w=scan.nextInt();
		rectangle=2*(l+w);
		System.out.println("The perimeter of rectangle is: " +rectangle);
		System.out.println("Enter the length of square");
		a=scan.nextInt();
		square=4*a;
		System.out.println("The perimeter of square is: " +square);
		System.out.println("Enter the radius of circle");
		r=scan.nextFloat();
		circle=2*pi*r;
		System.out.println("The circumference of circle is: " +circle);
	}
}

