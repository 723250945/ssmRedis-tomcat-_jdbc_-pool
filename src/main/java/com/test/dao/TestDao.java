package com.test.dao;

import com.test.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {

	User selectByPrimaryKey(String userId);
	
	int update(User user);

}
