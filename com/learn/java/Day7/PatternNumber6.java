import java.util.Scanner;
class PatternNumber6
{
	public static void main(String[] args) {
		printNumber();
	}
	public static void printNumber()
	{
		int number,increment;
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the number:");
		number=scan.nextInt();
		System.out.print("Enter the increment order::");
		increment=scan.nextInt();

		for(int i=1,q=1;i<=number-1;i++,q+=increment)// 1<=4
		{
			
			for(int k= number-1;k>=i;k--) // 4>=1
			{
				System.out.print("  ");
			}


			for(int j=i;j>=1;j--)   //1>=1
			{
				int colincrement=(j*increment)-1; //1*3 -1 =2
				System.out.print(colincrement +" ");
			}
			
			int colincrement=1;
		    for(int m=1;m<=i;m++)
			{

				System.out.print(colincrement+" ");
				colincrement+=increment;
			}

			System.out.println();
			
		}
		
		for(int i=number,l=1;i>=1;i--,l+=increment)//5>=1
		{
			for(int k= number-1;k>=i;k--)//4>=
			{
				System.out.print("  ");
			}

			for(int j=i;j>=1;j--)
			{
				int colincrement=(j*increment)-1;// 2 * 3 -1 =5
				System.out.print(colincrement+" ");// 5
			}
			int colincrement=1;
			for(int m=1;m<=i;m++)
			{
				System.out.print(colincrement+" ");
				colincrement+=increment;
			}

			System.out.println();
			
		} 
	}
}