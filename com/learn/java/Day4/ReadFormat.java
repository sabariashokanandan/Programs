import java.util.Scanner;

class ReadFormat
{
	public static void main(String[] args)
	{
		int cm;
		int km,km1,m,m1,ft,ft1,cms;
		Scanner ob=new Scanner(System.in);
		System.out.print("\nEnter the cm:");
		cm=ob.nextInt();
		km=(cm>=100000) ? cm/100000 : 0;
		km1=cm%100000;
		m=(km1>=100) ? km1/100 : 0;
		m1=km1%100;
		ft=(m1>=30) ?  m1/30 :0;
		ft1= m1%30;
		cms=ft1;
		System.out.println("kiliometre= " +km);
		System.out.println("metre= " +m);
		System.out.println("feet= " +ft);
		System.out.println("centimetere= " +cms);
	}
}