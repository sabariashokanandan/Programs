import java.util.Scanner;
import java.util.*;

class AccountOpen
{
	private String customerName;
	private int accountNo;
	private int openBalance;
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo = accountNo;
	}

	public int getAccountNo()
	{
		return accountNo;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String  getCustomerName()
	{
		return customerName;
	}

	public int getOpenBalance()
	{
		return openBalance;
	}

	public void setOpenBalance(int openBalance)
	{
		this.openBalance = openBalance;
	}

}

class Bankbasic
{
	public static void main(String[] args)
	{
		int option,accountNo,openBalance;
		String customerName;
		Scanner scan = new Scanner(System.in);
		ArrayList<AccountOpen> hash = new ArrayList<AccountOpen>();
		

		do
		{
			
			System.out.print("\n******** Banking ********\n");
			System.out.print("\n 1.Account Opening");
			System.out.print("\n 2.Search account");
			System.out.print("\n 3.Application Closing");
			System.out.print("\n 4.View all accounts");
			System.out.println();
			System.out.print("\nSelect your option: ");
			option = scan.nextInt();
			
			

			switch(option)
			{
				case 1:
							System.out.println("\n===== Opening New Account =====");
							System.out.print("\nAccount Number: ");
							accountNo = scan.nextInt();

							System.out.print("Customer Name: ");
							customerName = scan.next();

							System.out.print("Opening Balance: ");
							openBalance = scan.nextInt();
							AccountOpen st = new AccountOpen();

							st.setAccountNo(accountNo);
							st.setCustomerName(customerName);
							st.setOpenBalance(openBalance);
							hash.add(st);
							System.out.println("The number of records :"+ hash.size());
						 break;
				case 2:
					System.out.println("\nSearch an Account Details");
					int search = scan.nextInt();
					System.out.println("\n"+hash.get(search));
					break;


				case 3:
					System.out.println("Enter closing account no");
					int accNo=scan.nextInt();
					hash.remove(accNo);

					System.out.println("\nThe Banking Application will be closed...");
					break;

				case 4:
					System.out.println("View all accounts");
					for(int i=0;i<hash.size();i++)
					{
						AccountOpen account = /*(AccountOpen)*/ hash.get(i);
						System.out.println(account.getAccountNo() + "\t" + account.getCustomerName() + "\t" + account.getOpenBalance());
					}
					break;


			}
			
		}while(option<5);
	}
}  