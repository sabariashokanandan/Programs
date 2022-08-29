import java.util.Scanner;
import java.util.*;

class Account
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

	public void setDeposit(int deposit)
	{
		this.openBalance+=deposit;
	}

	public void setWithdraw(int withdraw)
	{
		this.openBalance-=withdraw;
	}

}

class BankBasic
{
	public static void main(String[] args)
	{
		int option,accountNo,openBalance;
		String customerName;
		Scanner scan = new Scanner(System.in);
		ArrayList<Account> hash = new ArrayList<Account>();
		
		

		do
		{
			
			System.out.print("\n******** Banking ********\n");
			System.out.print("\n 1.Account Opening");
			System.out.print("\n 2.Search account");
			System.out.print("\n 3.Deposit amount");
			System.out.print("\n 4.Withdraw amount");
			System.out.print("\n 5.View all accounts");
			System.out.print("\n 6.Account closing");
			System.out.print("\n 7.Application Closing");
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
							Account st = new Account();

							st.setAccountNo(accountNo);
							st.setCustomerName(customerName);
							st.setOpenBalance(openBalance);
							hash.add(st);
							System.out.println("The number of records :"+ hash.size());
						    break;

				case 2:
					System.out.println("\nSearch an Account Details");
					System.out.print("\nEnter an Account Number:");
					int search = scan.nextInt();

					for(int i=0;i<hash.size();i++)
					{
						Account account = hash.get(i);
						if(account.getAccountNo()==search)
						{
							System.out.println(account.getAccountNo() + "\t" + account.getCustomerName() + "\t" + account.getOpenBalance());
							break;
						}
						{
							System.out.println("\nenter the correct number");
						}
					}
					break;
					/*System.out.println("\n"+hash.get(search));
					break;*/

				case 3:
					System.out.print("\nEnter Account number: ");
					accountNo = scan.nextInt();

					System.out.print("\nEnter deposit amount: ");
					int deposit = scan.nextInt();

					for(int i=0;i<hash.size();i++)
					{
						Account account = hash.get(i);
						if(account.getAccountNo()==accountNo)
						{
							account.setDeposit(deposit);
							break;
						}
					}

					/*st.setDeposit(deposit);
					//hash.add(st);*/

					System.out.println("\nAdded deposit succesfully");
					break;

				case 4:
					System.out.print("\nEnter Account number: ");
					accountNo = scan.nextInt();

					System.out.print("\nEnter Withdraw amount: ");
					int withdraw = scan.nextInt();

					for(int i=0;i<hash.size();i++)
					{
						Account account = hash.get(i);
						if(account.getAccountNo()==accountNo)
						{
							account.setWithdraw(withdraw);
							break;
						}
					}

					/*st.setWithdraw(withdraw);
					hash.add(st);*/
					System.out.println("\nWithdraw amount rs " + withdraw + " successfully");
					break;


				case 5:
					System.out.println("View all accounts");
					for(int i=0;i<hash.size();i++)
					{
						Account account = /*(Account)*/ hash.get(i);
						System.out.println(account.getAccountNo() + "\t" + account.getCustomerName() + "\t" + account.getOpenBalance());
					}
					break;

				case 6:
					System.out.print("\nEnter Account number: ");
					accountNo = scan.nextInt();

					for(int i=0;i<hash.size();i++)
					{
						Account account = hash.get(i);
						if(account.getAccountNo()==accountNo)
						{
							hash.remove(i);
							System.out.println("\n" + account.getAccountNo() + " is closed");
							break;
						}
					}
					break;
					
				case 7:
					System.out.println("\nThe Banking Application will be closed...");
					break;

					


			}
			
		}while(option<7);
	}
}  