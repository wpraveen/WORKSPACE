package com.phonebook.entity;

import java.util.Comparator;

public class Contact implements Comparable<Contact> {

	private String name;

	private String mobileNo;

	private String group;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public Contact(String mobileNo, String name, String group) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.group = group;
	}

	/*
	 * Provide natural order by implementing Comparable
	 * This will be default comparison.
	 * Below are example where this method will be get called.
	 * 		1. 	Collections.sort(List)
	 * 		2. PriorityQueue
	 */
	@Override
	public int compareTo(Contact contact) {
		return this.name.compareTo(contact.getName());
	}

	/*
	 * Provide custom order, which get can be used on demand basis.
	 * Below are example where this method will be get called.
	 * 		1. 	Collections.sort(List, Comparator)
	 */
	public static Comparator<Contact> phoneNoComprator = new Comparator<Contact>() {
		@Override
		public int compare(Contact c1, Contact c2) {
			return c1.getMobileNo().compareTo(c2.getMobileNo());
		}
	};

	public static Comparator<Contact> groupComprator = new Comparator<Contact>() {
		@Override
		public int compare(Contact c1, Contact c2) {
			return c1.getGroup().compareTo(c2.getGroup());
		}
	};

	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobileNo=" + mobileNo + ", group=" + group + "]";
	}
	
	
}