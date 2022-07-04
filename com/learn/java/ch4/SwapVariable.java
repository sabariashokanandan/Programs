class SwapVariable
{
	public static void main(String[] args)
	{
		int a,b,c;
		a=40;
		b=50;
		System.out.println("Before swap: a="+a+" b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swap: a="+a+" b="+b);
	}
}