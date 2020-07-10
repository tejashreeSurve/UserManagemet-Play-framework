package services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import models.User;

public class UserServices {
	private static UserServices instance;
	private Map<Integer, User> userList = new HashMap<>();

	public static UserServices getInstance() {
		if (instance == null) {
			instance = new UserServices();
		}
		return instance;
	}

	public User addUser(User user) {
		int id = userList.size() + 1;
		user.setUserId(id);
		userList.put(id, user);
		return user;
	}

	public User getUser(Integer id) {
		return userList.get(id);
	}

	public Set<User> getAllUser() {
		return new HashSet<>(userList.values());
	}

	public User updateUser(User user) {
		int id = user.getUserId();
		if (userList.containsKey(id)) {
			userList.put(id, user);
			return user;
		}
		return null;
	}

}
