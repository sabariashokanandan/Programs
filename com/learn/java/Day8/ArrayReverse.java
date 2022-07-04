class ArrayReverse
{
	public static void main(String[] args) {
		printReverse();
	}

	public static void printReverse()
	{
		int	num[]={80,30,60,10,40};
		for(int i=0;i<num.length;i++)
		{
			System.out.println("num["+i+"]="+num[i]);
		}
		System.out.println();
		System.out.println("Reverse order:");
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println("num["+i+"]="+num[i]);
		}
	}
}