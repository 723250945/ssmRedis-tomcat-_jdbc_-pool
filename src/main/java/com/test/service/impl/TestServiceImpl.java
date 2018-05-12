package com.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.TestDao;
import com.test.pojo.User;
import com.test.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Resource
	private TestDao testDao;


	public User getUserById(String userId) {
		return this.testDao.selectByPrimaryKey(userId);
	}


	public boolean update(User user) {
		return testDao.update(user)==1;
	}

}
