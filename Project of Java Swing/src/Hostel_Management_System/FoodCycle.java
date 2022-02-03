package Hostel_Management_System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.regex.*;
import java.util.regex.*;

public class FoodCycle extends JFrame {

	JPanel headerpanel, inputpanel;

	FoodCycle() {

// ****************************Adding Image in the Frame*********************************//   



		ImageIcon img = new ImageIcon("src/Hostel_Management_System/food.jpg");
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

		setSize(800, 900);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setLayout(null);

		Font labelFont1 = ((new Font("Arial", Font.BOLD, 13)));

		ImageIcon img2 = new ImageIcon("src/Hostel_Management_System/lulogo.png");
		Image image2 = img2.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		img2 = new ImageIcon(image2);

		JLabel bglabel2 = new JLabel();
		bglabel2.setIcon(img2);
		bglabel2.setBounds(75, 20, 60, 60);

		JPanel bgpanel2 = new JPanel();
		bgpanel2.setLayout(null);
		bgpanel2.setBounds(650, 0, 200, 250);
		bgpanel2.setOpaque(false);
		bgpanel2.add(bglabel2);

		layeredPane.add(bgpanel2, JLayeredPane.DEFAULT_LAYER);

		// setSize(800, 900);
		// setDefaultCloseOperation(3);
		// setLocationRelativeTo(null);
		// setLayout(null);

		Font labelFont = ((new Font("Arial", Font.BOLD, 12)));

		// ********headerpanel*******

		headerpanel = new JPanel();
		headerpanel.setBackground(Color.LIGHT_GRAY);
		headerpanel.setBounds(70, 120, 610, 60);
		layeredPane.add(headerpanel, JLayeredPane.DEFAULT_LAYER);
		// headerpanel.setLayout(null);

		JLabel headerTxt = new JLabel("FOOD CYCLE");
		headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
		headerpanel.add(headerTxt);

		// ******inputPanel*******

		inputpanel = new JPanel();
		inputpanel.setBackground(new Color(77, 95, 86, 170));
		inputpanel.setBounds(70, 210, 610, 400);
		inputpanel.setLayout(null);
		layeredPane.add(inputpanel, JLayeredPane.DEFAULT_LAYER);

		// ********Days*******

		JLabel Days = new JLabel("Days");
		Days.setForeground(Color.WHITE);
		Days.setBounds(40, 20, 120, 60);
		Days.setFont(new Font("Arial", Font.BOLD, 15));
		inputpanel.add(Days);

		JLabel d1 = new JLabel("Saturday       :");
		d1.setForeground(Color.WHITE);
		d1.setBounds(30, 90, 120, 20);
		d1.setFont(labelFont);
		inputpanel.add(d1);

		JLabel d2 = new JLabel("Sunday         :");
		d2.setForeground(Color.WHITE);
		d2.setBounds(30, 130, 120, 20);
		d2.setFont(labelFont);
		inputpanel.add(d2);

		JLabel d3 = new JLabel("Monday         :");
		d3.setForeground(Color.WHITE);
		d3.setBounds(30, 170, 120, 20);
		d3.setFont(labelFont);
		inputpanel.add(d3);

		JLabel d4 = new JLabel("Tuesday        :");
		d4.setForeground(Color.WHITE);
		d4.setBounds(30, 210, 120, 20);
		d4.setFont(labelFont);
		inputpanel.add(d4);

		JLabel d5 = new JLabel("Wednesday   :");
		d5.setForeground(Color.WHITE);
		d5.setBounds(30, 250, 120, 20);
		d5.setFont(labelFont);
		inputpanel.add(d5);

		JLabel d6 = new JLabel("Thursday      :");
		d6.setForeground(Color.WHITE);
		d6.setBounds(30, 290, 120, 20);
		d6.setFont(labelFont);
		inputpanel.add(d6);

		JLabel d7 = new JLabel("Friday           :");
		d7.setForeground(Color.WHITE);
		d7.setBounds(30, 330, 120, 20);
		d7.setFont(labelFont);
		inputpanel.add(d7);

		// *******Food*******

		JLabel breakfast = new JLabel("Breakfast");
		breakfast.setForeground(Color.WHITE);
		breakfast.setBounds(150, 20, 120, 60);
		breakfast.setFont(new Font("Arial", Font.BOLD, 15));
		inputpanel.add(breakfast);

		JLabel lunch = new JLabel("Lunch");
		lunch.setForeground(Color.WHITE);
		lunch.setBounds(330, 20, 120, 60);
		lunch.setFont(new Font("Arial", Font.BOLD, 15));
		inputpanel.add(lunch);

		JLabel dinner = new JLabel("Dinner");
		dinner.setForeground(Color.WHITE);
		dinner.setBounds(510, 20, 120, 60);
		dinner.setFont(new Font("Arial", Font.BOLD, 15));
		inputpanel.add(dinner);

		// ******FoodList*****

		JLabel b1 = new JLabel("(Bread,Omelet)");
		b1.setForeground(Color.WHITE);
		b1.setBounds(130, 70, 120, 60);
		b1.setFont(labelFont);
		inputpanel.add(b1);

		JLabel b2 = new JLabel("(Khichuri,Egg)");
		b2.setForeground(Color.WHITE);
		b2.setBounds(130, 110, 120, 60);
		b2.setFont(labelFont);
		inputpanel.add(b2);

		JLabel b3 = new JLabel("(Paratha,Vegetable)");
		b3.setForeground(Color.WHITE);
		b3.setBounds(130, 150, 120, 60);
		b3.setFont(labelFont);
		inputpanel.add(b3);

		JLabel b4 = new JLabel("(Khichuri,Vegetable)");
		b4.setForeground(Color.WHITE);
		b4.setBounds(130, 190, 120, 60);
		b4.setFont(labelFont);
		inputpanel.add(b4);

		JLabel b5 = new JLabel("(Bread,Omelet)");
		b5.setForeground(Color.WHITE);
		b5.setBounds(130, 230, 120, 60);
		b5.setFont(labelFont);
		inputpanel.add(b5);

		JLabel b6 = new JLabel("(Khichuri,Eggcurry)");
		b6.setForeground(Color.WHITE);
		b6.setBounds(130, 270, 120, 60);
		b6.setFont(labelFont);
		inputpanel.add(b6);

		JLabel b7 = new JLabel("(Paratha,Vegetable)");
		b7.setForeground(Color.WHITE);
		b7.setBounds(130, 310, 120, 60);
		b7.setFont(labelFont);
		inputpanel.add(b7);

		JLabel l1 = new JLabel("(Rice,Fishcurry,Dal)");
		l1.setForeground(Color.WHITE);
		l1.setBounds(300, 70, 120, 60);
		l1.setFont(labelFont);
		inputpanel.add(l1);

		JLabel l2 = new JLabel("(Rice,ChichenCurry)");
		l2.setForeground(Color.WHITE);
		l2.setBounds(300, 110, 120, 60);
		l2.setFont(labelFont);
		inputpanel.add(l2);

		JLabel l3 = new JLabel("(Rice,Vegetable)");
		l3.setForeground(Color.WHITE);
		l3.setBounds(300, 150, 120, 60);
		l3.setFont(labelFont);
		inputpanel.add(l3);

		JLabel l4 = new JLabel("(Rice,ChichenCurry)");
		l4.setForeground(Color.WHITE);
		l4.setBounds(300, 190, 120, 60);
		l4.setFont(labelFont);
		inputpanel.add(l4);

		JLabel l5 = new JLabel("(Rice,Fishcurry)");
		l5.setForeground(Color.WHITE);
		l5.setBounds(300, 230, 120, 60);
		l5.setFont(labelFont);
		inputpanel.add(l5);

		JLabel l6 = new JLabel("(Rice,ChichenCurry)");
		l6.setForeground(Color.WHITE);
		l6.setBounds(300, 270, 120, 60);
		l6.setFont(labelFont);
		inputpanel.add(l6);

		JLabel l7 = new JLabel("(Rice,Eggcurry,Dal)");
		l7.setForeground(Color.WHITE);
		l7.setBounds(300, 310, 120, 60);
		l7.setFont(labelFont);
		inputpanel.add(l7);

		JLabel r1 = new JLabel("(Rice,EggCurry)");
		r1.setForeground(Color.WHITE);
		r1.setBounds(490, 70, 120, 60);
		r1.setFont(labelFont);
		inputpanel.add(r1);

		JLabel r2 = new JLabel("(Rice,FishCurry)");
		r2.setForeground(Color.WHITE);
		r2.setBounds(490, 110, 120, 60);
		r2.setFont(labelFont);
		inputpanel.add(r2);

		JLabel r3 = new JLabel("(Rice,ChickenCurry)");
		r3.setForeground(Color.WHITE);
		r3.setBounds(490, 150, 120, 60);
		r3.setFont(labelFont);
		inputpanel.add(r3);

		JLabel r4 = new JLabel("(Rice,FishCurry)");
		r4.setForeground(Color.WHITE);
		r4.setBounds(490, 190, 120, 60);
		r4.setFont(labelFont);
		inputpanel.add(r4);

		JLabel r5 = new JLabel("(Rice,Curry,Dal)");
		r5.setForeground(Color.WHITE);
		r5.setBounds(490, 230, 120, 60);
		r5.setFont(labelFont);
		inputpanel.add(r5);

		JLabel r6 = new JLabel("(Rice,FishCurry)");
		r6.setForeground(Color.WHITE);
		r6.setBounds(490, 270, 120, 60);
		r6.setFont(labelFont);
		inputpanel.add(r6);

		JLabel r7 = new JLabel("(Khichuri,Chiken)");
		r7.setForeground(Color.WHITE);
		r7.setBounds(490, 310, 120, 60);
		r7.setFont(labelFont);
		inputpanel.add(r7);

		JLabel undTxt = new JLabel("Back to the main page?");
		undTxt.setBounds(250, 350, 200, 70);
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

		setVisible(true);
	}

	


}