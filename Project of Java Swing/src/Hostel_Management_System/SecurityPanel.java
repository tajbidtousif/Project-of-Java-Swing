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

public class SecurityPanel extends JFrame {

	JPanel headerpanel, inputpanel;

	public SecurityPanel() {

		// ****************************Adding Image in the
		// Frame*********************************//

		ImageIcon img = new ImageIcon("src/Hostel_Management_System/secu.jpg");
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

		setSize(800, 900);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setLayout(null);

		Font labelFont = ((new Font("Arial", Font.BOLD, 13)));

		// ********header Panel*******

		headerpanel = new JPanel();
		headerpanel.setBackground(Color.LIGHT_GRAY);
		headerpanel.setBounds(160, 180, 490, 60);
		layeredPane.add(headerpanel, JLayeredPane.DEFAULT_LAYER);

		JLabel headerTxt = new JLabel("SecurityPanel");
		headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
		headerpanel.add(headerTxt);

		// ******inputPanel*******

		inputpanel = new JPanel();
		inputpanel.setBackground(new Color(77, 95, 86, 170));
		inputpanel.setBounds(160, 250, 490, 350);
		inputpanel.setLayout(null);
		layeredPane.add(inputpanel, JLayeredPane.DEFAULT_LAYER);

		// ********Guards*******

		JLabel hs = new JLabel("Hostel Security");
		hs.setForeground(Color.WHITE);
		hs.setBounds(170, 2, 220, 80);
		hs.setFont(new Font("Arial", Font.BOLD, 20));
		inputpanel.add(hs);

		JLabel s1 = new JLabel("Boy's Department:");
		s1.setForeground(Color.WHITE);
		s1.setBounds(45, 60, 200, 40);
		s1.setFont(new Font("Arial", Font.BOLD, 18));

		inputpanel.add(s1);

		JLabel n1 = new JLabel("Name        :Shah Tajbid");
		n1.setForeground(Color.WHITE);
		n1.setBounds(45, 100, 220, 20);
		n1.setFont(labelFont);
		inputpanel.add(n1);

		JLabel pos = new JLabel("Position   :Senior Security Guard");
		pos.setForeground(Color.WHITE);
		pos.setBounds(45, 120, 220, 20);
		pos.setFont(labelFont);
		inputpanel.add(pos);

		JLabel mob = new JLabel("Mob.No    :01784313631");
		mob.setForeground(Color.WHITE);
		mob.setBounds(45, 140, 120, 20);
		mob.setFont(labelFont);
		inputpanel.add(mob);

		JLabel s2 = new JLabel("Girl's Department:");
		s2.setForeground(Color.WHITE);
		s2.setBounds(45, 180, 200, 40);
		s2.setFont(new Font("Arial", Font.BOLD, 18));
		inputpanel.add(s2);

		JLabel n2 = new JLabel("Name        :Suchona Ghosh");
		n2.setForeground(Color.WHITE);
		n2.setBounds(45, 220, 220, 20);
		n2.setFont(labelFont);
		inputpanel.add(n2);

		JLabel posn = new JLabel("Position   :Senior Security Guard");
		posn.setForeground(Color.WHITE);
		posn.setBounds(45, 240, 220, 20);
		posn.setFont(labelFont);
		inputpanel.add(posn);

		JLabel mobi = new JLabel("Mob.No    :01710888488");
		mobi.setForeground(Color.WHITE);
		mobi.setBounds(45, 260, 120, 20);
		mobi.setFont(labelFont);
		inputpanel.add(mobi);

		JLabel undTxt = new JLabel("Back to the main page?");
		undTxt.setBounds(180, 280, 200, 70);
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