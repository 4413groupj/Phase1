package com.projlearn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // Make user class Entity eleigible
public class User {
	
	@Id
	private int	   userID;
	private String userFirstName;
	private String userSecondName;
	private String emailAddress;
	
	
	
	
	public User() {
		
		// TODO Auto-generated constructor stub
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserSecondName() {
		return userSecondName;
	}
	public void setUserSecondName(String userSecondName) {
		this.userSecondName = userSecondName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "User [userFirstName=" + userFirstName + ", userSecondName=" + userSecondName + ", userID=" + userID
				+ ", emailAddress=" + emailAddress + "]";
	}
	

}
