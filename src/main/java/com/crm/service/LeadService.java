package com.crm.service;

import java.util.List;

import com.crm.entities.Lead;
public interface LeadService {
public void saveOneLead(Lead lead);
public List<Lead> getAllLeads();
public Lead findLeadById(long id);
public void deleteOneLeadById(long id);
}
