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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.*;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class LogIn extends JFrame {

    JPanel hpanel, inputpanel;

    public LogIn() {

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

        // ****************************Frame Work*********************************//

        setSize(800, 900);
        setTitle("Leading University Hostel Management System");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);
        setResizable(false);

        // ****************************Header Panel*********************************//

        hpanel = new JPanel();
        hpanel.setBackground(Color.LIGHT_GRAY);
        hpanel.setBounds(160, 180, 490, 60);
        layeredPane.add(hpanel, JLayeredPane.DEFAULT_LAYER);

        JLabel headerTxt = new JLabel("LoginForm");
        // hpanel.setOpaque(false);
        headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
        hpanel.add(headerTxt);

        // ****************************Input Panel*********************************//

        inputpanel = new JPanel();
        inputpanel.setBounds(160, 250, 490, 425);
        inputpanel.setBackground(new Color(77, 95, 86, 170));
        inputpanel.setLayout(null);
        inputpanel.setOpaque(true);
        layeredPane.add(inputpanel, JLayeredPane.DEFAULT_LAYER);

        Font labelFont = ((new Font("Arial", Font.BOLD, 16)));

        // ****************************User Name Field*********************************//

        JLabel username = new JLabel("Username :");
        username.setForeground(Color.WHITE);
        username.setBounds(130, 70, 100, 25);
        username.setFont(labelFont);
        username.setFont(new Font("Arial", Font.BOLD, 16));
        inputpanel.add(username);

        JTextField userTxt = new JTextField();
        userTxt.setBounds(240, 70, 100, 25);
        userTxt.setFont(labelFont);
        inputpanel.add(userTxt);

        // ****************************Password Field*********************************//

        JLabel password = new JLabel("Password :");
        password.setBounds(130, 140, 100, 25);
        password.setFont(labelFont);
        password.setForeground(Color.WHITE);
        password.setFont(new Font("Arial", Font.BOLD, 16));
        inputpanel.add(password);

        JPasswordField passTxt = new JPasswordField();
        passTxt.setBounds(240, 140, 100, 25);
        inputpanel.add(passTxt);

        // ****************************Login Button Field*********************************//

        JButton login = new JButton("Login");
        login.setBounds(200, 200, 80, 25);
        login.setFont(labelFont);
        login.setBorder(new LineBorder(Color.BLACK));
        login.setBackground(new Color(169, 223, 191));
        login.setFont(new Font("Arial", Font.BOLD, 16));
        inputpanel.add(login);

        // ****************************Under Text  Field*********************************//

        JLabel undrTxt = new JLabel("Don't have an account?");
        undrTxt.setBounds(190, 310, 180, 50);
        undrTxt.setFont(new Font("Arial", Font.BOLD, 16));
        // undrTxt.setOpaque(true);

        undrTxt.setFont(new Font("Arial", Font.BOLD, 10));
        inputpanel.add(undrTxt);
        undrTxt.setForeground(Color.WHITE);

        // ****************************MouseListener at UnderText Field*********************************//

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
                new Registration();
            }
        });

        // ****************************ActionListener at Login Button With Database Connection*********************************//

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String user = userTxt.getText();

                // this line is deprecated
                // String pass = passTxt.getText();
                // instead of this line we will use the following line
                
                String pass = String.valueOf(passTxt.getPassword());


                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    java.sql.Connection con = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/hostelmanagementsystem", "root", "");

                    java.sql.Statement stmt = con.createStatement();
                    String sql = "SELECT * FROM registerlist WHERE username = '" + user + "' AND pass ='" + pass + "'";

                    ResultSet rs = stmt.executeQuery(sql);

                    if (rs.next()) {
                        dispose();
                        new MainMenu(user);
                        JOptionPane.showMessageDialog(null, "Welcome!");

                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Username Or Password");
                    }

                } catch (SQLException x) {
                    x.printStackTrace();
                }

                catch (ClassNotFoundException ex) {

                }
            }

        });

        setVisible(true);

    }

    public static void main(String[] args) {

        new LogIn();
    }

}
