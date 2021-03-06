package arn.first.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import arn.first.entity.EmployeePojo;
import arn.first.utility.JDBCConnection;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	public ArrayList<EmployeePojo> getAllEmployees() throws ClassNotFoundException, SQLException {
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM NEWEMPLOYEE");
		ResultSet resultSet=  preparedStatement.executeQuery();
		ArrayList<EmployeePojo> result= new ArrayList<EmployeePojo>();
		while(resultSet.next()) {
			EmployeePojo ep = new EmployeePojo(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getLong(5));
			result.add(ep);
			
		}
		
		return result;
	}

	public boolean insertEmployees(EmployeePojo ep) throws ClassNotFoundException, SQLException {
		
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO NEWEMPLOYEE VALUES(?,?,?,?,?)");
		preparedStatement.setString(1, ep.geteId());
		preparedStatement.setString(2, ep.geteName());
		preparedStatement.setString(3, ep.getDesignation());
		preparedStatement.setString(4, ep.getDeoartment());
		preparedStatement.setLong(5, ep.getBasic());
		
		int f=preparedStatement.executeUpdate();
		
		if(f==0) 
			return false;
		return true;
	}

}
