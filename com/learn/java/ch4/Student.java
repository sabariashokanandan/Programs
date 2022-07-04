import java.util.Scanner;

class Student
{
	public static void main(String[] args)
	{
		int eng,mat,sci,bio,tam;
		double ave,per,tot;
//single line comment
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the english marks");
		eng=scan.nextInt();
		System.out.println("Enter the maths marks");
		mat=scan.nextInt();
		System.out.println("Enter the biology marks");
		bio=scan.nextInt();
		System.out.println("Enter the science marks");
		sci=scan.nextInt();
		System.out.println("Enter the tamil marks");
		tam=scan.nextInt();
/*multiline
comment*/
		tot=eng+mat+bio+sci+tam;
		ave=tot/5;
		per=(tot/1000)*100;
		System.out.println("The total= " +tot);
		System.out.println("The average= " +ave);
		System.out.println("The percentage= " +per);
	}
}