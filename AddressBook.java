import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcom to the AddressBook problem.");
		/**
		 * creating list for contact information.
		 */
		List<Contact_Info> contact = new ArrayList<Contact_Info>();
		
		/*
		 * passing the parameters to object of contact.
		 */
		Contact_Info newcontact=new Contact_Info("Srikanth \n", "Naidu\n", "Alampur\n", "Hyderabad", "Telangana\n", 123, 630166309, "abc123@gmail.com\n");
		
		/*
		 * adding contact to list.
		 */
		contact.add(newcontact);
		System.out.println(contact);
		
	}

}
