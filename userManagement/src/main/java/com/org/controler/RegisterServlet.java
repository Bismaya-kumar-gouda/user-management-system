package com.org.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.dao.UserDao;
import com.org.dto.*;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet 
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
//	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	   String id = req.getParameter("id");
	   String name = req.getParameter("name");
	   String age = req.getParameter("age");
	   String mobile = req.getParameter("mobile");
	   String gmail = req.getParameter("email");
	   String password = req.getParameter("password");
	   
	   int age1 = Integer.parseInt(age);
	   long mob = Long.parseLong(mobile);
	   
	   User u = new User();
	   u.setName(name);
	   u.setAge(age1);
	   u.setMobile(mob);
	   u.setEmail(gmail);
	   u.setPassword(password);
	  
	   UserDao dao = new UserDao();
	   dao.saveUser(u);
	   
	   resp.sendRedirect("register.jsp");
	  }
}
