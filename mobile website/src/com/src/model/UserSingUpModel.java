package com.src.model;

public class UserSingUpModel {

	private String firstName,lastName,emailId,password,address,city,state,pincode,mobnum;

	public UserSingUpModel(String firstName,String lastName,String emailId,String password,String repassword,String address,String city,String state,String pincode,String mobnum)
	{
		this.firstName = firstName;
		this.city = city;
		this.lastName = lastName;
		this.emailId = emailId;
		
		if(password==repassword)
		this.password = password;
		
		
		this.address = address;
		this.state = state;
		this.pincode = pincode;
		this.mobnum = mobnum;
		
		
		
	}

	public String getFirst_name() {
		return firstName;
	}
	public String getLast_name() {
		return lastName;
	}
	
	public String getEmail_ID() {
		return emailId;
	}
	public String getPassword() {
		return password;
	}
	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPincode() {
		return pincode;
	}

	public String getMobnum() {
		return mobnum;
	}

	
}
