package arn.first.entity;

public class EmployeePojo {
	private String eId,eName,designation,deoartment;
	private long basic;
	public EmployeePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeePojo(String eId, String eName, String designation, String deoartment, long basic) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.designation = designation;
		this.deoartment = deoartment;
		this.basic = basic;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDeoartment() {
		return deoartment;
	}
	public void setDeoartment(String deoartment) {
		this.deoartment = deoartment;
	}
	public long getBasic() {
		return basic;
	}
	public void setBasic(long basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "EmployeePojo [eId=" + eId + ", eName=" + eName + ", designation=" + designation + ", deoartment="
				+ deoartment + ", basic=" + basic + "]";
	}
	
	
	
}
