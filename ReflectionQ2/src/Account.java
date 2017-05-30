
public class Account {
	private final String accountId;
	private final double amount;
	
	public Account(){
		this.accountId = "1234-2354-1223";
		this.amount = 1000000.00;
	}
	
	@Override
	public String toString(){
		return "Account = " + this.accountId + ", Amount = " + this.amount;
	}
}
