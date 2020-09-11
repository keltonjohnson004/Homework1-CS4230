package edu.weber;

import static org.junit.Assert.assertTrue;

import java.util.*;

import org.junit.Test;
import org.mockito.Mockito;

import edu.weber.DAO.contactDAO;
import edu.weber.model.Address;
import edu.weber.model.Contact;
import edu.weber.service.contactService;
import org.mockito.ArgumentMatchers;



public class AppTest 
{
       
    @Test
    public void mockShouldReturnContactsWithFirstNameOfTest()
    {
    	contactDAO contactDao = Mockito.mock(contactDAO.class);
    	Mockito.when(contactDao.getContactByFirstName("Test", "Business")).thenReturn(createContact());
    	
    	
    	contactService contactservice = new contactService(contactDao);
    	Contact contacts = contactservice.getContactByFirstName("Test", "Business");
        assertTrue( "Test".equalsIgnoreCase(contacts.getFirstName()) );
        
    }
    
    @Test
    public void mockShouldReturnContactList()
    {
    	contactDAO contactDao = Mockito.mock(contactDAO.class);
    	Mockito.when(contactDao.getContacts()).thenReturn(createContactList());
    	
    	contactService contactservice = new contactService(contactDao);
    	List<Contact> contacts = contactservice.getContacts();
    	assertTrue("List size doesn't match", contacts.size() == 3);
    }
    
    

    private Contact createContact()
    {
    	return new Contact(
    			"Test",
    			"Test",
    			"111-111-1111", 
    			new Address(
    					"123 Main",
    					"Kaysville",
    					"Utah",
    					"84037",
    					"USA",
    					"Business"));
    	
    }
    
    private List<Contact> createContactList()
    {
    	List<Contact> contactList = new ArrayList<Contact>();
    	 contactList.add(new Contact(
    			"Test1",
    			"Test1",
    			"111-111-1111", 
    			new Address(
    					"123 Main",
    					"Kaysville",
    					"Utah",
    					"84037",
    					"USA",
    					"Business")));
    	 contactList.add(new Contact(
     			"Test2",
     			"Test2",
     			"111-111-1111", 
     			new Address(
     					"123 Main",
     					"Kaysville",
     					"Utah",
     					"84037",
     					"USA",
     					"Home")));
    	 contactList.add(new Contact(
     			"Test3",
     			"Test3",
     			"111-111-1111", 
     			new Address(
     					"123 Main",
     					"Kaysville",
     					"Utah",
     					"84037",
     					"USA",
     					"Business")));
    	return contactList;
    }


}
