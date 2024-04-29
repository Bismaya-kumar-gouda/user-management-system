package com.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.org.dto.User;

public class UserDao {
	
	public static void saveUser(User user) 
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgmt","root","root");
		    PreparedStatement pst = con.prepareStatement
		    		("insert into user(name,age,mobile,email,password) valuse(?,?,?,?,?)");
		    pst.setString(1, user.getName());
		    pst.setInt(2, user.getAge());
		    pst.setLong(3, user.getMobile());
		    pst.setString(4, user.getEmail());
		    pst.setString(5, user.getPassword());
		    
		    pst.executeUpdate();
		    con.close();
		    System.out.println("registration successfully");
		   } 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public User fetchUserByAndPassword(String email,String password) throws SQLException 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mgmt","root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



