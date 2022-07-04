import java.util.Scanner;

class CheckGrade
{
	public static void main(String args[])
	{
		int bio,math,chemistry,physics,tamil;
		float average;
		Scanner sc=new Scanner(System.in);

		System.out.println("\n Enter the marks:");
		System.out.print("Biology:");
		bio=sc.nextInt();
		System.out.print("Maths:");
		math=sc.nextInt();
		System.out.print("Chemistry:");
		chemistry=sc.nextInt();
		System.out.print("Physics:");
		physics=sc.nextInt();
		System.out.print("Tamil:");
		tamil=sc.nextInt();

		average=(bio+math+chemistry+physics+tamil)/5;
		System.out.println("-------------------------------------");

		if(tamil>=35)
		{
			if(bio>=35)
			{
				if(math>=35)
				{
					if(chemistry>=35)
					{
						if(physics>=35)
						{
							System.out.println("You are passed");
						}
						else 
						{
							System.out.println("You are failed");
						}
					}
					else 
						{
							System.out.println("You are failed");
						}
				}
				else 
						{
							System.out.println("You are failed");
						}
			}
			else 
						{
							System.out.println("You are failed");
						}
		}
		else 
						{
							System.out.println("You are failed");
						}


		if(average>=80)
		{
			System.out.println("\ngrade is A");
		}
		else if(average>=60 && average<80)
		{
			System.out.println("\ngrade is B");
		}
		else if(average>=40 && average<60)
		{
			System.out.println("\ngrade is C");
		}
		else
		{
			System.out.println("\ngrade is D");
		}
	}
}