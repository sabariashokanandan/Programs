import java.util.Scanner;

class ArrayLargest1
{
	public static void main(String[] args) 
	{
		findLargest();
	}

	public static void findLargest()
	{
		int num[]=null;
        Scanner scan=new Scanner(System.in);

        int large1=0;
        int large2=0;

        System.out.print("\nEnter the size of array:");
        int size=scan.nextInt();
        num=new int[size];

        System.out.print("Enter the values:\n");
        for(int i=0;i<size;i++)
        {
            num[i]=scan.nextInt();
        }

        for (int i = 0; i < size; i++)//90 20 40 56 70
        {
            if (num[i] > large1)//90>0 20>90 56>90 70>90
            {
                    large2 = large1;//0 
                    large1 = num[i];//90
            }

            else if(num[i] > large2)//20>0 40>20 56>40 70>56
            {
                large2=num[i];//20 40 56 70
            }
    
        }

        System.out.println("The second largest is:"+large2); 
	}
}