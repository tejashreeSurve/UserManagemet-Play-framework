package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer userId;
	public String fName;
	public String mName;
	public String lName;
	public String userEmail;
	public String password;
	
	public User() {
		
	}

	public User(Integer userId, String fName, String mName, String lName, String userEmail, String password) {
		this.userId = userId;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.userEmail = userEmail;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", userEmail="
				+ userEmail + ", password=" + password + "]";
	}

}
