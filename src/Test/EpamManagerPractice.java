package Test;

class InvalidTransactionException extends RuntimeException {

	public InvalidTransactionException(String message) {
		super(message);
	}
}

class SufficientBalanceNotMaintainedException extends RuntimeException {

	public SufficientBalanceNotMaintainedException(String message) {
		super(message);
	}
}

class AccountTest {

	int accountBalance;

	public void deposit(int amount) {
		try {
			if (amount <= 0) {
				throw new InvalidTransactionException("Enter valid deposit amount");
			}
		} catch (InvalidTransactionException e) {
			e.printStackTrace();
			return;
		}
		this.accountBalance += amount;
		System.out.println("Amount deposited =" + amount);
		System.out.println("Account Balance =" + this.accountBalance);
	}

	public void withdrawl(int amount)  {
		System.out.println("Amount trying to withdraw = "+amount);

		try {
		if (amount <= 0) {
			throw new InvalidTransactionException("Enter valid withdrawl amount");
		}
		

		if (accountBalance - amount < 0) {
			throw new SufficientBalanceNotMaintainedException("Insufficient Account Balance");

		}
		}
		catch(InvalidTransactionException | SufficientBalanceNotMaintainedException e) {
			e.printStackTrace();
			return;
		}
	}
}

public class EpamManagerPractice {
	public static void main(String[] args) {

		AccountTest acc = new AccountTest();
		acc.deposit(0);

	}
}