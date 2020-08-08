package com.nt.dao;

public interface BankDAO {
	public int withdraw(long acno, long amt);
	public int deposite(long acno, long amt);
	

}
