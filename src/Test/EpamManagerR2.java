package Test;

//Custom exception for insufficient balance
/*class SufficientBalanceNotMaintainedException extends Exception {
public SufficientBalanceNotMaintainedException(String message) {
   super(message);
}
}

//Custom exception for invalid operations
class InvalidTransactionException extends Exception {
public InvalidTransactionException(String message) {
   super(message);
}
}
*/
//Account class
class Account {
 private double balance;
 private final double minimumBalance; // Minimum balance requirement

 // Constructor to initialize balance and minimum balance
 public Account(double initialBalance, double minimumBalance) {
     this.balance = initialBalance;
     this.minimumBalance = minimumBalance;
 }

 // Method to get the current balance
 public double getBalance() {
     return balance;
 }

 // Method to deposit money into the account
 public void deposit(double amount) throws InvalidTransactionException {
    
	 if (amount <= 0) {
         throw new InvalidTransactionException("Deposit amount must be positive.");
     }
     balance += amount;
     System.out.println("Deposited: " + amount);
     System.out.println("Current Balance: " + balance);
 }

 // Method to withdraw money from the account
 public void withdraw(double amount) throws SufficientBalanceNotMaintainedException, InvalidTransactionException {
     if (amount <= 0) {
         throw new InvalidTransactionException("Withdrawal amount must be positive.");
     }
     if (balance - amount < minimumBalance) {
         throw new SufficientBalanceNotMaintainedException("Withdrawal denied. Insufficient balance to maintain minimum balance.");
     }
     balance -= amount;
     System.out.println("Withdrew: " + amount);
     System.out.println("Current Balance: " + balance);
 }
}

//Main class to test the Account class
public class EpamManagerR2 {
 public static void main(String[] args) {
     // Create an account with an initial balance of 100 and a minimum balance requirement of 50
     Account account = new Account(100, 50);

     // Deposit and withdraw operations
     try {
         account.deposit(50);
         account.withdraw(30);
         account.withdraw(150); // This will throw an exception due to minimum balance requirement
     } catch (SufficientBalanceNotMaintainedException | InvalidTransactionException e) {
         System.out.println(e.getMessage());
     }

     // Testing invalid transactions
     try {
         account.deposit(-10); // This will throw an exception
     } catch (InvalidTransactionException e) {
         System.out.println(e.getMessage());
     }

     try {
         account.withdraw(-20); // This will throw an exception
     } catch (SufficientBalanceNotMaintainedException | InvalidTransactionException e) {
         System.out.println(e.getMessage());
     }
 }
}
