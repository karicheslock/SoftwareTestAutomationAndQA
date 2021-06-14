//CS320 Project One
//Kari L. Cheslock - 06/07/21


package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.ContactService;

class ContactServiceTest {
	
	//method to test for creating new contact first name
	@Test
	void testNewContactFirstName() {
		ContactService service = new ContactService();
		service.newContact("12345", "Bruce", "Wayne", "1231234567", "123 Wayne Manor");
		
		assertEquals(service.searchId("12345").getFirstName(), "Bruce");
	}
	
	//method to test for creating new contact last name
	@Test
	void testNewContactLastName() {
		ContactService service = new ContactService();
		service.newContact("12345", "Bruce", "Wayne", "1231234567", "123 Wayne Manor");
		
		assertEquals(service.searchId("12345").getLastName(), "Wayne");
	}
	
	//method to test for creating new contact phone number
	@Test
	void testNewContactPhoneNumber() {
		ContactService service = new ContactService();
		service.newContact("12345", "Bruce", "Wayne", "1231234567", "123 Wayne Manor");
		
		assertEquals(service.searchId("12345").getPhoneNumber(), "1231234567");
	}
	
	//method to test creating new contact address
	@Test
	void testNewContact() {
		ContactService service = new ContactService();
		service.newContact("12345", "Bruce", "Wayne", "1231234567", "123 Wayne Manor");
		
		assertEquals(service.searchId("12345").getAddress(), "123 Wayne Manor");
	}
	
	//method to test for unique contactId
	@Test
	void testUniqueContactId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService service = new ContactService();
			service.newContact("12345", "Bruce", "Wayne", "1231234567", "123 Wayne Manor");
			service.newContact("12345", "Dick", "Grayson", "4564561234", "123 Wayne Manor");
		});
	}
	
	//test for deleteContact method
	//new contact added then deleted, ArrayList shown to be empty after deletion
	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		service.newContact("12345", "Bruce", "Wayne", "1231234567", "123 Wayne Manor");
		service.deleteContact("12345");
		
		assertTrue(service.contactList.isEmpty());
	}
	

	//method to test update of firstName
	@Test
	void testUpdateFirstName() {
		
		ContactService service = new ContactService();
		service.newContact("12345","Bruce", "Wayne", "1231234567", "123 Wayne Manor");
		
		service.updateFirstName("12345","Dick");
		
		assertEquals(service.searchId("12345").getFirstName(), "Dick");
		
	}
	
	//method to test update of lastName
	@Test
	void testUpdateLastName() {
		
		ContactService service = new ContactService();
		service.newContact("12345","Bruce", "Wayne", "1231234567", "123 Wayne Manor");
		
		service.updateLastName("12345","Grayson");
		
		assertEquals(service.searchId("12345").getLastName(), "Grayson");
	}
	
	//method to test update of phoneNumber
	@Test
	void testUpdatePhoneNumber() {
		
		ContactService service = new ContactService();
		service.newContact("12345","Bruce", "Wayne", "1231234567", "123 Wayne Manor");
		
		service.updatePhoneNumber("12345","1234564567");
		
		assertEquals(service.searchId("12345").getPhoneNumber(), "1234564567");
	}
	
	//method to test update of address
	@Test
	void testUpdateAddress() {
	
		ContactService service = new ContactService();
		service.newContact("12345","Bruce", "Wayne", "1231234567", "123 Wayne Manor");
		
		service.updateAddress("12345","123 Arkham Asylum");
		
		assertEquals(service.searchId("12345").getAddress(), "123 Arkham Asylum");
	}
	

}
