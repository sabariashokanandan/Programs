class ArrayDemo
{
	public static void main(String[] args) 
	{
			printArray();
	}

	public static void printArray()
	{
		String courses[]={"engineering","mbbs","bcom","barch"};

		System.out.println("\nElements of array with position:");
		
		for(int i=0;i<4;i++)
		{
			System.out.println(courses[i]+":"+"a["+i+"]");
		}
	}
}