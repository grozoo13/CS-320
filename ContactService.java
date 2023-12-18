include class Contact;

public class ContactService {
	private String newContactId;
	private String newfirstName;
	private String newLastName;
	private String newPhone;
	private String newAddress;
	
	public String getContact(String contactId) {
		if(Contact.contactId == contactId) {
			throw new IllegalArgumentException("Contact ID Already In Contacts");
		}
		
		Contact.contactId = newContactId;
		return newContactId;
	}
		
	public void addContact(String contactId) {
		getContact(contactId);
		Contact.Contact(contactId, String firstName, String lastName, String phone, String address);	
		this.newContactId = contactId;
		this.newfirstName = firstName;
		this.newLastName = lastName;
		this.newPhone = phone;
		this.newAddress = address;		
	}
	
	public void deleteContact() {
		
	}

}
