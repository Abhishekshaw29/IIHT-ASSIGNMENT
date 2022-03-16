package assignment4;
public class Customer {

	private Long id;
	private String name;
	private char gender;
	private String email;
	private String contactNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Customer(Long id, String name, char gender, String email, String contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return "Customer Id: "+this.id+"\nCustomer: "+this.name+"\nCustomer contact details:"+this.contactNumber+" , "+this.email;
	}

}
