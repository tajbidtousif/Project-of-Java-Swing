
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

public class DoctorService extends JFrame {

	JPanel headerpanel, inputpanel;

	public DoctorService() {

		// ****************************Adding Image in the Frame*********************************//

		ImageIcon img = new ImageIcon("src/Hostel_Management_System/doc.jpg");
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

		Font labelFont = ((new Font("Arial", Font.BOLD, 13)));

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

		// ******************************headerpanel***************************

		headerpanel = new JPanel();
		headerpanel.setBackground(Color.LIGHT_GRAY);
		headerpanel.setBounds(160, 180, 490, 60);
		layeredPane.add(headerpanel, JLayeredPane.DEFAULT_LAYER);

		JLabel headerTxt = new JLabel("Doctor Service");
		headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
		headerpanel.add(headerTxt);

		// ******************************inputPanel***********************

		inputpanel = new JPanel();
		inputpanel.setBackground(new Color(77, 95, 86, 170));
		inputpanel.setBounds(160, 250, 490, 350);
		inputpanel.setLayout(null);
		layeredPane.add(inputpanel, JLayeredPane.DEFAULT_LAYER);

		// **********DoctorInfo*********
		JLabel d1 = new JLabel("Dr.Bipul Chandra Ghosh");
		d1.setForeground(Color.WHITE);
		d1.setBounds(20, 20, 160, 40);
		d1.setFont(labelFont);
		inputpanel.add(d1);

		JLabel t1 = new JLabel("Time    : 1PM - 4PM");
		t1.setForeground(Color.WHITE);
		t1.setBounds(20, 40, 140, 40);
		t1.setFont(labelFont);
		inputpanel.add(t1);

		JLabel pos = new JLabel("Medicine specialist");
		pos.setForeground(Color.WHITE);
		pos.setBounds(20, 60, 140, 40);
		pos.setFont(labelFont);
		inputpanel.add(pos);

		JLabel mobi1 = new JLabel(" Mobile.No :0171***");
		mobi1.setForeground(Color.WHITE);
		mobi1.setBounds(20, 80, 160, 40);
		mobi1.setFont(labelFont);
		inputpanel.add(mobi1);

		JLabel d2 = new JLabel("Dr.Nur Zahan");
		d2.setForeground(Color.WHITE);
		d2.setBounds(20, 150, 160, 40);
		d2.setFont(labelFont);
		inputpanel.add(d2);

		JLabel t = new JLabel("Time    : 4PM - 7PM");
		t.setForeground(Color.WHITE);
		t.setBounds(20, 170, 140, 40);
		t.setFont(labelFont);
		inputpanel.add(t);

		JLabel pos1 = new JLabel("Medicine specialist");
		pos1.setForeground(Color.WHITE);
		pos1.setBounds(20, 190, 140, 40);
		pos1.setFont(labelFont);
		inputpanel.add(pos1);

		JLabel mobi = new JLabel(" Mobile.No :0171***");
		mobi.setForeground(Color.WHITE);
		mobi.setBounds(20, 210, 160, 40);
		mobi.setFont(labelFont);
		inputpanel.add(mobi);

		JLabel undTxt = new JLabel("Back to the main page?");
		undTxt.setBounds(165, 280, 200, 70);
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