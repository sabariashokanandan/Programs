import java.util.Scanner;

class ArrayLargest
{
	public static void main(String[] args) 
	{
		findLargest();
	}

	public static void findLargest()
	{
		int num[]
        Scanner scan=new Scanner(System.in);

        int large1=-100000;
        int large2=-100000;

        System.out.print("\nEnter the size of array:");
        int size=scan.nextInt();
        num=new int[size];

        System.out.print("Enter the values:\n");
        for(int i=0;i<size;i++)
        {
            num[i]=scan.nextInt();
        }

        for (int i = 0; i < size; i++)
        {
            if (num[i] > large1)
            {
                    large2 = large1;
                    large1 = num[i];
            }

            else if(num[i] > large2)
            {
                large2=num[i];
            }
    
        }

        System.out.println("The second largest is:"+large2); 
	}
}