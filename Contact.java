public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;	
	
	public Contact(String contactId, String firstName, String lastName, String phone,
			String address) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contactId");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;		
	}
	
	public String getContactId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}

}