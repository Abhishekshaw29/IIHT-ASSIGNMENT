
public class Customer {
	private int custId;
	private String custName;
	private String custAddress;
	private String accType;
	private double currBalance;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getCurrBalance() {
		return currBalance;
	}
	public void setCurrBalance(double currBalance) {
		this.currBalance = currBalance;
	}
	public Customer(int custId, String custName, String custAddress, String accType, double currBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.accType = accType;
		this.currBalance = currBalance;
	}
	public Customer(int custId, String custName, String custAddress) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	
	
	
	
}
