package com.ant.service;

import com.ant.domain.User;

public interface UserService {
	/**
	 * 添加用户信息（注册）
	 * @param user
	 * @throws Exception
	 */
	public void register(User user) throws Exception;
	
	
	/**
	 * 根据用户名、密码，查找数据库有没有这个人（登录）
	 * @param user
	 * @return
	 * @throws Exception
	 */
	//查操作(不用void原因：登录成功不返回true、false，返回用户名，以便实现效果“欢迎您，xxx”)
	public User login(User user);
}
