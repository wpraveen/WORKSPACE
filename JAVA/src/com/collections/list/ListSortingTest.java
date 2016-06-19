package com.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import com.collections.entity.Contact;


public class ListSortingTest {
	
	
	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("111","Praveen Singh","family"));
		contacts.add(new Contact("333","Annu Singh","family"));
		contacts.add(new Contact("444","Anoop Nair","friend"));
		contacts.add(new Contact("222","Pratap","friend"));
		
		printContacts(contacts,"Natural Order");
		PriorityQueue<Contact> pQue= new PriorityQueue<>(contacts);
		printContacts(pQue,"Extending Natural Order by Comprable: On Name");
		
		List<Contact> l1 = new ArrayList<>(contacts);
		Collections.sort(l1, Contact.phoneNoComprator);
		printContacts(l1,"Custom Order by Comprator: On Phone No");
		
		List<Contact> l2 = new ArrayList<>(contacts);
		Collections.sort(l2, Contact.groupComprator);
		printContacts(l2,"Custom Order by Comprable: On Group");
		
		
		
	}

	private static void printContacts(Collection<Contact>collections,String msg)
	{
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println(msg);
		System.out.println("------------------------------------------");
		for (Contact contact : collections) {
			System.out.println(contact);
		}
	}
}
