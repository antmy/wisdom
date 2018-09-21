package com.ant.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ant.dao.UserDao;
import com.ant.domain.User;
import com.ant.utils.DBUtils;

public class UserDaoImpl implements UserDao {

	
	public void addUser(User user) throws Exception {
		/* 
		 * �������ݿ� ��Ҫ Connection
		 * ִ��sql��� ��Ҫ Statement,�������õ���PreparedStatement
		 * ��Ž���� ��Ҫ ResultSet,����û���õ�
		 */
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			//�������ݿ�
			conn = DBUtils.getConnection();
			//ִ�в������������һ����¼���û��������룩
			ps = conn.prepareStatement("INSERT INTO USER(username,PASSWORD,species,NAME,sex,certificate,idNumber,birth,telephone,relevant,relPhone,illHistory) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getSpecies());
			ps.setString(4, user.getName());
			ps.setString(5, user.getSex());
			ps.setString(6, user.getCertificate());
			ps.setString(7, user.getIdNumber());
			ps.setString(8, user.getBirth());
			ps.setString(9, user.getTelephone());
			ps.setString(10, user.getRelevant());
			ps.setString(11, user.getRelPhone());
			ps.setString(12, user.getIllHistory());
			
			
			//ִ�У�ָ���ֲ�������ctrl+2��ѡ��l��
			int i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			//�����쳣
			throw new RuntimeException("���ʧ�ܣ�");
		}finally{
			DBUtils.closeAll(null, ps, conn);
		}
	}

	
	public User findUser(User user) throws Exception {
		/* 
		 * �������ݿ� ��Ҫ Connection
		 * ִ��sql��� ��Ҫ Statement,�������õ���PreparedStatement
		 * ��Ž���� ��Ҫ ResultSet,����û���õ�
		 */
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//����u
		User u = null;

		try {
			//�������ݿ�
			conn = DBUtils.getConnection();
			//ִ�в��Ҳ���
			ps = conn.prepareStatement("select * from user where username=? and password=?");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			//ִ�в�ѯ������rs�����
			rs = ps.executeQuery();
			//��ȡ������û���������
			if(rs.next()){
				u = new User();
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
			}
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{//�ͷ�������Դ
			DBUtils.closeAll(rs, ps, conn);
		}
		
		return u;
	}

}
