// package Hostel_Management_System;
//
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.*;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JTextField;
// import javax.swing.border.LineBorder;
// import java.util.regex.*;
// import javax.swing.JOptionPane;
// import java.sql.*;
//
// public class DbConnection {
//
// private Connection con;
// private Statement st;
// private ResultSet rs;
// private int flag = 0;
// private JFrame Loginframe;
// public DbConnection(JFrame Loginframe) {
//
// this.Loginframe = Loginframe;
//
//// try {
////
//// Class.forName("com.mysql.cj.jdbc.Driver");
//// con =
// DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagementsystem","root","");
//// st = con.createStatement();
////
//// } catch(Exception e) {
////
//// System.out.println(e);
//// }
////
//// }
//
//
//// public void RegisterInsert(String queryInsert) {
////
//// try {
////
//// st.executeUpdate(queryInsert);
//// JOptionPane.showMessageDialog(null, "Registration Successfull");
////
////
//// } catch (SQLException e) {
//// System.out.println(e);
//// JOptionPane.showMessageDialog(null, "Registration Not Successfull");
////
//// }
////
////
//// }
//
//
//// public void loginmatch(String querylogin, String user, String pass)
//// {
////
////
////
//// try{
//// rs = st.executeQuery(querylogin);
////
//// while(rs.next())
//// {
//// String tablename = rs.getString(2);
//// String tablepass = rs.getString(4);
////
////
////
//// if(user.equals(tablename) && pass.equals(tablepass))
//// {
//// //LogIn login = new LogIn();
//// Loginframe.dispose();
////
//// new MainMenu();
////
//// JOptionPane.showMessageDialog(null, "Welcome");
//// flag = 1;
////
//// break;
//// }
////
////// else{
//////
////// flag = 0;
////// }
//// }
////
//// if(flag == 0)
//// {
//// JOptionPane.showMessageDialog(null, "In-valid User!!!");
////
////
//// }
////
////
////
//// } catch(Exception e){
////
//// JOptionPane.showMessageDialog(null, e);
////
//// }
////
//// }
//
//
//
//
// }
