class Swapping
{
	public static void main(String[] args)
	{
		int a,b;
		a=10;
		b=5;
		System.out.println("Before swap: a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Afte swap: a="+a+" b="+b);
	}
}