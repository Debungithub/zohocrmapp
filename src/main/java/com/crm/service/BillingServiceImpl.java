package com.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entities.Billing;
import com.crm.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingrepo;
	@Override
	public void generateInvoice(Billing billing) {
		// TODO Auto-generated method stub
		billingrepo.save(billing);

	}

}
