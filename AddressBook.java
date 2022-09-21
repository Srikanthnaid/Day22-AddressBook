package com.AddressBook;

import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program...!!!");
		Scanner sc = new Scanner(System.in);
		
		/**
		 * creating object of AddNewContact for adding new contact
		 */
		AddNewContact addNew = new AddNewContact();
		
		/**
		 * adding multiple persons in address book
		 */
		addNew.addMultipleContact();

		while (true) {
			System.out.println("Enter your choice:\n " 
									+ "1. Add Contact\n " 
									+ "2. Edit Contact \n "
									+ "3. Display Contacts  " 
									+ "\n 4. Exit ");
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("Enter the contact detais to add in the Address Book: ");
				addNew.addContact();

				break;
			case 2:
				System.out.println("Enter the detais to edit: ");
				addNew.editContact();

				break;

			case 3:
				System.out.println("The contacts in the Address Book are ");
				addNew.displayContact();
				break;

			case 4:
				System.out.println("Enter Person to delete");
				addNew.deleteContact();
				break;
				
			case 5:
				System.out.println("Exited : ");
				sc.close();
				return;
			}
		}

	}
}
