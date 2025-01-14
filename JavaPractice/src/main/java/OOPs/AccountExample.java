package OOPs;

public class AccountExample {


	private String BankName ;
	private long accNumber;
	private float Balance;


	public AccountExample(String bankName, long l, float balance) {
		super();
		BankName = bankName;
		this.accNumber = l;
		Balance = balance;


	}


	public String getBankName() {
		return BankName;
	}


	public void setBankName(String bankName) {
		BankName = bankName;
	}


	public long getAccNumber() {
		return accNumber;
	}


	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}


	public float getBalance() {
		return Balance;
	}


	public void setBalance(float balance) {
		Balance = balance;
	}

	@Override
	public String toString() {
		return "AccountExample [BankName=" + BankName + ", accNumber=" + accNumber + ", Balance=" + Balance + "]";
	}

	public String getData(long accNumber, float balance)
	{
		if (this.accNumber == accNumber)
		{
			return this.accNumber + " : " + this.Balance;
		}
		else return "Account dose not match";
	}
	
	public String getData(String BankName)
	{
		return this.BankName;
	}

}
