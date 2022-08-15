import java.util.Scanner;

class StringChange
{
	public static void main(String[] args)
	{
		stringModify();
	}

	public static void stringModify()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the your Statement: ");
		String str = scan.nextLine();
		String rev="";
		System.out.println("\nThe Given Statement into convert UpperCase: "+str.toUpperCase());

		System.out.println("\nThe Given Statement into convert LowerCase: "+str.toLowerCase());

		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("\nThe Given sentence is reversed: "+rev);
		System.out.println("\nEnter the your string position: ");
		int sub = scan.nextInt();
		System.out.println("\n"+str.substring(sub));
	}

}