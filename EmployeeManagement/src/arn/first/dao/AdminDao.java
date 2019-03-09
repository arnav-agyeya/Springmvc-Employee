package arn.first.dao;

import java.sql.SQLException;

import arn.first.entity.AdminPojo;

public interface AdminDao {
	
	boolean validateAdmin(String userName,String passWord) throws SQLException,ClassNotFoundException;
	
}
