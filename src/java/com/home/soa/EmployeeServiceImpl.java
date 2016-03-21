package com.home.soa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.home.soa.xsdtypes.Employee;
import com.home.soa.xsdtypes.EmployeeRequestMessage;
import com.home.soa.xsdtypes.EmployeeResponseMessage;
import com.home.soa.xsdtypes.ObjectFactory;

public class EmployeeServiceImpl implements Employee {

	static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);


	@Override
	public EmployeeResponseMessage getEmployeeDetail(EmployeeRequestMessage parameters) {
		logger.debug("Request came in for {}", parameters.getEmployeeId());
		ObjectFactory factory = new ObjectFactory();
		EmployeeResponseMessage response = factory.createEmployeeResponseMessage();
		response.setEmployeeId(parameters.getEmployeeId());
		response.setEmployeeName("Gaurav Rehan");
		return response;
	}

}
