
public class Account {
	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	/*public boolean withdraw(double amount){
		if(this.balance>=amount){
			balance= balance-amount;
			return true;
		}else{
			return false;
		}
	}*/
	public void withdraw(double amount) throws AccountBalanceException{
		if(this.balance>=amount){
			balance= balance-amount;
		}else{
			throw new AccountBalanceException("not enough money in account!");
		}
	}
	public void deposit(double amount){
		this.balance= this.balance+amount;
	}
}
