package com.test.service;

import com.test.pojo.User;

public interface TestService {

	User getUserById(String userId);
	
	boolean update(User user);
}
