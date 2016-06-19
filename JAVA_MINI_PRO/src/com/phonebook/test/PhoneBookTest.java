package com.phonebook.test;

import com.phonebook.entity.Contact;
import com.phonebook.service.PhoneBookService;

public class PhoneBookTest {
	
	public static void main(String[] args) {
			
		PhoneBookService phoneBookService = new PhoneBookService();
		phoneBookService.addContact(new Contact("111","Praveen Singh","family"));
		phoneBookService.addContact(new Contact("333","Annu Singh","family"));
		phoneBookService.addContact(new Contact("444","Anoop Nair","friend"));
		phoneBookService.addContact(new Contact("222","Pratap","friend"));
		System.out.println("-----------------------------------------------------");
		System.out.println("Displaying by name: Natural order by Comprable");
		System.out.println("-----------------------------------------------------");
		phoneBookService.dispalyContact();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Displaying by Phone No: Custom order by Comprator");
		System.out.println("-----------------------------------------------------");
		phoneBookService.displayByPhoneNo();
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Displaying by Gropy: Custome order by Comprator");
		System.out.println("-----------------------------------------------------");
		phoneBookService.displayByGroup();
		
	}
}
