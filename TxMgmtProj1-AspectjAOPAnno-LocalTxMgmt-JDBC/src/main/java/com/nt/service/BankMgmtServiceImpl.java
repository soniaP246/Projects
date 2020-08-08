package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.BankDAO;
@Service("bankService")
public class BankMgmtServiceImpl implements BankMgmtService {

	@Autowired
	private BankDAO dao;
	
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String transferMoney(long srcAcno, long destAcno, long amt) throws IllegalAccessException {
		int count1=0, count2=0;
		count1 = dao.withdraw(srcAcno, amt);
		try {
			Thread.sleep(10000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		count2 =dao.deposite(destAcno, amt);
		if(count1==0||count2==0)
			throw new IllegalArgumentException("problem in money transfer");
		else
			return amt+"amount of money transfered from"+srcAcno+" to "+destAcno;
		
	}

}
