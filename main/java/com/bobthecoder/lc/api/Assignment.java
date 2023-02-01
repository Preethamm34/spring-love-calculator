package com.bobthecoder.lc.api;

public class Assignment {

	private String name;
	private String age ;
	private String dob;
	private String gender ;
	private String email;
	private String phonenumber;
	private String address ;
	private String  state;
	private String district ;
	
	
	@Override
	public String toString() {
		return "Assignment [name=" + name + ", age=" + age + ", dob=" + dob + ", gender=" + gender + ", email=" + email
				+ ", phonenumber=" + phonenumber + ", address=" + address + ", state=" + state + ", district="
				+ district + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	
}
