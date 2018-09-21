package com.ant.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.ant.domain.User;
import com.ant.service.UserService;
import com.ant.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LogServlet
 */
@WebServlet("/servlet/LogServlet")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//��ȡ������
		User user = new User();

		try {
			BeanUtils.populate(user, request.getParameterMap());
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

		//����ҵ���߼�
		UserService us = new UserServiceImpl();
		try {
			user = us.login(user);
			//�ַ�ת��
			request.setAttribute("u", user);
				//setAttribute������ͬһ��request�����б������ʹ�á�������user���û������뵽u��
			if(user!=null){
				request.getRequestDispatcher("/welcome.jsp").forward(request,response);
			}
			else{
				request.getRequestDispatcher("/sorry.html").forward(request,response);
			}
			
				/*
				 * getRequestDispatcher:ת�����ĸ�ҳ��
				forward:ת��ҳ���ת������ҳ����Թ���request���������
				�ܵ���˵������ת����ǰ��ҳ�湲��һ��request
				*/
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
