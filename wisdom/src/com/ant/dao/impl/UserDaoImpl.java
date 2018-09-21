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
		 * 连接数据库 需要 Connection
		 * 执行sql语句 需要 Statement,这里是用的是PreparedStatement
		 * 存放结果集 需要 ResultSet,这里没有用到
		 */
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			//连接数据库
			conn = DBUtils.getConnection();
			//执行插入操作，插入一条记录（用户名和密码）
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
			
			
			//执行（指定局部变量：ctrl+2，选择l）
			int i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			//定义异常
			throw new RuntimeException("添加失败！");
		}finally{
			DBUtils.closeAll(null, ps, conn);
		}
	}

	
	public User findUser(User user) throws Exception {
		/* 
		 * 连接数据库 需要 Connection
		 * 执行sql语句 需要 Statement,这里是用的是PreparedStatement
		 * 存放结果集 需要 ResultSet,这里没有用到
		 */
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//返回u
		User u = null;

		try {
			//连接数据库
			conn = DBUtils.getConnection();
			//执行查找操作
			ps = conn.prepareStatement("select * from user where username=? and password=?");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			//执行查询，返回rs结果集
			rs = ps.executeQuery();
			//获取输入的用户名、密码
			if(rs.next()){
				u = new User();
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{//释放所有资源
			DBUtils.closeAll(rs, ps, conn);
		}
		
		return u;
	}

}
