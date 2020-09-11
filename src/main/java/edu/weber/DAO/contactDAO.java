package edu.weber.DAO;

import java.util.ArrayList;
import java.util.List;

import edu.weber.model.Address;
import edu.weber.model.Contact;

public class contactDAO {
	
	

	List<Contact> userList;
	
	public contactDAO()
	{
		userList =  new ArrayList<Contact>();
		userList.add(new Contact(
			"Kelton",
			"Johnson",
			"111-111-1111", 
			new Address(
					"123 Main",
					"Kaysville",
					"Utah",
					"84037",
					"USA",
					"Business")));
	
	userList.add(new Contact(
			"John",
			"Smith",
			"123-456-7890", 
			new Address(
					"127 Main",
					"Kaysville",
					"Utah",
					"84037",
					"USA",
					"Home")));
	
	userList.add(new Contact(
			"Ben",
			"Jones",
			"987-654-3210", 
			new Address(
					"131 Main",
					"Kaysville",
					"Utah",
					"84037",
					"USA",
					"Home")));
	}
	
	public List<Contact> getContacts()
	{
		return userList;
	}
	
	public Contact getContactByFirstName(String firstName, String type)
	{
		Contact response  = null;
		for(Contact cont: userList)
		{
			if(cont.getFirstName().equalsIgnoreCase(firstName) && cont.getAddress().getAddressType().equalsIgnoreCase(type))
			{
				response = cont;
			}
		}
		
		return response;
	}

	
	public void addContact(Contact list)
	{
		boolean doesUserExist = false;
		for(Contact cont: userList)
		{
			if( !doesUserExist && cont.getFirstName().equalsIgnoreCase(list.getFirstName()) &&
					cont.getLastName().equalsIgnoreCase(list.getLastName()) &&
					cont.getAddress().getAddressType().equalsIgnoreCase(list.getAddress().getAddressType()))
			{	
				doesUserExist = true;
			}
			
		}
		
		if(!doesUserExist)
		{
			userList.add(list);
		}
	}
}
