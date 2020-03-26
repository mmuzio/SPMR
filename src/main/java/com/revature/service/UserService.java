package com.revature.service;

import java.util.List;

import com.revature.domain.Project;
import com.revature.domain.User;

public interface UserService {

	public User getUserByUsername(String username);
	
	public void registerUser(User user);
	
	public List<User> getUsersByProject(Project project);
	
}
