
package Hostel_Management_System;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.regex.*;

public class MainMenu extends JFrame {

	JButton regbtn, foodbtn, docbtn, securitybtn, logoutbtn;
	String username;

	public MainMenu() {
		this(null);
	}

	public MainMenu(String username) {

		Font labelFont = ((new Font("Arial", Font.BOLD, 12)));
		this.username = username;

		// ****************************Adding Image in the Frame*********************************//

		ImageIcon img = new ImageIcon("src/Hostel_Management_System/rain.jpg");
		Image image = img.getImage();
		image = image.getScaledInstance(600, 700, Image.SCALE_SMOOTH);
		img = new ImageIcon(image);
		JLabel bglabel = new JLabel(img);
		bglabel.setBounds(0, 0, 600, 700);
		JPanel bgpanel = new JPanel();
		bgpanel.setBounds(0, 0, 600, 700);
		bgpanel.add(bglabel);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 600, 700);
		layeredPane.add(bgpanel, JLayeredPane.FRAME_CONTENT_LAYER);
		add(layeredPane);

		// JPanel imgpanel = new JPanel();
		// imgpanel.setLayout(null);
		// imgpanel.setSize(150,250);

		ImageIcon img2 = new ImageIcon("src/Hostel_Management_System/user.png");
		Image image2 = img2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		img2 = new ImageIcon(image2);

		JLabel bglabel2 = new JLabel();
		bglabel2.setIcon(img2);
		bglabel2.setBounds(75, 20, 50, 50);

		JPanel bgpanel2 = new JPanel();
		bgpanel2.setLayout(null);
		bgpanel2.setBounds(450, 0, 150, 250);
		bgpanel2.setOpaque(false);
		bgpanel2.add(bglabel2);

		layeredPane.add(bgpanel2, JLayeredPane.DEFAULT_LAYER);

		JLabel userlabel = new JLabel();
		userlabel.setText(username);
		userlabel.setForeground(Color.WHITE);
		userlabel.setHorizontalAlignment(JLabel.CENTER);
		userlabel.setBounds(50, 70, 100, 20);

		bgpanel2.add(userlabel);


		// ****************************Frame Work*********************************//

		setSize(600, 700);
		setTitle("Leading University, Sylhet");
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);

		JPanel hpanel = new JPanel();
		hpanel.setBounds(140, 70, 300, 50);
		hpanel.setBackground(new Color(128, 139, 150, 150));
		layeredPane.add(hpanel, JLayeredPane.DEFAULT_LAYER);

		JLabel hlabel = new JLabel("Main Menu");
		hlabel.setBounds(300, 210, 60, 50);
		hlabel.setFont((new Font("Arial", Font.BOLD, 40)));
		hlabel.setForeground(Color.WHITE);
		hpanel.add(hlabel);

		JPanel inputpanel = new JPanel();
		inputpanel.setBounds(140, 130, 300, 500);
		inputpanel.setLayout(null);
		inputpanel.setBackground(new Color(52, 73, 94, 150));
		layeredPane.add(inputpanel);

		// ****************************Registration Button*********************************//

		regbtn = new JButton("To Do Registration");
		regbtn.setFont(labelFont);
		regbtn.setBounds(70, 70, 150, 50);
		regbtn.setFocusPainted(false);
		inputpanel.add(regbtn);

		// ****************************Food Cycle Button  *********************************//

		foodbtn = new JButton("Food Cycle");
		foodbtn.setFont(labelFont);
		foodbtn.setBounds(70, 140, 150, 50);
		foodbtn.setFocusPainted(false);
		inputpanel.add(foodbtn);

		// **************************** Doctor Info Button *********************************//

		docbtn = new JButton("Doctor Info");
		docbtn.setFont(labelFont);
		docbtn.setBounds(70, 210, 150, 50);
		docbtn.setFocusPainted(false);
		inputpanel.add(docbtn);

		// ****************************Security Panel Button *********************************//

		securitybtn = new JButton("Security Panel");
		securitybtn.setFont(labelFont);
		securitybtn.setBounds(70, 280, 150, 50);
		securitybtn.setFocusPainted(false);
		inputpanel.add(securitybtn);

		// ****************************LOGOUT Button *********************************//

		logoutbtn = new JButton("Logout");
		logoutbtn.setFont(labelFont);
		logoutbtn.setBounds(220, 460, 80, 40);
		logoutbtn.setFocusPainted(false);
		inputpanel.add(logoutbtn);

		// ****************************Mouse Action Listener *********************** 


		regbtn.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				regbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				regbtn.setForeground(Color.GREEN);
			}

			public void mouseExited(MouseEvent e) {
				regbtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				regbtn.setForeground(Color.BLACK);
			}

			public void mousePressed(MouseEvent e) {
				dispose();
				new SeatReg();
			}
		});

		foodbtn.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				foodbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				foodbtn.setForeground(Color.GREEN);
			}

			public void mouseExited(MouseEvent e) {
				foodbtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				foodbtn.setForeground(Color.BLACK);
			}

			public void mousePressed(MouseEvent e) {
				dispose();
				new FoodCycle();
			}
		});

		docbtn.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				docbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				docbtn.setForeground(Color.GREEN);
			}

			public void mouseExited(MouseEvent e) {
				docbtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				docbtn.setForeground(Color.BLACK);
			}

			public void mousePressed(MouseEvent e) {
				dispose();
				new DoctorService();
			}
		});

		securitybtn.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				securitybtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				securitybtn.setForeground(Color.GREEN);
			}

			public void mouseExited(MouseEvent e) {
				securitybtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				securitybtn.setForeground(Color.BLACK);
			}

			public void mousePressed(MouseEvent e) {
				dispose();
				new SecurityPanel();
			}
		});

		logoutbtn.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				logoutbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				logoutbtn.setForeground(Color.RED);
			}

			public void mouseExited(MouseEvent e) {
				logoutbtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				logoutbtn.setForeground(Color.BLACK);
			}

			public void mousePressed(MouseEvent e) {
				dispose();
				new LogIn();
			}
		});

		setVisible(true);

	}
    public static void main(String[] args) {

        new MainMenu();
    }


}
