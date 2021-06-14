//CS320 Project One
//Kari L. Cheslock - 06/07/21

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import contactService.Contact;

class ContactTest {

	//test for creating a new contact, verifying contactId
	@Test
	void testContactClassContactId() {
		Contact contact = new Contact("d84f22182b", "Jane", "Doe", "1234567890", "123 Main Street");
		assertTrue(contact.getContactId().equals("d84f22182b"));
	}
	
	//test for creating a new contact, verifying first name
	@Test
	void testContactClassFirstName() {
		Contact contact = new Contact("d84f22182b", "Jane", "Doe", "1234567890", "123 Main Street");
		assertTrue(contact.getFirstName().equals("Jane"));
	}
	
	//test for creating a new contact, verifying last name
	@Test
	void testContactClassLastName() {
		Contact contact = new Contact("d84f22182b", "Jane", "Doe", "1234567890", "123 Main Street");
		assertTrue(contact.getLastName().equals("Doe"));
	}
	
	//test for creating a new contact, verifying phone number
	@Test
	void testContactClassPhoneNumber() {
		Contact contact = new Contact("d84f22182b", "Jane", "Doe", "1234567890", "123 Main Street");
		assertTrue(contact.getPhoneNumber().equals("1234567890"));
	}
	
	//test for creating a new contact, verifying address
	@Test
	void testContactClassAddress() {
		Contact contact = new Contact("d84f22182b", "Jane", "Doe", "1234567890", "123 Main Street");
		assertTrue(contact.getAddress().equals("123 Main Street"));
	}
	
	//test for exception thrown when contactId field too long
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("d84f22182baaa", "Jane", "Doe", "1234567890", "123 Main Street");
		});
	}
	
	//test for exception when contactId is null
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Jane", "Doe", "1234567890", "123 Main Street");
		});
	}
	
	//test for exception when firstName is too long
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("d84f22182b", "Janejanejane", "Doe", "1234567890", "123 Main Street");
	    });
	}
	
	//test for exception when firstName is null
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("d84f22182b", null, "Doe", "1234567890", "123 Main Street");
	    });
	}
	
	//test for exception when lastName is too long
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("d84f22182b", "Jane", "Doedoedoedoe", "1234567890", "123 Main Street");
	    });
	}
	
	//test for exception when lastName is null
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("d84f22182b", "Jane", null, "1234567890", "123 Main Street");
	    });
	}
	
	//test for exception when phoneNumber is not exactly 10 digits long
	@Test
	void testPhoneWrongLength() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("d84f22182b", "Jane", "Doe", "1234567890123", "123 Main Street");
		});
	}
	
	//test for exception when phoneNumber contains characters that are not digits
	@Test
	void testPhoneNotDigits() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("d84f22182b", "Jane", "Doe", "123abc7890", "123 Main Street");
		});
	}
	
	
	//test for exception when phoneNumber is null
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("d84f22182b", "Jane", "Doe", null, "123 Main Street");
	    });
	}
	
	//test for exception when address is too long
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("d84f22182b", "Jane", "Doe", "1234567890", "123 Main Street 123 Main Street 123 Main Street");
	    });
	}
	
	//test for exception when address is null
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("d84f22182b", "Jane", "Doe", "1234567890", null);
	    });
	}
	

}
