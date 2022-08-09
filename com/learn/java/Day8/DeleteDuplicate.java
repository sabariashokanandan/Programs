import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)
    {
        removeduplicates();

 
    public static void removeduplicates(int a[], int n)
    {

    	int num[];
		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter the size of array:");
		int size=scan.nextInt();
		num=new int[size];


		System.out.print("Enter the values:\n");
		for(int i=0;i<size;i++)
		{
			num[i]=scan.nextInt();
		}

        int[] temp = new int[size];
        int j = 0;
 
        for (int i = 0; i < size - 1; i++) 
        {
            if (num[i] != num[i + 1]) 
            {
                temp[j++] = num[i];
            }
        }
 
        temp[j++] = num[n - 1];
 
        for (int i = 0; i < j; i++) 
        {
            num[i] = temp[i];
        }
 
       for (int i = 0; i < a.length; i++)
       {
            System.out.print(num[i] + " "); 
       }
    
    }
    
}