class ArrayDemo
{
	public static void main(String[] args) 
	{
			printArray();
	}

	public static void printArray()
	{
		String courses[]=new String[] {"engineering","mbbs","bcom","barch"};

		System.out.println("\nElements of array with address:");
		
		for(int i=0;i<4;i++)
		{
			System.out.println(courses[i]+":"+"a["+i+"]");
			/*for(int j=i-0;j<courses.length;j++)
				{
					System.out.println("a["+j+"]");
					break;
				}*/
		}
	}
}