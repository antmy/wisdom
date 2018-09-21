package com.ant.service.impl;

import com.ant.dao.UserDao;
import com.ant.dao.impl.UserDaoImpl;
import com.ant.domain.User;
import com.ant.service.UserService;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();
	
	//注册
	public void register(User user) throws Exception {
		userDao.addUser(user);

	}
	
	//登录
	public User login(User user) {
		User u = null;
		try {
			u = userDao.findUser(user);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return u;
	}

}
