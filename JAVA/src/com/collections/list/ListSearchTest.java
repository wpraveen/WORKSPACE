package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collections.entity.Contact;

public class ListSearchTest {
	
	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("111","Praveen Singh","family"));
		contacts.add(new Contact("333","Annu Singh","family"));
		contacts.add(new Contact("444","Anoop Nair","friend"));
		contacts.add(new Contact("222","Pratap","friend"));
		
		int index = Collections.binarySearch(contacts, new Contact("111","Praveen Singh","family"),Contact.phoneNoComprator);
		System.out.println("Value found at index: " + index);
		index = Collections.binarySearch(contacts, new Contact("444","",""),Contact.phoneNoComprator);
		System.out.println("Value found at index: " + index);
		
	}
}
