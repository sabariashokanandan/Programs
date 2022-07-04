import java.util.Scanner;

class Cutoff
{
	public static void main(String[] args)
	{
		int  bio,physics,chemistry;
		float cutoff;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the marks:");
		System.out.print("Biology:");
		bio=sc.nextInt();
		System.out.print("Physics:");
		physics=sc.nextInt();
		System.out.print("Chemistry:");
		chemistry=sc.nextInt();
		cutoff=(bio/2)+(chemistry/4)+(physics/4);
		System.out.println("\n-------------------------------------");
		System.out.println("Your cutoff mark is :"+cutoff+":200");
		System.out.println("---------------------------------------")
		if(cutoff>=181)
		{
			System.out.println("YoU are eligible for MBBS");
		}
		else
		{
			System.out.println("You are not eligible for MBBS");
		}
	}
}