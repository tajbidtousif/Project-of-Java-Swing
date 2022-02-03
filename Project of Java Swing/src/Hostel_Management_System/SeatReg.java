


package Hostel_Management_System;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.util.regex.*;
import javax.swing.JOptionPane;
import java.util.regex.*;

public class SeatReg extends JFrame {

	JPanel headerpanel, inputpanel;
	JFrame f2;

	public SeatReg() {

		// ****************************Adding Image in the Frame*********************************//

		ImageIcon img = new ImageIcon("src/Hostel_Management_System/logooo.jpg");
		Image image = img.getImage();
		image = image.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
		img = new ImageIcon(image);
		JLabel bglabel = new JLabel(img);
		bglabel.setBounds(0, 0, 800, 800);
		JPanel bgpanel = new JPanel();
		bgpanel.setBounds(0, 0, 800, 800);
		bgpanel.add(bglabel);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 800, 800);
		layeredPane.add(bgpanel, JLayeredPane.FRAME_CONTENT_LAYER);
		add(layeredPane);

		f2 = this;
		setSize(800, 800);
		setTitle("Leading University Hostel Management System");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
		setResizable(false);

		Font labelFont = ((new Font("Arial", Font.BOLD, 16)));

		headerpanel = new JPanel();
		// headerpanel.setLayout(null);
		headerpanel.setBackground(Color.LIGHT_GRAY);
		headerpanel.setBounds(160, 140, 490, 60);
		layeredPane.add(headerpanel, JLayeredPane.DEFAULT_LAYER);

		JLabel headerTxt = new JLabel("Hostel Seat Registration Form");
		headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
		headerpanel.add(headerTxt);

		inputpanel = new JPanel();
		inputpanel.setBackground(new Color(77, 95, 86, 170));
		inputpanel.setBounds(160, 210, 490, 425);
		inputpanel.setLayout(null);
		layeredPane.add(inputpanel, JLayeredPane.DEFAULT_LAYER);

		JLabel stdid = new JLabel("Student ID :");
		stdid.setForeground(Color.WHITE);
		stdid.setBounds(60, 40, 100, 25);
		stdid.setFont(labelFont);
		inputpanel.add(stdid);

		JTextField stdidTxt = new JTextField();
		stdidTxt.setFont(labelFont);
		stdidTxt.setBounds(165, 40, 200, 25);
		stdidTxt.setFont(labelFont);
		inputpanel.add(stdidTxt);

		

		JLabel sec = new JLabel("Section   :");
		sec.setForeground(Color.WHITE);
		sec.setBounds(70, 80, 100, 25);
		sec.setFont(labelFont);
		inputpanel.add(sec);

		JTextField secTxt = new JTextField();
		secTxt.setFont(labelFont);
		secTxt.setBounds(165, 80, 200, 25);
		secTxt.setFont(labelFont);
		inputpanel.add(secTxt);

		JLabel batch = new JLabel("Batch    :");
		batch.setForeground(Color.WHITE);
		batch.setBounds(75, 120, 100, 25);
		batch.setFont(labelFont);
		inputpanel.add(batch);

		JTextField batchTxt = new JTextField();
		batchTxt.setFont(labelFont);
		batchTxt.setBounds(165, 120, 200, 25);
		batchTxt.setFont(labelFont);
		inputpanel.add(batchTxt);

		JLabel mobile = new JLabel("Mobile No  :");
		mobile.setForeground(Color.WHITE);
		mobile.setBounds(55, 160, 100, 25);
		mobile.setFont(labelFont);
		inputpanel.add(mobile);

		JTextField mobileTxt = new JTextField();
		mobileTxt.setFont(labelFont);
		mobileTxt.setBounds(165, 160, 200, 25);
		mobileTxt.setFont(labelFont);
		inputpanel.add(mobileTxt);

		JLabel address = new JLabel("Address  :");
		address.setForeground(Color.WHITE);
		address.setBounds(65, 200, 100, 25);
		address.setFont(labelFont);
		inputpanel.add(address);

		JTextField addressTxt = new JTextField();
		addressTxt.setFont(labelFont);
		addressTxt.setBounds(165, 200, 200, 25);
		addressTxt.setFont(labelFont);
		inputpanel.add(addressTxt);

		JRadioButton rb1 = new JRadioButton("Male");
		rb1.setBounds(65, 250, 100, 30);
		JRadioButton rb2 = new JRadioButton("Female");
		rb2.setBounds(170, 250, 100, 30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		inputpanel.add(rb1);
		inputpanel.add(rb2);

		JButton sub = new JButton("Submit");
		sub.setForeground(Color.BLACK);
		sub.setBounds(210, 340, 90, 30);
		inputpanel.add(sub);

		JLabel undTxt = new JLabel("Back to the main page?");
		undTxt.setBounds(180, 380, 200, 70);
		undTxt.setForeground(Color.WHITE);
		undTxt.setFont(labelFont);
		inputpanel.add(undTxt);

		undTxt.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				undTxt.setCursor(new Cursor(Cursor.HAND_CURSOR));
				undTxt.setForeground(Color.GREEN);
			}

			public void mouseExited(MouseEvent e) {
				undTxt.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				undTxt.setForeground(Color.WHITE);
			}

			public void mousePressed(MouseEvent e) {
				dispose();
				new MainMenu();
			}
		});

		// ****************************MouseListener at UnderText Field*********************************//

		sub.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent e) {
				sub.setCursor(new Cursor(Cursor.HAND_CURSOR));
				sub.setForeground(Color.GREEN);
			}

			public void mouseExited(MouseEvent e) {
				sub.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				sub.setForeground(Color.BLACK);
			}

			public void mousePressed(MouseEvent e) {
				String id = stdidTxt.getText();
				String section = secTxt.getText(); 
				String batch = batchTxt.getText();
				String mobile = mobileTxt.getText();
				String address = addressTxt.getText();

				// *********************** Validation **************************

				String regexstdid = "^[0-9]+$";
				String regexsection = "^[A-Za-z]+$";
				String regexbatch = "^[0-9A-za-z]+$";
				String regexMobile = "(\\+88)?-?01[3-9]\\d{8}";

				if (!Pattern.matches(regexstdid, id)) {
					JOptionPane.showMessageDialog(null, "In-Valid id! Try Again");
				}

				else if (!Pattern.matches(regexsection, section)) {
					JOptionPane.showMessageDialog(null, "In-Valid Section! Try Again");

				}

				else if (!Pattern.matches(regexbatch, batch)) {
					JOptionPane.showMessageDialog(null, "In-Valid Batch! Try Again");

				}

				else if (!Pattern.matches(regexMobile, mobile)) {
					JOptionPane.showMessageDialog(null, "In-Valid Mobile Number! Try Again");
				}

				else if (address.equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill up the Address Field");
				} 
				else {

					SeatDbConnection seatdb = new SeatDbConnection(f2);

					String seatqueryInsert = "INSERT INTO `seatlist`(`id`, `section`, `batch`, `mobile`, `address`) VALUES ('"
							+ id + "','" + section + "','" + batch + "','" + mobile + "','" + address + "')";
							

					seatdb.SeatRegisterInsert(seatqueryInsert);
				}

			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new SeatReg();
	}

}
