package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.entities.Contact;
import com.crm.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactservice;
	//http://localhost:8080/listcontacts
	@RequestMapping("listcontacts")
public String listContact( Model model)
{
	List<Contact> allContact = contactservice.getAllContact();
	model.addAttribute("allcontact", allContact);
	return "list_contacts";
	
}
}
