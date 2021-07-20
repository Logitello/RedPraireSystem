package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VehicleReload {
	
	public VehicleReload() {
		
		JFrame frame = new JFrame("RedPraire");
		
		JLabel page = new JLabel("1/1");
		JLabel title = new JLabel("ReLoadEntry");
		JLabel l1 = new JLabel("Pallet");
		JLabel l2 = new JLabel("Tag");
		JLabel l3 = new JLabel("Trailer");
		
		JLabel n1 = new JLabel(":");
		JLabel n2 = new JLabel(":");
		JLabel n3 = new JLabel(":");
		
		JTextField tfield = new JTextField("");
		JTextField tfield2 = new JTextField("");
		JTextField tfield3 = new JTextField("");
		
		JLabel x = new JLabel("");
		
		frame.setSize(600, 380);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
		title.setBounds(200, 2, 180, 20);
		title.setForeground(Color.white);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		
		page.setBounds(2, 2, 40, 20);
		page.setForeground(Color.white);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		
		l1.setBounds(2, 22, 100, 20);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Arial", Font.BOLD, 14));
		
		l2.setBounds(2, 42, 100, 20);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Arial", Font.BOLD, 14));
		
		l3.setBounds(2, 62, 100, 20);
		l3.setForeground(Color.white);
		l3.setFont(new Font("Arial", Font.BOLD, 14));
		
		n1.setBounds(110, 22, 10, 20);
		n1.setForeground(Color.white);
		n1.setFont(new Font("Arial", Font.BOLD, 14));
		
		n2.setBounds(110, 42, 10, 20);
		n2.setForeground(Color.white);
		n2.setFont(new Font("Arial", Font.BOLD, 14));
		
		n3.setBounds(110, 62, 10, 20);
		n3.setForeground(Color.white);
		n3.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfield.setBounds(120, 22, 180, 20);
		tfield.setForeground(Color.white);
		tfield.setFont(new Font("Arial", Font.BOLD, 14));
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield.setBackground(Color.black);
		tfield.setCaretColor(Color.white);
		
		tfield2.setBounds(120, 42, 180, 20);
		tfield2.setForeground(Color.white);
		tfield2.setFont(new Font("Arial", Font.BOLD, 14));
		tfield2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield2.setBackground(Color.black);
		tfield2.setCaretColor(Color.white);
		
		tfield3.setBounds(120, 62, 180, 20);
		tfield3.setForeground(Color.white);
		tfield3.setFont(new Font("Arial", Font.BOLD, 14));
		tfield3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield3.setBackground(Color.black);
		tfield3.setCaretColor(Color.white);
		
		frame.add(title);
		frame.add(page);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(n1);
		frame.add(n2);
		frame.add(n3);
		frame.add(tfield);
		frame.add(tfield2);
		frame.add(tfield3);
		
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					// Code for text field
					
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new VehicleLoadMenu();
				}
			}
		});
		
		tfield2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					// Code for text field
					
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new VehicleLoadMenu();
				}
			}
		});
		
		tfield3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					// Code for text field
					
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new VehicleLoadMenu();
				}
			}
		});
		
		
		
		frame.add(x);
		
	}

}
