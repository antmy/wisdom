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
		//获取表单数据
		User user = new User();

		try {
			BeanUtils.populate(user, request.getParameterMap());
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		//调用业务逻辑
		UserService us = new UserServiceImpl();
		try {
			user = us.login(user);
			//分发转向
			request.setAttribute("u", user);
				//setAttribute用来在同一个request周期中保存变量使用。即保存user的用户名密码到u中
			if(user!=null){
				request.getRequestDispatcher("/welcome.jsp").forward(request,response);
			}
			else{
				request.getRequestDispatcher("/sorry.html").forward(request,response);
			}
			
				/*
				 * getRequestDispatcher:转发到哪个页面
				forward:转发页面和转发到的页面可以共享request里面的数据
				总的来说是请求转发，前后页面共享一个request
				*/
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
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
