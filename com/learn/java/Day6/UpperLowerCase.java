import java.util.Scanner;

class UpperLowerCase
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char data;
		System.out.print("\nEnter the character to check upper or lower case:");
		data=sc.next().charAt(0);
		if(Character.isUpperCase(data))
		{
			System.out.println("Character is uppercase");
		}
		else
		{
			System.out.println("Character is lowercase");
		}
	} 
}