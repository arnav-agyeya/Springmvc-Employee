package arn.first.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arn.first.dao.AdminDao;
import arn.first.dao.AdminDaoImpl;

@Service
public class AdminService implements AdminServiceIn {
	@Autowired
	private AdminDao ad;
	
	public boolean searchAdmin(String userName, String passWord) throws ClassNotFoundException, SQLException {
		
		if(ad.validateAdmin(userName, passWord)) {
			return true;
		}
		
		return false;
	}
}
