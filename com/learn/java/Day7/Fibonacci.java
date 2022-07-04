import java.util.Scanner;

class Fibonacci
{
	public static void main(String[] args)
	{
		int a=0,b=1,c;
		Scanner ob=new Scanner(System.in);
		System.out.print("\nEnter the value:");
		int count=ob.nextInt();
		for(int i=0;i<count;++i) //0 //1 2
		{
			System.out.print(a +"\t"); //0 //1 1
			c=a+b; //1 2 
			a=b; //1 1
			b=c; //1 2
		}
	}
}