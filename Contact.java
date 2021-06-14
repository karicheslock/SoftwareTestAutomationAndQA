//CS320 Project One
//Kari L. Cheslock - 06/07/21

package contactService;

public class Contact {
	
	//instantiating local variables for the Contact class
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	//field length constants for string variables
	private int FIELDLENGTH_1 = 10;
	private int FIELDLENGTH_2 = 30;
	
	
	
	//constructor with all required fields
	public Contact (String contactId, String firstName, String lastName, String phoneNumber, String address) {
		//check if contactId is null or length greater than 10
		if (contactId == null || contactId.length()>FIELDLENGTH_1) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		//check if firstName is null or length greater than 10
		if (firstName == null || firstName.length()>FIELDLENGTH_1) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		//check if lastName is null or length greater than 10
		if (lastName == null || lastName.length()>FIELDLENGTH_1) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		//regular expression variable to use to check if phoneNumber contains only digits
		String digitRegex = "[0-9]+";
		//check if phoneNumber is null or is not exactly 10 digits or contains characters other than digits
		if (phoneNumber == null || phoneNumber.length()!= FIELDLENGTH_1 || !phoneNumber.matches(digitRegex)) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		//check if address is null or length greater than 30
		if (address == null || address.length()>FIELDLENGTH_2) {
			throw new IllegalArgumentException("Invalid Address");
		}
		//instance variables
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	
	//mutator and accessor methods for class variables
	//contactID does not have a mutator method since it is not updatable
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

}
