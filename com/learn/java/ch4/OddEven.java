import java.util.Scanner;
class OddEven
{
	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.print("Enter the a: ");
		int a=t.nextInt();
		System.out.println(((a % 2 == 1) ? "odd " + a : "even " +a));
	}
}