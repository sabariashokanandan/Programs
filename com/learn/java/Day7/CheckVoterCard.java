import java.util.Scanner;

class CheckVoterCard
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age,maleCount=0,femaleCount=0,transgenderCount=0,Eligiblemale=0,Eligiblefemale=0,Eligibletransgender=0;
		String name;
		char gender,Value,gender2;

		do
		{

				System.out.print("\nEnter the name:");
				name=sc.next();

				System.out.print("Age:");
				age=sc.nextInt();

				while(age>100)
				{
					System.out.println("Error: give range 0-100");
					System.out.print("Age:");
				    age=sc.nextInt();
				}

				System.out.print("Gender:");
				gender=sc.next().charAt(0);
				gender2=Character.toUpperCase(gender);

				while((gender2!='M')&&(gender2!='F')&&(gender2!='T'))
				{
					System.out.println("Error: give gender m,f,t");
					System.out.print("Gender:");
					gender=sc.next().charAt(0);
				} 

				if((gender2=='M'))
					{
						System.out.print("Mr.");
						++maleCount;
					}
					else if((gender2=='F'))
					{
						System.out.print("Mrs.");
						++femaleCount;
					}

					else
					{
						System.out.print("Mrs.");
						++transgenderCount;
					}

				if(age>=18)
				{
			
					System.out.println(name+" is eligible");
			
					if((gender2=='M'))
					{ 
						++Eligiblemale;
					}
					else if((gender2=='F'))
					{
						++Eligiblefemale;
					}
					else
					{
						++Eligibletransgender;
					}		
				}

				else

				{
						System.out.println(name+" is not eligible");
				}

				System.out.print("\tContinue(y/n)?:");
				Value=sc.next().charAt(0);
		
		}while(Value=='y'||Value=='Y');

		System.out.println("\nNumber of Candidates visited:" +(maleCount+femaleCount+transgenderCount));
		System.out.println("Male: " +maleCount);
		System.out.println("Female: " +femaleCount);
		System.out.println("Transgender: " +transgenderCount);

		System.out.println("\nOverall eligible:" +(Eligiblemale+Eligiblefemale+Eligibletransgender));
		System.out.println("Male: " +Eligiblemale);
		System.out.println("Female: " +Eligiblefemale);
		System.out.println("Transgender: " +Eligibletransgender);
		
		System.out.println("\nNot eligible:" +((maleCount+femaleCount+transgenderCount)-(Eligiblemale+Eligiblefemale+Eligibletransgender)));
		System.out.println("Male: " +(maleCount-Eligiblemale));
		System.out.println("Female: " +(femaleCount-Eligiblefemale));
		System.out.println("Transgender: " +(transgenderCount-Eligibletransgender));
	}
} 