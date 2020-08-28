package com.sp.service;

import java.util.List;

import com.sp.dto.CustomerDTO;

public interface CustomerMgmtService {
	public List<CustomerDTO>fetchAllRecordsByGivenExampleDTO(CustomerDTO dto);
    public  String  removeAllCustomers();

}
