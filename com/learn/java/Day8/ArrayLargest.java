import java.util.Scanner;

class ArrayLargest
{
	public static void main(String[] args) 
	{
		findLargest();
	}

	public static void findLargest()
	{
		int numbers[]={30,20,90,40,50};
		int temp,size=numbers.length;
		for (int i = 0; i < size; i++)    // 0 < 5
        {  
            for (int j = i + 1; j < size; j++)   //1 < 5
            {  
                if (numbers[i] > numbers[j])   //90 > 30
                {  
                    temp = numbers[i];  //90
                    numbers[i] = numbers[j];  //20
                    numbers[j] = temp;  //90
                }  
            }  
        }
        System.out.print(i);
        for(int i=0;i<size;i++)
        {
        	System.out.println(numbers[i]);
        }
        System.out.println("the second largest element is : "+numbers[size-2]); 
	}
}