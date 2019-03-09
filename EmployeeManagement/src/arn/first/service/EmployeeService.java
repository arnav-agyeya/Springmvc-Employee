package arn.first.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arn.first.dao.EmployeeDao;
import arn.first.entity.EmployeePojo;

@Service
public class EmployeeService implements EmployeeServiceIn {
	
	@Autowired
	private EmployeeDao ed;
	
	public ArrayList<EmployeePojo> showAllEmployees() throws ClassNotFoundException, SQLException {
		ArrayList<EmployeePojo> result=  ed.getAllEmployees();
		return result;
	}

	public boolean insertEmployees(EmployeePojo ep) throws ClassNotFoundException, SQLException {
		boolean fl= ed.insertEmployees(ep);
		if(fl)
			return true;
		return false;
	}

}
