//CS320 Project One
//Kari L. Cheslock - 06/07/21


package contactService;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ContactService {
	
	//new ArrayList to hold Contact objects
	public List<Contact> contactList = new ArrayList<>();
	
	
	//method to add new contacts to contactList
	public void newContact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		//start by checking if appointmentId is unique
		if (searchId(contactId) != null) {
			throw new IllegalArgumentException("Contact Id already exists");
		} else {
			Contact contact = new Contact(contactId, firstName, lastName, phoneNumber, address);
			contactList.add(contact);
		}
	}
	
	
	//method to delete contact from contactList by specified uniqueId
	public void deleteContact(String contactId) {
		for (Iterator<Contact> contactsIterator = contactList.iterator(); contactsIterator.hasNext();) {
			Contact contact = contactsIterator.next();
			if (contact.getContactId().equals(contactId)) {
				contactsIterator.remove();
			} else {
				break;
			}
		}
	}
	
	//method for updating firstName field by searching uniqueId
	public void updateFirstName(String contactId, String firstName) {
		searchId(contactId).setFirstName(firstName);
	}
	
	//method for updating lastName by searching uniqueId
	public void updateLastName(String contactId, String lastName) {
		searchId(contactId).setLastName(lastName);
	}
	
	//method for updating phoneNumber by searching uniqueId
	public void updatePhoneNumber(String contactId, String phoneNumber) {
		searchId(contactId).setPhoneNumber(phoneNumber);
	}
	
	//method for updating address by searching uniqueId
	public void updateAddress(String contactId, String address) {
		searchId(contactId).setAddress(address);
	}
	
	//method for searching contactList by uniqueId
	public Contact searchId(String contactId) {
		Contact contact = null;
		for (int i = 0; i < contactList.size(); ++i) {
			if (contactList.get(i).getContactId() == contactId) {
				return contactList.get(i);
			}
		}
	return contact;
	}
	
}


