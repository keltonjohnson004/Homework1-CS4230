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
		contactDao.addContact(contact);
	}
}
