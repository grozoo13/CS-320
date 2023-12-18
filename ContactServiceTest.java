package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactService() {
		ContactServive contactService = new ContactService("12345", "Ken", "Griffey", "5551234567", "2 Electric Ave");
		assertTrue(contact.getContactId().equals("12345"));
		assertTrue(contact.getFirstName().equals("Ken"));
		assertTrue(contact.getLastName().equals("Griffey"));
		assertTrue(contact.getPhone().equals("5551234567"));
		assertTrue(contact.getAddress().equals("2 Electric Ave"));
	}
	
	@Test
	void testContactIdAlreadyInUse() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Edgar", "Martinez", "5550987654", "1 Electric Ave");
		});
	}
}
