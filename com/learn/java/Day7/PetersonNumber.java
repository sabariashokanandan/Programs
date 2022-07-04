import java.util.Scanner;

class PetersonNumber
{
	public static void main(String[] args) 
	{
		int realNumber,result=0,copy,remain,k,fact;
		Scanner scan=new Scanner(System.in);

		System.out.print("\n Enter the number:");
		realNumber=scan.nextInt();

		copy=realNumber;
		while(copy>0) //145>0 //14
		{
			fact=1;
			k=1;
			remain=copy%10; //5 //4

			while(k<=remain) //1<=5 //1<=4
			{
				fact=fact*k; //120 
				k++;         //2
			}
			result=result+fact; //0+120
			copy=copy/10;  //14
		}

		if(realNumber==result)
		{
			System.out.println("\n "+realNumber+" is a Strong number");
		}

		 else
		 {
		 	System.out.println("\n "+realNumber+" is not a Strong number");
		 }
	}
}