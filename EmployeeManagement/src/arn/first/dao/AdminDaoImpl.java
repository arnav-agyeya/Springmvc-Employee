package arn.first.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import arn.first.entity.AdminPojo;
import arn.first.utility.JDBCConnection;

@Repository
public class AdminDaoImpl implements AdminDao {

	public boolean validateAdmin(String userName,String passWord) throws SQLException,ClassNotFoundException {
		
		Connection connection = JDBCConnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from admin where loginname=? AND PASSWORD=?");
		preparedStatement.setString(1, userName);
		preparedStatement.setString(2, passWord);
		
		ResultSet resultSet= preparedStatement.executeQuery();
		if(resultSet.next()==false) {
			return false;
		}
		
		return true;
	}

}
