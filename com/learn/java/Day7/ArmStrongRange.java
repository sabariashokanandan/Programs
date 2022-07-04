import java.util.Scanner;

class ArmStrongRange
{
	public static void main(String[] args)
	{
		int power,val,first,last;

		Scanner scan = new Scanner(System.in);
		System.out.print("\n---------- ArmStrong Range ----------");
		System.out.print("\nStarting Range (100):");
		first=scan.nextInt();

		System.out.print("Ending Range (999):");
		last=scan.nextInt();

		System.out.println("Armstrong range from "+first+" to "+last+" are: ");
		for(int i=first;first <= last; first++)
		{
			int real = first;
			val = 0;
			while(real > 0)
			{
				power = real%10;
				val = val + (power*power*power);
				real=real/10;
			}

			if(val==first)
			{
				System.out.println(first+ " ");
			}
		}
	}
}