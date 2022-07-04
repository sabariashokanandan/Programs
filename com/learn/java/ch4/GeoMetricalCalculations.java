import java.util.Scanner;

class GeoMetricalCalculations
{
	public static void main(String[] args)
	{
		float pi=3.142f;
		int radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");		
		radius=sc.nextInt();
		float area=(float)pi*radius*radius;
		System.out.println("The area of circle is:" +area);
		rectangle();
		square();
	}
	public static void rectangle()
	{
		int width,length,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width");		
		width=sc.nextInt();
		System.out.println("Enter the lengtb");
		length=sc.nextInt();
		area=width*length;
		System.out.println("The area of rectangle is:" +area);
	}
	public static void square()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the side value of square: ");
		int side=scanner.nextInt();

		int area;
		area=side*side;
		System.out.println("The area of square is:" +area);
	}
}