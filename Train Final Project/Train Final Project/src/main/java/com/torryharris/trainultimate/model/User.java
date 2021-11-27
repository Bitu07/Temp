package com.torryharris.trainultimate.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sNo;
    private String userName;
    private String email;
    private String password;
    
    
    
    
	public User() {
		super();
	}
	public User(int sNo, String userName, String email, String password) {
		super();
		this.sNo = sNo;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [sNo=" + sNo + ", userName=" + userName + ", email=" + email + ", password=" + password + "]";
	}
}
