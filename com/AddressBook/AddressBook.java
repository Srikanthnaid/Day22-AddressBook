package com.AddressBook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program...!!!");
		/*
		 * created list for contact info
		 */
		List<Contact> contact = new ArrayList<Contact>();
		/**
		 * creating object of AddNewContact for adding new contact
		 */
		AddNewContact addNew = new AddNewContact();
		/*
		 * Passing the parameters to object of contact
		 */
		Contact newContact = new Contact("Srikanth\n", "Naidu\n", "Alampur\n", "Hyderabad\n", "Telangana\n", "424005\n", "123456789\n",
				"abc123@gmail.com");
		/*
		 * adding contact to list
		 */
		contact.add(newContact);
		System.out.println(" ");
		/*
		 * adding new contact to address book
		 */
		addNew.addContact(contact);
		System.out.println("\n"+contact);
	}

}
