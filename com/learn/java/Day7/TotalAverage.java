import java.util.Scanner;

class TotalAverage
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int n1,n2,sum=0,count=0;
		System.out.print("\nThe starting range:");
		n1=ob.nextInt();
		System.out.print("The ending range:");
		n2=ob.nextInt();

		for(int i=n1;i<=n2;i++)
		{
			sum+=i;
			++count;
		}
		
		float average=sum/count;
		System.out.println("The Total:"+sum);
		System.out.printf("The Average:"+count);
	}
}