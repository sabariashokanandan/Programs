import java.util.Scanner;

class TotalGivenNumber2
{
	public static void main(String[] args) 
	{
		givenNumber();
	}

	public static void givenNumber()
	{
		 int i=1,num,totalSum=0,totalCount=0;
		 double totalAvg;
		 Scanner scan=new Scanner(System.in);

		 System.out.print("\nEnter the value:");
		 num=scan.nextInt();

		 while(i<=num)
		 {
		 	totalSum+=i;
		 	totalCount++;
		 	i++;
		 }

		 totalAvg=(double)totalSum/totalCount;

		 System.out.println("\nThe total of given number:"+totalSum);
		 System.out.println("\nThe Average of given number:"+totalAvg);
	}
}