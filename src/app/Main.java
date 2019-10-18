package app;
import java.util.*;


public class Main {

	public static void main(String[] args) 
	{
		example1();
	}
	
	public static void example1()
	{
		Bank bank = new Bank("US FEDERAL RESERVE");
		Scanner scan = new Scanner(System.in);

		System.out.println("=====================================");
		System.out.println(" U S   F E D E R A L   R E S E R V E ");
		System.out.println("=====================================");
		int x=0;
		
		do
		{
		System.out.println("Pick an option from below:");
		System.out.println("0. SAVE AND LOAD");
		System.out.println("1. DEPOSIT");
		System.out.println("2. WITHDRAW");
		System.out.println("3. CHECK");
		System.out.println("4. CREATE");
		System.out.println("5. CLOSE");
		System.out.println("6. TRANSFER");
		 x = scan.nextInt();
		scan.nextLine();
			switch (x)
			{
				case 0: //save				{
				{ 	System.out.println("=SAVE AND LOAD=");
					System.out.println("Would you like to save or load? (save/load)");
					String answer = scan.nextLine();
					
					if (answer.equalsIgnoreCase("save"))
					{
						System.out.println("Enter the name of the account.");
						String name = scan.nextLine();
						bank.saveAccounts(name);
					}
					else if (answer.equalsIgnoreCase("load"))
					{	System.out.println("Enter the name of the account.");
						
					}
					break;
				}
				
				case 1:	//Deposit
				{	System.out.println("=DEPOSIT=");
					System.out.println("Enter account number you wish to deposit in.");
					int accnum = scan.nextInt();
					System.out.println("how much would you like to deposit?");
					int amount = scan.nextInt();
					bank.deposit(accnum, amount);
					System.out.println("Action completed.");
					break;						
				}
				
				case 2:	//withdraw
				{	System.out.println("=WITHDRAW=");
					System.out.println("Enter account number you wish to withdraw from.");
					int accnum = scan.nextInt();
					System.out.println("how much would you like to withdraw?");
					int amount = scan.nextInt();
					bank.withdraw(accnum, amount);
					System.out.println("Action completed.");
					break;
				}
				
				case 3:	//check
				{	System.out.println("=CHECK BALANCE=");
					System.out.println("Enter account number you wish to check balance for.");
					int accnum = scan.nextInt();
					System.out.println("Amount: $" + bank.checkBalance(accnum));		
					System.out.println("Action completed.");
					break;
				}
				
				case 4:	//create
				{	System.out.println("=CREATE ACCOUNT=");
					System.out.println("Enter a name for the new account.");
					String name = scan.nextLine();
					bank.createAccount(name);
					System.out.println("Action completed.");
					break;
				}
				
				case 5:	//close
				{	System.out.println("=CLOSE ACCOUNT=");
					System.out.println("Enter account number you wish to close.");
					int accnum = scan.nextInt();
					bank.closeAccount(accnum);
					System.out.println("Action completed.");
					break;
				}
				
				case 6:	//transfer
				{	System.out.println("=TRANSFER=");
					System.out.println("Enter account number from which you with to transfer from.");
					int accnum1 = scan.nextInt();
					System.out.println("Enter account number to which you want to transfer to.");
					int accnum2 = scan.nextInt();
					System.out.println("Enter amount you wish to transfer.");
					int amount = scan.nextInt();
					
					bank.withdraw(accnum1, amount);
					bank.deposit(accnum2, amount);
					System.out.println("Action completed.");
					break;
				}			
			}
		} while (x>=0&& x<=6);
	}
}
