import java.util.Scanner;
import java.util.*;

class Account
{
	private String customerName;
	private int accountNo,openBalance,deposit1;
	
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
		this.deposit1=deposit;
	}

	public void setWithdraw(int withdraw)
	{
		this.openBalance-=withdraw;
	}
	public int getDeposit()
	{
		return deposit1;
	}

}

class Bank
{
	
	private HashMap<Integer,Account> list = new HashMap <Integer,Account>();
	//private ArrayList<Account> list = new ArrayList<Account>();

	private void openAccount()
	{
		int accountNo,openBalance;
		String customerName;
		Scanner scan = new Scanner(System.in);

		System.out.println("\n===== Opening New Account =====");
		System.out.print("\nAccount Number: ");
		accountNo = scan.nextInt();

		System.out.print("Customer Name: ");
		customerName = scan.next();

		System.out.print("Opening Balance: ");
		openBalance = scan.nextInt();
		Account st = new Account();

		/*System.out.println(accountNo);
		System.out.println(st);
		System.out.println(list);*/

		st.setAccountNo(accountNo);
		st.setCustomerName(customerName);
		st.setOpenBalance(openBalance);
		list.put(accountNo,st);
	}

	private void searchAccount()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("\nSearch an Account Details");
		System.out.print("\nEnter an Account Number:");
		
		int search = scan.nextInt();

		Account account = list.get(search);

		if(account.getAccountNo()==0)
		{
			System.out.println("Enter corect number");
		}
		
		else
		{
			System.out.println(account.getAccountNo() + "\t" + account.getCustomerName() + "\t" + account.getOpenBalance());
		}


		/*for(int i=0;i<list.size();i++)
		{
			Account account = list.get(i);
			if(account.getAccountNo()==search)
			{
				System.out.println(account.getAccountNo() + "\t" + account.getCustomerName() + "\t" + account.getOpenBalance());
				break;
			}
			else
			{
				System.out.println("\nenter the correct number");
			}

		} */


		/*for(int i=0;i<list.size();i++)
		{
			Account account = list.get(i);
			if(account.getAccountNo()==search)
			{
				System.out.println(account.getAccountNo() + "\t" + account.getCustomerName() + "\t" + account.getOpenBalance());
				break;
			}
			else
			{
				System.out.println("\nenter the correct number");
			}

		} */

		/*int position=list.indexOf(search);

		System.out.println("position:"+ position);

			if(position!=-1)
			{
				Account account = list.get(position);
				System.out.println(account.getAccountNo() + "\t" + account.getCustomerName() + "\t" + account.getOpenBalance());
			}
			else 
			{
				System.out.println("\nenter the correct number");
			}*/
		
	}

	private void depositAccount()
	{
		int accountNo;
		Scanner scan = new Scanner(System.in);

	    System.out.print("\nEnter Account number: ");
		accountNo = scan.nextInt();

		System.out.print("\nEnter deposit amount: ");
		int deposit = scan.nextInt();

		Account account = list.get(accountNo);
		if(account.getAccountNo()==accountNo)
		{
			account.setDeposit(deposit);
		}

		/*st.setDeposit(deposit);
		//list.add(st);*/

		System.out.println("\nAdded deposit succesfully");

	}

	private void withdrawAccount()
	{
		int accountNo;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter Account number: ");
		accountNo = scan.nextInt();

		System.out.print("\nEnter Withdraw amount: ");
		int withdraw = scan.nextInt();

		Account account = list.get(accountNo);
		if(account.getAccountNo()==accountNo)
		{
			account.setWithdraw(withdraw);
		}

		/*st.setWithdraw(withdraw);
		list.add(st);*/
		System.out.println("\nWithdraw amount rs " + withdraw + " successfully");
	}

	private void viewAll()
	{
		System.out.println("View all accounts");
		for(Map.Entry pairEntry: list.entrySet())
        {
        	 Account account = /*(Account)*/ list.get(pairEntry.getKey());
        	 //System.out.print("All Customer Details: "+list.get(i));
			//Account account = /*(Account)*/ list.get(i);
			System.out.println(account.getAccountNo() + "\t" + account.getCustomerName() + "\t" + account.getOpenBalance());
		}
	}

	private void closeAccount()
	{
		int accountNo;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter Account number: ");
		accountNo = scan.nextInt();

		Account account = list.get(accountNo);
		if(account.getAccountNo()==accountNo)
		{
			list.remove(accountNo);
			System.out.println("\n" + account.getAccountNo() + " is closed");
		}
		
	}


	public static void main(String[] args)
	{
		int option;
		Bank object = new Bank();
		Scanner scan = new Scanner(System.in);

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
					object.openAccount();
					//System.out.println("The number of records :"+ list.size());
					break;

				case 2:
					object.searchAccount();
					break;
					/*System.out.println("\n"+list.get(search));
					break;*/

				case 3:
					object.depositAccount();
					break;

				case 4:
					object.withdrawAccount();
					break;


				case 5:
					object.viewAll();
					break;

				case 6:
					object.closeAccount();
					break;
					
				case 7:
					System.out.println("\nThe Banking Application will be closed...");
					break;

			}
			
		}while(option<7);
	}
}  