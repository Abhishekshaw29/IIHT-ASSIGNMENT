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
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
	}

	@Override
	public boolean equals(Object o) {
        Customer c = this;
        return email.equals(c.email) && contactNumber.equals(c.contactNumber);
	}
}

