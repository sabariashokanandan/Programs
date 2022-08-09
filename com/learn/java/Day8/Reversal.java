import java.io.*;

class Reversal
{
	public static void main(String args[])
	{
		String word="sun flower",rev="";
		char a;

		System.out.println("Original word:"+word);

		int len=word.length();

		for(int i=len-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}

		System.out.println("Reversal word:"+rev);
	}
}