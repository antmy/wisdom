package com.ant.dao;

import com.ant.domain.User;

public interface UserDao {
	/**
	 * 添加用户信息
	 * @param user
	 * @throws Exception
	 */
	//增操作
	public void addUser(User user) throws Exception;
	
	
	/**
	 * 根据用户名、密码，查找数据库有没有这个人
	 * @param user
	 * @return
	 * @throws Exception
	 */
	//查操作(不用void原因：登录成功不返回true、false，返回用户名，以便实现效果“欢迎您，xxx”)
	public User findUser(User user) throws Exception;
	
}
