package arn.first.service;

import java.sql.SQLException;

public interface AdminServiceIn  {
	public boolean searchAdmin(String userName, String passWord) throws SQLException,ClassNotFoundException;
}
