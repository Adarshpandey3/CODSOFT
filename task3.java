package CodSoft;

	import java.util.Scanner;

	class BankAccount {
	    private double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public boolean withdraw(double amount) {
	        if (amount > balance) {
	            return false; // Insufficient funds
	        } else {
	            balance -= amount;
	            return true; // Withdrawal successful
	        }
	    }
	}

	class ATM {
	    private BankAccount account;

	    public ATM(BankAccount account) {
	        this.account = account;
	    }

	    public void displayMenu() {
	        System.out.println("\nATM Menu:");
	        System.out.println("1. Withdraw");
	        System.out.println("2. Deposit");
	        System.out.println("3. Check Balance");
	        System.out.println("4. Exit");
	    }

	    public void run() {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            displayMenu();
	            System.out.print("Enter choice (1-4): ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter withdrawal amount: $");
	                    double withdrawAmount = scanner.nextDouble();
	                    if (account.withdraw(withdrawAmount)) {
	                        System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
	                    } else {
	                        System.out.println("Insufficient funds. Withdrawal failed.");
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter deposit amount: $");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    System.out.println("Deposit successful. New balance: $" + account.getBalance());
	                    break;

	                case 3:
	                    System.out.println("Current balance: $" + account.getBalance());
	                    break;

	                case 4:
	                    System.out.println("Exiting. Thank you!");
	                    scanner.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	            }
	        }
	    }
	}

	public class task3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter initial account balance: $");
	        double initialBalance = scanner.nextDouble();

	        BankAccount userAccount = new BankAccount(initialBalance);
	        ATM atm = new ATM(userAccount);

	        atm.run();
	    }
	}


