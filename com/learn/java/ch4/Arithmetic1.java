class Arithmetic1
{
	public static void main(String[] args)
	{
		int a,b,c,result;
		a=5;
		b=8;
		c=6;
		result=-a+b*c;
		System.out.println("The result of -5+8*6 is:" +result);
		operation1();
		operation2();
		operation3();
	}
	public static void operation1()
	{
		int v1,v2,result;
		v1=55;
		v2=9;
		result=(v1+v2)%v2;
		System.out.println("The result of (55+9)%9 is:" +result);
	}
	public static void operation2()
	{
		//20+3*5/8
		int v1,v2,v3,v4;
		float result;
		v1=20;
		v2=3;
		v3=5;
		v4=8;
		result=v1+v2*v3/v4;
		System.out.println("The result of 20+3*5/8 is:" +result);
	}
	public static void operation3()
	{
		//5+15/3*2-8%3
		int a,b,c,d,e;
		float result;
		a=5;
		b=15;
		c=3;
		d=2;
		e=8;
		result=a+b/c*d-e%c;
		System.out.println("The result of 5+15/3*2-8%3 is:" +result);
	}
}