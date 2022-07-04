class LimitCheck
{
	public static void main(String[] args)
	{
		int a='a';
		byte b='c';
		long c='s';
		short d='d';
		float e='a';
		double f='v';
		//boolean g='g'; char canot be converted to boolean
		//int var1=12.80; double cannot be converted to int
		//byte var2=45.76; possible lossy conversion from double to byte
		//long var3=354.87; possible lossy conversion from double to long
		//short var4=28.64; possible lossy conversion from double to short
		//boolean var5=38.53; double cannot be converted to boolean
		//int var6="roses"; String cannot be converted to int
	}
}