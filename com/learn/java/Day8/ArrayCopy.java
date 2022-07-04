class ArrayCopy
{
	public static void main(String[] args) 
	{
		copyArray();
	}

	public static void copyArray()
	{
		int a[]={30,50,20,90,78};
		int b[]=new int[a.length];

		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("\nThe elements of a is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nThe elements of b is:");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}