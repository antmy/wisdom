package com.ant.service;

import com.ant.domain.User;

public interface UserService {
	/**
	 * ����û���Ϣ��ע�ᣩ
	 * @param user
	 * @throws Exception
	 */
	public void register(User user) throws Exception;
	
	
	/**
	 * �����û��������룬�������ݿ���û������ˣ���¼��
	 * @param user
	 * @return
	 * @throws Exception
	 */
	//�����(����voidԭ�򣺵�¼�ɹ�������true��false�������û������Ա�ʵ��Ч������ӭ����xxx��)
	public User login(User user);
}
