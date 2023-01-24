package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Billing;
import com.crm.entities.Contact;
import com.crm.service.BillingService;
import com.crm.service.ContactService;

@Controller
public class BillingController {
	@Autowired
	private ContactService contactservice;
	@Autowired
	private BillingService billingservice;
@RequestMapping("/billingform")
public String viewBillingForm(@RequestParam("id") long id,Model model)
{
	Contact contact= contactservice.findContactById(id);
	model.addAttribute("contact", contact);
	return "create_bill";
}
@RequestMapping("/generateBill")
public String genearteBill(@ModelAttribute("billing") Billing billing)
{
	billingservice.generateInvoice(billing);
	return "create_bill";
	
}
}
