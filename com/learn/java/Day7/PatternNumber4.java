import java.util.Scanner;  

public class PatternNumber4
{
	public static void main(String[] args) 
	{
		printNumber();
		
	}
	
	public static void printNumber()
	{
		int i, j, number;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number : ");  
		number = sc.nextInt();          
		for (i= 1; i<= number; i++)  
		{  
			for (j=1; j<i+1; j++)   
			{  
				System.out.print(j+ " ");  
			}   
			System.out.println("");   
		} 

		for (i=number-1; i>=0; i--)  
		{  
			for(j=1; j < i+1;j++)  
			{  
				System.out.print(j+ " ");  
			}  
			System.out.println("");  
		}  
	}
}