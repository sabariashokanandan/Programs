import java.util.Scanner; 

class Denomination
{
	public static void main(String[] args)
	{
		int amt,coins,cash10,cash20,cash50,cash100,cash200,cash500,cash2000; 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("\nEnter The Amount in Rupees :");
        amt = sc.nextInt();   // 19766
 
    	cash2000= (amt>=2000) ? (amt/2000) : 0; //9
        System.out.println("2000 x " + cash2000 + " = " + (cash2000 * 2000));
        //amt= amt - (cash2000 * 2000); //1766
        amt%=2000;
        
        cash500= (amt>=500) ? (amt/500) : 0; //3
        System.out.println(" 500 x " + cash500 + " = " + (cash500 * 500));
        amt= amt - (cash500 * 500); //266

        cash200= (amt>=200) ? (amt/200) : 0; //1
        System.out.println("  200 x " + cash200 + " = " + (cash200 * 200));
        amt= amt - (cash200 * 200); //66

        cash100= (amt>=100) ? (amt/100) : 0;
        System.out.println("  100 x " + cash100 + " = " + (cash100 * 100));
        amt= amt - (cash100 * 100); //66

        cash50= (amt>=50) ? (amt/50) : 0; // 1
        System.out.println("   50 x " + cash50 + " = " + (cash50 * 50));
        amt= amt - (cash50 * 50); // 16

        cash20= (amt>=20) ? (amt/20) : 0; //0
        System.out.println("   20 x " + cash20 + " = " + (cash20 * 20));
        amt= amt - (cash20 * 20); //16

        cash10= (amt>=10) ? (amt/10) : 0; //1
        System.out.println("   10 x " + cash10 + " = " + (cash10 * 10));
        amt= amt - (cash10 * 10); // 6

        coins= (amt<=9) ? (amt) : 0; //6
        System.out.println("   coins x " + coins + " = " +  coins);
        
        System.out.println("-------------------------------------");
        System.out.println("Total = " +((cash10*10)+(cash20*20)+(cash50*50)+(cash100*100)+(cash200*200)+(cash500*500)+(cash2000*2000)+coins));
        
    }

}