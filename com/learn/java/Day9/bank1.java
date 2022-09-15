import java.util.*;

class Customer 
{
    String accNumber,name;
    int balance;
    //ArrayList<String> transactions;
    
    Customer(String accNumber,String name,int balance)
    {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }  
  
    public void deposit(int amount)
    {
        balance += amount;
    }
 
    public void withdraw(int amount)
    {
        balance -= amount;
    }
}

class Bank
{
    
    
    public static void main(String []args)
    {
        Scanner scan  =  new Scanner(System.in);
        HashMap<String,Customer> customerMap = new HashMap <String,Customer>();
        Customer customer;
        String accNumber;
        int amount,choice;
        
        do{
            System.out.println("\n===== Welcome to Bank Application =====");
            System.out.println("\n1. New Account Opening");
            System.out.println("2. Customer Details");
            System.out.println("3. Number of Customer");
            System.out.println("4. All Customer Details");
            System.out.println("5. Exit.");
            
            System.out.print("\nEnter your choice : ");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("\nCustomer Name : ");
                    String name = scan.next();
                    
                    System.out.print("Account Number : ");
                    accNumber = scan.next();
                    while(customerMap.containsKey(accNumber))
                    {
                        System.out.println("Account Numbwe already exists. Set again : ");
                        accNumber = scan.next();
                    }

                    System.out.print("Initial Deposit : ");
                    scan.nextLine();
                    while(!scan.hasNextInt())
                    {
                        System.out.println("Invalid amount. Enter again :");
                        scan.nextLine();
                    }
                    amount=scan.nextInt();
                    
                    customer = new Customer(accNumber,name,amount);
                    customerMap.put(accNumber,customer);
                    break;
                case 2:
                    
                    System.out.print("\nAccount Number: ");
                    accNumber = scan.next();
                    do
                    {    
                        if(customerMap.containsKey(accNumber))
                        {
                            customer = customerMap.get(accNumber);
                            System.out.println("\n===== Account Holder Details =====");
                            System.out.println("\n1. Deposit.");
                            System.out.println("2. Withdraw.");
                            System.out.println("3. Account Balance.");
                            System.out.println("4. Log out.");
                            System.out.print("\nEnter your choice : ");
                            choice = scan.nextInt();
                            scan.nextLine();
                            switch(choice)
                            {
                                case 1:
                                    System.out.print("\nEnter amount : ");
                                    amount = scan.nextInt();
                                    customer.deposit(amount);
                                    System.out.println("\nYour deposit Amount: "+amount+" will be debit your account.");                    
                                    break;
                                case 2:
                                    System.out.print("\nEnter amount : ");
                                    amount = scan.nextInt();
                                    customer.withdraw(amount);
                                    System.out.println("\nYour withdraw Amount: "+amount+" will be credit your account.");                    
                                    break;
                                case 3:
                                    //System.out.println("\nAccount Number: "+customerMap.get(bank()));
                                    System.out.println("\nCustomer Name : "+customer.name);
                                    System.out.println("Account balance : "+customer.balance);
                                    break;
                                case 4:
                                    System.out.println("\nCustomer Profile Log out");
                                    break;
                            }
                        }
                        else
                        {
                            System.out.println("\nThe Acccount is Unavailable");
                            break;
                        }
                        }while(choice<4);
                        case 3:
                            System.out.print("\nNumber of Customer in your Bank: "+customerMap.size());
                            System.out.println();
                            break;
                        case 4:
                        for(int i=0;i<customerMap.size();i++)
                        {
                            System.out.print("All Customer Details: "+customerMap.get(i));
                        }
                            break;
                    }
        }while(choice<5);
    }
}
