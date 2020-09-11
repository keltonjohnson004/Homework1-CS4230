package edu.weber;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.weber.model.Contact;
import edu.weber.service.contactService;
import edu.weber.model.Address;

@WebServlet(name="MyFirstServlet", urlPatterns="/")

public class MyFirstServlet extends HttpServlet
{

	contactService contactservice = new contactService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Contact> userList = contactservice.getContacts();
		req.setAttribute("contact", userList);
		req.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		List<Contact> userList = contactservice.getContacts();
		

			Contact newContact = new Contact(
					req.getParameter("firstName"),
					req.getParameter("lastName"),
					req.getParameter("phoneNumber"),
					new Address(
							req.getParameter("streetAddress"),
							req.getParameter("city"),
							req.getParameter("state"),
							req.getParameter("zipCode"),
							req.getParameter("country"),
							req.getParameter("addressType")));

		contactservice.addContact(newContact);
		
		req.setAttribute("contact", userList);
		req.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
	}
    
	
	
}
