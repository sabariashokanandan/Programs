import java.util.Scanner;

class ArraySmallest
{
	public static void main(String[] args) 
	{
		findSmallest();
	}

	public static void findSmallest()
	{
		int num[]={70,50,90,20,10};
		int temp,temp1,size=num.length;

		for (int i = 0; i < size; i++)
		{
			for (int j = i + 1; j < size; j++)
			{
				if (num[i] > num[j])
				{
					temp = num[i];
               		num[i] = num[j];
               		num[j] = temp;
				}
			}
		}

		System.out.println("The third smallest is:"+num[size-3]);
	}
}