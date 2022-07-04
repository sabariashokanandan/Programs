import java.util.Scanner;

class Palindrome
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\nEnter the number:");
		int num=scan.nextInt(); //1000

		int real=num;
		int remaindervalue=0,reversedvalue=0;
		
		do
		{
			remaindervalue = real % 10; // (1000 % 10) = 0 (100 % 10) = 0 (10 % 10) = 0 (1 % 10) = 1
			reversedvalue = (reversedvalue * 10) + remaindervalue; // 0+0=0 0+0=0 0+0=0 0+1=1
			real = real / 10; // 1000/100=100 100/10=10 10/10=1 1/10=0

		}while(real!=0);

		System.out.println("Reversed value: " + reversedvalue);

		if(num == reversedvalue)
		{
			System.out.println(num + " is a palindrome");
		}
		else
		{
			System.out.println(num + " is not a palindrome");
		}
	}
}