package com.ant.dao;

import com.ant.domain.User;

public interface UserDao {
	/**
	 * ����û���Ϣ
	 * @param user
	 * @throws Exception
	 */
	//������
	public void addUser(User user) throws Exception;
	
	
	/**
	 * �����û��������룬�������ݿ���û�������
	 * @param user
	 * @return
	 * @throws Exception
	 */
	//�����(����voidԭ�򣺵�¼�ɹ�������true��false�������û������Ա�ʵ��Ч������ӭ����xxx��)
	public User findUser(User user) throws Exception;
	
}
