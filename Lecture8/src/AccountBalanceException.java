
public class AccountBalanceException extends Exception {
	
	public AccountBalanceException(String message){
		super(message);
	}
	public AccountBalanceException(String message, Throwable cause){
		super(message,cause);
	}
}
