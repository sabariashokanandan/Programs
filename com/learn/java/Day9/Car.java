import java.util.Scanner;

class Car
{
	public static void main(String[] args) 
	{
		//Car cars=new Car();
		//cars.carDetails();
		carDetails();
	}

	public static void carDetails()
	{
		Scanner scan=new Scanner(System.in);
		String carName,carModel;
		int price,speed,number;
		System.out.print("Enter the car name:");
		carName=scan.nextLine();
		System.out.print("Enter the car model:");
		carModel=scan.next();
		System.out.print("Enter the car price:");
		price=scan.nextInt();
		System.out.print("Enter the car number:");
		number=scan.nextInt();
		System.out.print("Enter the car speed(km/hr):");
		speed=scan.nextInt();

		System.out.println("\nCar details:\n");
		System.out.println("Car name:"+carName);
		System.out.println("Car model:"+carModel);
		System.out.println("Car price:"+price);
		System.out.println("Car no:"+number);
		System.out.println("Car speed:"+speed+" km/hr");


	}
}