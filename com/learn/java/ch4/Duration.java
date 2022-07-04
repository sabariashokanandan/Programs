import java.util.Scanner;

class Duration
{
	public static void main(String[] args)
	{
		float distance,speed,time;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the distance in km");
		distance=scan.nextFloat();
		System.out.println("Enter the speed in kmph");
		speed=scan.nextFloat();
		time=distance/speed;
		System.out.println("The duration is: " +time);
	}
}