package com.zensar.olx.bean;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="olx_users_table")
public class OlxUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int olxUserId;
	
	private String firstName;
	
	private String lastName;
	@NonNull
	private String userName;
	
	@Enumerated(EnumType.STRING)
	@NonNull
	private Active active;
	
	private String password;
	@NonNull
	private String emailId;
	@NonNull
	private String phoneNumber;
	@NonNull
	private String role;
	public OlxUser() {
		super();
	}
	public OlxUser(int olxUserId) {
		super();
		this.olxUserId = olxUserId;
	}
	public OlxUser(int olxUserId, String firstName, String lastName, String userName, Active active, String password,
			String emailId, String phoneNumber, String role) {
		super();
		this.olxUserId = olxUserId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.active = active;
		this.password = password;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}
	public int getOlxUserId() {
		return olxUserId;
	}
	public void setOlxUserId(int olxUserId) {
		this.olxUserId = olxUserId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Active getActive() {
		return active;
	}
	public void setActive(Active active) {
		this.active = active;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public int hashCode() {
		return Objects.hash(olxUserId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OlxUser other = (OlxUser) obj;
		return olxUserId == other.olxUserId;
	}
	@Override
	public String toString() {
		return "OLXUser [olxUserId=" + olxUserId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", role=" + role + "]";
	}
	
	
	
	
	

}
