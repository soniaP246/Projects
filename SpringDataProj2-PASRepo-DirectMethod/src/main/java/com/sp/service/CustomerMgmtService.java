package com.sp.service;

import com.sp.dto.CustomerDTO;

public interface CustomerMgmtService {
	public Iterable<CustomerDTO>fetchAllRecordsSortByProperty(String property, boolean asc );
	public Iterable<CustomerDTO>fetchAllRecordsSortByProperties(boolean asc, String ...properties);
	public Iterable<CustomerDTO>fetchRecordsByPageNoAndSize(int pageNo,int pageSize);

}
