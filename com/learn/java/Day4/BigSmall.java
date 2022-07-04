import java.util.Scanner;
class BigSmall
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value for a,b and c");
	int a=s.nextInt(); //5
	int b=s.nextInt(); //8
	int c=s.nextInt(); //3
	int d;
	d=a>b?a:b;  //8
	System.out.println("The biggest is " +(d>c ? d : c)); //8
	d=a<b?a:b; //5<8 <-5
	System.out.println("The smallest is " +(d<c ? d : c)); //5
	}
}