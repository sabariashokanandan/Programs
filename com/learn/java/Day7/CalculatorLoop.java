import java.util.Scanner;
class CalculatorLoop
{
	public static void main(String[] args)
	{
		int a,b,c;
		char ex,value;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("\nSimple Calculator");
		System.out.println("******************************");
		System.out.println("+ -> Addition");
		System.out.println("- ->Subtraction");
		System.out.println("* ->Multiplication");
		System.out.println("/ ->Division");
		System.out.println("% ->Modulo division");
		System.out.print("Enter the your choice:");
		ex=sc.next().charAt(0);
		switch(ex)
		{
		case '+':
			System.out.print("First number: ");
			a=sc.nextInt();
			System.out.print("Second number: ");
			b=sc.nextInt();
			c=a+b;
			System.out.print("Addition of the numbers: "+c);
			break;
		case '-':
			System.out.print("First number: ");
			a=sc.nextInt();
			System.out.print("Second number: ");
			b=sc.nextInt();
			c=a-b;
			System.out.print("Subtraction of the numbers: "+c);
			break;
		case '*':
			System.out.print("First number: ");
			a=sc.nextInt();
			System.out.print("Second number: ");
			b=sc.nextInt();
			c=a*b;
			System.out.print("Multiplication of the numbers: "+c);
			break;
		case '/':
			System.out.print("First number: ");
			a=sc.nextInt();
			System.out.print("Second number: ");
			b=sc.nextInt();
			c=a/b;
			System.out.print("Division of the numbers: "+c);
			break;
		case '%':
			System.out.print("First number: ");
			a=sc.nextInt();
			System.out.print("Second number: ");
			b=sc.nextInt();
			c=a%b;
			System.out.print("Modulo division of the numbers: "+c);
			break;
		default:
			System.out.print("invalid operation");
			break;
		}
		System.out.println("\nDo you want to make another calculation(y/n)?:");
		value=sc.next().charAt(0);
	    }while(value=='y');
	    System.out.println("Thank you for using calculator");
	}
}