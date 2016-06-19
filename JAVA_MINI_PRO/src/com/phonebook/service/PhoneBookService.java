package com.phonebook.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import com.phonebook.entity.Contact;

public class PhoneBookService {
	private PriorityQueue<Contact> contacts = new PriorityQueue<Contact>();

	public void addContact(Contact contact) {
		contacts.add(contact);
	}

	public void dispalyContact() {
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}

	public void displayByPhoneNo() {
		List<Contact> tempList = new ArrayList<>(this.contacts);
		Collections.sort(tempList, Contact.phoneNoComprator);
		for (Contact contact : tempList) {
			System.out.println(contact);
		}
	}
	
	public void displayByGroup() {
		List<Contact> tempList = new ArrayList<>(this.contacts);
		Collections.sort(tempList, Contact.groupComprator);
		for (Contact contact : tempList) {
			System.out.println(contact);
		}
	}

}
