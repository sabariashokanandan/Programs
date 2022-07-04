import java.util.Scanner;

class TotalGivenNumber
{
	public static void main(String[] args) 
	{
		givenOddEven();
	}

	public static void givenOddEven()
	{
		 int i=1,num,oddSum=0,evenSum=0,oddCount=0,evenCount=0;
		 double evenAvg, oddAvg;
		 Scanner scan=new Scanner(System.in);

		 System.out.print("\nEnter the value:");
		 num=scan.nextInt();

		 while(i<=num)
		 {
		 	if(i%2==0)
		 	{
		 		evenSum+=i;
		 		evenCount++;
		 	}
		 	else
		 	{
		 		oddSum+=i;
		 		oddCount++;
		 	}

		 	i++;
		 }

		 evenAvg=(double)evenSum/evenCount;
		 oddAvg=(double)oddSum/oddCount;

		 System.out.println("\nThe total of Odd:"+oddSum);
		 System.out.println("The total of Even:"+evenSum);
		 System.out.println("\nThe Average of Odd number:"+oddAvg);
		 System.out.println("The Average of Even number:"+evenAvg);
	}
}