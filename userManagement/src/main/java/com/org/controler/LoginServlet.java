package com.org.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.dao.UserDao;
import com.org.dto.User;

public class LoginServlet extends HttpServlet

{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
    	String email = req.getParameter("eamil");
    	String password = req.getParameter("password");
    	
    	UserDao dao = new UserDao();
    	User user = dao.fetchUserByAndPassword(email, password);
    	
    	
    	if(user != null)
    	
    		resp.sendRedirect("home.jsp");
    	else
    		
    		resp.sendRedirect("");
    	
    	
    }
    
}
