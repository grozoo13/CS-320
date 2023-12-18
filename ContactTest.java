import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.model.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345", "Ken", "Griffey", "5551234567", "2 Electric Ave");
		assertTrue(contact.getContactId().equals("12345"));
		assertTrue(contact.getFirstName().equals("Ken"));
		assertTrue(contact.getLastName().equals("Griffey"));
		assertTrue(contact.getPhone().equals("5551234567"));
		assertTrue(contact.getAddress().equals("2 Electric Ave"));
	}
	
	//Tests for too long
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "Ken", "Griffey", "5551234567", "2 Electric Ave");
		});
	}
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Bartholomew", "Griffey", "5551234567", "2 Electric Ave");
		});
	}	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ken", "Hendrickson", "5551234567", "2 Electric Ave");
		});
	}	
	@Test
	void testPhoneNotTenDigits() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ken", "Griffey", "5551234", "2 Electric Ave");
		});
	}	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ken", "Griffey", "5551234567", "12345678910111213141516 Electric Ave");
		});
	}	

	//Tests for too Null
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Ken", "Griffey", "5551234567", "2 Electric Ave");
		});
	}
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "Griffey", "5551234567", "2 Electric Ave");
		});
	}	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ken", null, "5551234567", "2 Electric Ave");
		});
	}	
	@Test
	void testPhoneNotTenDigits() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ken", "Griffey", null, "2 Electric Ave");
		});
	}	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ken", "Griffey", "5551234567", null);
		});
	}	

}
