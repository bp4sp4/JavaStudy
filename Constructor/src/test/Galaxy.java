package test;

public class Galaxy {
	private String company;
	private String modelname;
	private String modelnumber;
	private String phone;
	
	public Galaxy(String company, String modelname, String modelnumber, String phone) {
		this.company = company;
		this.modelname = modelname;
		this.modelnumber = modelnumber;
		this.phone = phone;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModelName() {
		return modelname;
	}
	
	public String getModelNumber() {
		return modelnumber;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void SetPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
