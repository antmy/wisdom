package com.ant.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.ant.domain.User;
import com.ant.service.UserService;
import com.ant.service.impl.UserServiceImpl;

public class RegServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//获取表单数据
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		//调用业务逻辑
		UserService us = new UserServiceImpl();
		try {
			us.register(user);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		//分发转向
		response.getWriter().write("注册成功！1s后跳转到登录界面");
		response.setHeader("refresh", "1;url="+request.getContextPath()+"/log.jsp");
			//request.getContextPath()拿到的是这个web项目的根路径
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
