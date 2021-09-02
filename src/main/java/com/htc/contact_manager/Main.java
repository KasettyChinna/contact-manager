package com.htc.contact_manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactManager manager = new ContactManager();
		manager.addContact("narasimha", "Kadapa", "9512486355");
		System.out.println(manager.getAllContacts());

	}

}
