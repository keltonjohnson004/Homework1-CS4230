package edu.weber.service;

import java.util.List;

import edu.weber.DAO.contactDAO;
import edu.weber.model.Contact;

public class contactService {

	private contactDAO contactDao;

	public contactService()
	{
		contactDao = new contactDAO();
	}
	
	public contactService(contactDAO Dao)
	{
		contactDao = Dao;
	}
	public List<Contact> getContacts()
	{
		return contactDao.getContacts();
	}
	
	public Contact getContactByFirstName(String firstName, String type)
	{
		return contactDao.getContactByFirstName(firstName, type);
	}
	
	public void addContact(Contact contact)
	{
		if(validateContact(contact))
		{
			contactDao.addContact(contact);
		}
	}
	
	public boolean validateContact(Contact contact)
	{
		if(contact.getFirstName() != "" && contact.getLastName() != "" && contact.getPhoneNumber() != "" &&
				contact.getAddress().getAddressLine1() != ""  && contact.getAddress().getAddressType()  != ""&& 
				contact.getAddress().getCity() != "" && contact.getAddress().getCountry() != "" &&
				contact.getAddress().getState() != "" && contact.getAddress().getZipCode() != "")
		{
			return true;
		}
		else {
			return false;
		}
	}
}
