package arn.first.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import arn.first.entity.EmployeePojo;

public interface EmployeeDao {
	ArrayList<EmployeePojo> getAllEmployees()throws ClassNotFoundException, SQLException ;
	boolean insertEmployees(EmployeePojo ep) throws ClassNotFoundException,SQLException;
}
