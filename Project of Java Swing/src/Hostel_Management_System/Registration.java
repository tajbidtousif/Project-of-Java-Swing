package Hostel_Management_System;

import java.awt.*;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class Registration extends JFrame {

    JPanel headerpanel, inputpanel;

    public Registration() {

        // ****************************Adding Image in the Frame*********************************//

        ImageIcon img = new ImageIcon("src/Hostel_Management_System/Leading.jpg");
        Image image = img.getImage();
        image = image.getScaledInstance(800, 900, Image.SCALE_SMOOTH);
        img = new ImageIcon(image);
        JLabel bglabel = new JLabel(img);
        bglabel.setBounds(0, 0, 800, 900);
        JPanel bgpanel = new JPanel();
        bgpanel.setBounds(0, 0, 800, 900);
        bgpanel.add(bglabel);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 800, 900);
        layeredPane.add(bgpanel, JLayeredPane.FRAME_CONTENT_LAYER);
        add(layeredPane);

        // ****************************FrameWork*********************************//

        setSize(800, 900);
        setTitle("Leading University Hostel Management System");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);
        setResizable(false);

        Font labelFont = ((new Font("Arial", Font.BOLD, 16)));

        // ****************************HeaderPanel*********************************//

        headerpanel = new JPanel();
        headerpanel.setBackground(Color.LIGHT_GRAY);
        headerpanel.setBounds(160, 180, 490, 60);
        layeredPane.add(headerpanel, JLayeredPane.DEFAULT_LAYER);

        JLabel headerTxt = new JLabel("RegistrationFrom");
        headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
        headerpanel.add(headerTxt);

        // ****************************Input Panel*********************************//

        inputpanel = new JPanel();
        inputpanel.setBackground(new Color(77, 95, 86, 170));
        inputpanel.setBounds(160, 250, 490, 425);
        inputpanel.setLayout(null);
        layeredPane.add(inputpanel, JLayeredPane.DEFAULT_LAYER);

        // ****************************Full Name Field*********************************//

        JLabel name = new JLabel("Full Name  :");
        name.setForeground(Color.WHITE);
        name.setBounds(70, 5, 100, 25);
        name.setFont(labelFont);
        inputpanel.add(name);

        JTextField nameTxt = new JTextField();
        nameTxt.setFont(labelFont);
        nameTxt.setBounds(200, 5, 200, 25);
        nameTxt.setFont(labelFont);
        inputpanel.add(nameTxt);

        // ****************************UserName Field*********************************//

        JLabel username = new JLabel("Username :");
        username.setForeground(Color.WHITE);
        username.setBounds(70, 50, 100, 25);
        username.setFont(labelFont);
        inputpanel.add(username);

        JTextField usernameTxt = new JTextField();
        usernameTxt.setFont(labelFont);
        usernameTxt.setBounds(200, 50, 200, 25);
        usernameTxt.setFont(labelFont);
        inputpanel.add(usernameTxt);

        // ****************************Student ID
        // Field*********************************//

        JLabel stdid = new JLabel("Student ID :");
        stdid.setForeground(Color.WHITE);
        stdid.setBounds(70, 100, 100, 25);
        stdid.setFont(labelFont);
        inputpanel.add(stdid);

        JTextField stdidTxt = new JTextField();
        stdidTxt.setFont(labelFont);
        stdidTxt.setBounds(200, 100, 200, 25);
        stdidTxt.setFont(labelFont);
        inputpanel.add(stdidTxt);

        // ****************************Password Field*********************************//

        JLabel password = new JLabel("Password :");
        password.setForeground(Color.WHITE);
        password.setBounds(70, 150, 170, 25);
        password.setFont(labelFont);
        inputpanel.add(password);

        JPasswordField passTxt = new JPasswordField();
        passTxt.setBounds(200, 150, 200, 25);
        passTxt.setFont(labelFont);
        inputpanel.add(passTxt);

        // ****************************Confirm Password
        // Field*********************************//

        JLabel conpass = new JLabel("Confirm Password :");
        conpass.setForeground(Color.WHITE);
        conpass.setBounds(5, 200, 150, 25);
        conpass.setFont(labelFont);
        inputpanel.add(conpass);

        JPasswordField conpassTxt = new JPasswordField();
        conpassTxt.setBounds(200, 200, 200, 25);
        conpassTxt.setFont(labelFont);
        inputpanel.add(conpassTxt);

        // ****************************Student Mail
        // Field*********************************//

        JLabel mail = new JLabel("Student Mail :");
        mail.setForeground(Color.WHITE);
        mail.setBounds(50, 250, 120, 25);
        mail.setFont(labelFont);
        inputpanel.add(mail);

        JTextField mailTxt = new JTextField();
        mailTxt.setFont(labelFont);
        mailTxt.setBounds(200, 250, 200, 25);
        mailTxt.setFont(labelFont);
        inputpanel.add(mailTxt);

        // ****************************Registration Button
        // Field*********************************//

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(300, 300, 100, 30);
        registerBtn.setBackground(new Color(219, 143, 160));
        registerBtn.setFont(labelFont);
        registerBtn.setForeground(Color.WHITE);
        registerBtn.setBorder(new LineBorder(Color.RED));
        inputpanel.add(registerBtn);

        // ****************************UnderText
        // Field*********************************//

        JLabel undrTxt = new JLabel("Already have an account? LogIn");
        undrTxt.setBounds(150, 350, 180, 50);
        inputpanel.add(undrTxt);

        undrTxt.setForeground(Color.WHITE);

        // ****************************MouseListener at UnderText
        // Field*********************************//

        undrTxt.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                undrTxt.setCursor(new Cursor(Cursor.HAND_CURSOR));
                undrTxt.setForeground(Color.GREEN);
            }

            public void mouseExited(MouseEvent e) {
                undrTxt.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                undrTxt.setForeground(Color.WHITE);
            }

            public void mousePressed(MouseEvent e) {
                dispose();
                new LogIn();
            }
        });

        // ****************************Action Listener At Registration button
        // *********************************//

        registerBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String name = nameTxt.getText();
                String username = usernameTxt.getText();
                String stdid = stdidTxt.getText();
                // String pass = passTxt.getText();
                String pass = new String(passTxt.getPassword());
                // String conpass = conpassTxt.getText();
                String conpass = new String(conpassTxt.getPassword());
                String mail = mailTxt.getText();

                // ****************************Validation
                // Part*********************************//

                String regexname = "^[a-z]+$";
                String regexstdid = "[0-9]+";
                String regexMobile = "(\\+88)?-?01[3-9]\\d{8}";
                String regexpass = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[@$%*()]).*{4,6}$";
                String regexEmail = "[a-z0-9]+@lus.ac.bd";

                // ****************************Matching or not
                // Option*********************************//

                if (!Pattern.matches(regexname, username)) {
                    JOptionPane.showMessageDialog(null, "In-Valid UserName! Try Again");
                }

                else if (!Pattern.matches(regexstdid, stdid)) {
                    JOptionPane.showMessageDialog(null, "In-Valid Student ID! Try Again");
                }

                else if (!Pattern.matches(regexpass, pass)) {
                    JOptionPane.showMessageDialog(null, "In-Valid password! Try Again");

                } else if (!conpass.equals(pass)) {
                    JOptionPane.showMessageDialog(null, "Unmatched Password! Try Again");
                }

                else if (!Pattern.matches(regexEmail, mail)) {
                    JOptionPane.showMessageDialog(null, "In-Valid Email Address! Try Again");
                }

                // *******************************DATABASE CONNECTION*******************************

                else {

                    // DbConnection db = new DbConnection(f);
                    //
                    // String queryInsert = "INSERT INTO `registerlist`(name, username, stdid, pass,
                    // mail) VALUES ('"+name+"','"+username+"','"+stdid+"','"+pass+"','"+mail+"')";
                    //
                    // db.RegisterInsert(queryInsert);

                    try {

                        Class.forName("com.mysql.cj.jdbc.Driver");
                        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagementsystem", "root", "");
                        java.sql.Statement stmt = con.createStatement();
                        String sql = "SELECT * FROM registerlist WHERE username = '" + username + "'";

                        ResultSet rs = stmt.executeQuery(sql);

                        if (rs.next()) {
                            JOptionPane.showMessageDialog(null, "This username already exist! Try Another One");

                        } else {
                            String queryInsert = "INSERT INTO `registerlist`(name, username, stdid, pass, mail) VALUES ('"
                                    + name + "','" + username + "','" + stdid + "','" + pass + "','" + mail + "')";
                            stmt.executeUpdate(queryInsert);
                            JOptionPane.showMessageDialog(null, "Registered!");
                        }

                    } catch (SQLException x) {
                        x.printStackTrace();
                    } catch (ClassNotFoundException ex) {

                    }
                }

            }

        });

        setVisible(true);

    }

 

}