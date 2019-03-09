package arn.first.entity;

public class AdminPojo {
	private String userName,passWord;

	public AdminPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminPojo( String userName, String passWord) {
		super();
		
		this.userName = userName;
		this.passWord = passWord;
	}

	

	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Admin [ userName=" + userName + ", passWord=" + passWord + "]";
	}
	
}
