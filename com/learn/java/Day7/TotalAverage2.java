import java.util.Scanner;

class TotalAverage2
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int n1,n2,sumodd=0,countodd=0,sumeven=0,counteven=0;
		System.out.print("\nThe starting range:");
		n1=ob.nextInt();
		System.out.print("The ending range:");
		n2=ob.nextInt();

		for(int i=n1;i<=n2;i++)
		{
			if(i%2!=0)
			{
			sumodd+=i;
			++countodd;
			}
			else
			{
			sumeven+=i;
			counteven++;
			}
		}
		
		float average1=sumodd/countodd;

		float average2=sumeven/counteven;

		System.out.println("\nThe Total of odd:"+sumodd);
		System.out.println("The Average of odd:"+countodd);

		System.out.println("The Total of even:"+sumeven);
		System.out.println("The Average of even:"+counteven);
	}
}