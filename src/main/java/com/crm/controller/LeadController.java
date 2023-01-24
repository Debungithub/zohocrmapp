package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Contact;
import com.crm.entities.Lead;
import com.crm.service.ContactService;
import com.crm.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadservice;
	@Autowired
	private ContactService contactservice;
  //CREATE HANDLER METHOD
	//http://localhost:8080/create
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String viewCreateLeadPage()
	{
		return "lead_create";
	}
	@RequestMapping(value="/saveLead",method=RequestMethod.POST)
	public String saveLead(@ModelAttribute("lead") Lead lead,Model model)
	{
		leadservice.saveOneLead(lead);
		model.addAttribute("lead",lead);
		model.addAttribute("msg","LEAD IS SAVED!!");
		return "lead_info";
	}
	//http://localhost:8080/listleads
	@RequestMapping("/listleads")
	public String listLeads(Model model)
	{
		List<Lead> leads = leadservice.getAllLeads();
		model.addAttribute("leads",leads);
		return "list_leads";
	}
	@RequestMapping("/leadinfo")
	public String leadInfo(@RequestParam("id") long id,Model model)
	{
		Lead lead=leadservice.findLeadById(id);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,Model model)
	{
		Lead leads=leadservice.findLeadById(id);
		Contact contacts=new Contact();
		contacts.setFirstName(leads.getFirstName());
		contacts.setLastName(leads.getLastName());
		contacts.setEmail(leads.getEmail());
		contacts.setMobile(leads.getMobile());
		contacts.setSource(leads.getSource());
		contactservice.saveOneContact(contacts);
		leadservice.deleteOneLeadById(id);
		List<Contact> allContact = contactservice.getAllContact();
		model.addAttribute("allcontact", allContact);
		return "list_contacts";
	}
	{
		
	}
	
	
	
}
