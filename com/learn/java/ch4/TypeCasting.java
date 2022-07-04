import java.util.Scanner;

class TypeCasting
{
	public static void main(String[] args)
	{
		System.out.println("\n----------Byte to Int-----------");
		ByteToInt();

		System.out.println("\n----------Int to Float-----------");
		IntToFloat();

		System.out.println("\n----------Int to Long-----------");
		IntToLong();

		System.out.println("\n----------Float to Double-----------");
		FloatToDouble();

		System.out.println("\n----------Double to Int-----------");
		DoubleToInt();

		System.out.println("\n----------Char to Int-----------");
		CharToInt();

		System.out.println("\n----------Boolean to Int-----------");
		BooleanToInt();

		System.out.println("\n----------String to Char-----------");
		StringToChar();
	}


	public static void ByteToInt()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("\nByte number: ");

		byte myb = ob.nextByte();
		int myi =  myb;
		System.out.println("\nThe byte value " + myb + " is converted to integer :" + myi);

		System.out.print("\nInteger value: ");
		myi = ob.nextInt();
		myb = (byte) myi;
		System.out.println("\nThe integer value " + myi + " is converted to byte :" + myb);

	}


	public static void IntToFloat()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("\nInteger value: ");

		int var1=ob.nextInt();
		float var2=var1;
		System.out.println("\nThe integer value " + var1 + " is converted to float :" + var2);

		System.out.print("\nFloating value: ");
		var2 = ob.nextFloat();
		var1=(int) var2;
		System.out.println("\nThe floating value " + var2 + " is converted to int :" + var1);
		
	}


	public static void IntToLong()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("\nInteger value: ");

		int var1=ob.nextInt();
		long var2=var1;
		System.out.println("\nThe integer value " + var1 + " is converted to long :" + var2);

		System.out.print("\nLong value: ");
		var2 = ob.nextLong();
		var1=(int) var2;
		System.out.println("\nThe long value " + var2 + " is converted to int :" + var1);
		
	}

	public static void FloatToDouble()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("\nFloat value: ");

		float value=ob.nextFloat();
		double value1=value;
		System.out.println("\nThe floating value " + value + " is converted to double :" + value1);

		System.out.print("\nDouble value: ");
		value1=ob.nextDouble();
		value=(float) value1;
		System.out.println("\nThe double value " + value1 + " is converted to float :" + value);

	}


	public static void DoubleToInt()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("\nDouble value: ");

		double s=ob.nextDouble();
		int f=(int) s;
		System.out.println("\nThe double value " + s + " is converted to integer :" + f);

		System.out.print("\nInteger value: ");
		f=ob.nextInt();
		s=f;
		System.out.println("\nThe double value " + f + " is converted to integer :" + s);
		
	}


	public static void CharToInt()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("\nCharacter Letter: ");

		char h=ob.next().charAt(0);
		int x=h-'0';
		System.out.println("\nThe Character letter " + h + " is converted to integer :" + x);

		System.out.print("\nInteger value: ");
		x=ob.nextInt();
		h=(char) x;
		System.out.println("\nThe double value " + x + " is converted to integer :" + h);
	}


	public static void BooleanToInt()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("\nBoolean value(True/False): ");

		boolean m=ob.nextBoolean();
		int j=(m)? 1:0;
		System.out.println("\nThe Boolean value " + m + " is converted to integer :" + j);
		
		System.out.print("\nInteger value(0/1): ");
		j=1;
		m=(j==ob.nextInt());
		System.out.println("\nThe Integer value " + j + " is converted to Boolean :" + m);
		

	}


	public static void StringToChar()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("\nCharacter: ");

		char give= ob.next().charAt(0);
		String string="a" + give;
		System.out.println("\nThe Character " + give + " is converted to string :" + string);

		System.out.print("\nString: ");
		string=ob.next();
		give=string.charAt(0);
		System.out.println("\nThe String " + string + " is converted to character :" + give);
		
	}

}