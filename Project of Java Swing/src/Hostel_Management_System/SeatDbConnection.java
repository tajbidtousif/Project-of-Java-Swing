package Hostel_Management_System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.regex.*;
import java.sql.*;

public class SeatDbConnection   {
    
	private Connection conn;
	private Statement stt;
	private ResultSet rss;
	private int flag = 0;
	private JFrame  seatframe;
	
	
	public SeatDbConnection(JFrame seatframe) {
		
		this.seatframe = seatframe;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagementsystem","root","");
		     stt = conn.createStatement();
		  
		} catch(Exception e) {
			
			System.out.println(e);
		}
	    
	}


	public void SeatRegisterInsert(String queryInsert) {
		 
		try {
			
			seatframe.dispose();
			new MainMenu();
			stt.executeUpdate(queryInsert);
			JOptionPane.showMessageDialog(null, "Seat Booking Successfull");
			
		
		} catch (SQLException e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Seat Booking Not Successfull");
				
		}
		
		
	}


	
	}


