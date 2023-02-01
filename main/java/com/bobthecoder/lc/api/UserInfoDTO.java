package com.bobthecoder.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "* Your Name cannot be blank")
	@Size(min = 3, max = 15, message = "* Your User Name should have char between 3-15")
	private String userName;

	@NotBlank(message = "* Crush Name cannot be blank")
	@Size(min = 3, max = 15, message = "* Your Crush Name should have char between 3-15")
	private String crushName;

	@AssertTrue(message = "* You have to agree to use our app")
	private boolean termAndCondition;

	private String result;

	public UserInfoDTO() {
		System.out.println("user info dto contr called");
	}

	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
