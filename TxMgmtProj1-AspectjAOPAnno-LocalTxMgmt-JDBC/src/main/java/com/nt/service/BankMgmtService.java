package com.nt.service;

public interface BankMgmtService {
	public String transferMoney(long srcAcno, long destAcno, long amt)throws IllegalAccessException;

}
