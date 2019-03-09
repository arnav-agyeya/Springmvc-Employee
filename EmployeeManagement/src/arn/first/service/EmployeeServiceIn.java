package arn.first.service;
import java.sql.SQLException;
import java.util.ArrayList;

import arn.first.entity.*;

public interface EmployeeServiceIn {
	ArrayList <EmployeePojo> showAllEmployees()throws ClassNotFoundException, SQLException;
	boolean insertEmployees(EmployeePojo ep) throws ClassNotFoundException, SQLException;
}
