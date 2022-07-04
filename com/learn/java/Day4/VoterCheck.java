import java.util.Scanner;
class VoterCheck
{
	public static void main(String args[])
	{
		int age;
		String name;
		char gender;
		Scanner ob=new Scanner(System.in);
		System.out.print("\nEnter the name:");
		name=ob.next();
		System.out.print("Enter the gender:");
		gender=ob.next().charAt(0);
		System.out.print("Enter the age of voter: ");
		age=ob.nextInt();
		System.out.print(gender =='m'|| gender=='M' ? "Mr." : "Mrs.")
		System.out.println(name+ " is " +((age >= 18)  ? "Eligible" : "Not eligible"));
	}
}