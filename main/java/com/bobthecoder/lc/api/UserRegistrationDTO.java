package com.bobthecoder.lc.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.bobthecoder.lc.Validator.Age;

public class UserRegistrationDTO {

	@NotEmpty(message="*Name cannot be empty")
	private String name;
	private String userName;
	 
	@Age(lower=18, upper=30, message="*Age should be Between 18-30 years") 
	private Integer age;
	
	private char[] password;
	private String contryName;
	private String[] hobbies;
	private String gender;

	private CommunicationDTO communicationDTO;

	

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getContryName() {
		return contryName;
	}

	public void setContryName(String contryName) {
		this.contryName = contryName;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

}
