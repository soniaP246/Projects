package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bankDAO")
public class BankDAOImpl implements BankDAO {
	private static final String WITHDRAW_QUERY="UPDATE BANKACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=?";
	private static final String DEPOSITE_QUERY = "UPDATE BANKACCOUNT SET BALANCE = BALANCE+? WHERE ACNO=?";
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int withdraw(long acno, long amt) {
		int count=0;
		count = jt.update(WITHDRAW_QUERY, amt, acno);
		return count;
	}

	@Override
	public int deposite(long acno, long amt) {
		int count=0;
		count = jt.update(DEPOSITE_QUERY, amt, acno);
		return count;
	}

}
