package models;

import java.util.HashSet;
import java.util.Set;

public class User {

	public  Integer userId;
	public String fName;
	public String mName;
	public String lName;
	public String userEmail;
	public String password;

	public User(Integer userId, String fName, String mName, String lName, String userEmail, String password) {
		this.userId = userId;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.userEmail = userEmail;
		this.password = password;
	}

	public static Set<User> users;
	
	static {
		users =  new HashSet<>();
		users.add(new User(1,"tejashree","vasudev","surve","tejutanvi773@gmail.com","teju123"));
		users.add(new User(1,"tanvi","vasudev","surve","tanvi773@gmail.com","tanvi123"));
		
	}
	
	public static Set<User> allUser(){
		return users;
	}
	
	
	public static User findById(Integer id) {
		for(User user:users) {
			if(id.equals(user.userId)) {
				return user;
			}
		}
		return null;
	}
	
	public static void addUser(User user) {
		users.add(user);
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

}
