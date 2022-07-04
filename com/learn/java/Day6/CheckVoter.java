import java.util.Scanner;

class CheckVoter
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age;
		String name;
		char gender;
		System.out.print("\nEnter the name:");
		name=sc.next();
		System.out.print("Age:");
		age=sc.nextInt();
		System.out.print("Gender:");
		gender=sc.next().charAt(0);

		if(age>=18)
		{
			if((gender=='m')||(gender=='M'))
			{
				System.out.print("Mr.");
			}
			else
			{
				System.out.print("Mrs.");
			}
			System.out.println(name+" IS eligible");
		}
		else
		{
			System.out.println(name+" are not eligible");
		}
	}
} 