import java.util.Scanner;

class ArrayLargest1
{
	public static void main(String[] args) 
	{
		findLargest();
	}

	public static void findLargest()
	{
		float num[]=null;
        Scanner scan=new Scanner(System.in);

        System.out.print("\nEnter the size of array:");
        int size=scan.nextInt();
        num=new float[size];

        System.out.print("Enter the values:\n");
        for(int i=0;i<size;i++)
        {
            num[i]=scan.nextFloat();
        }

        float large1=num[0];
        float large2=num[0];

        for (int i = 0; i < size; i++)//90 20 40 56 70
        {
            if (num[i] > large1)//90>90 20>90 56>90 70>90
            {
                    large2 = large1;//0 
                    large1 = num[i];//90
            }

            if(num[i] > large2 && num[i]<large1)//90>20 40>20 56>40 70>56
            {
                large2=num[i];//90 40 56 70
            }
    
        }

        System.out.println("The second largest is:"+large2); 
	}
}