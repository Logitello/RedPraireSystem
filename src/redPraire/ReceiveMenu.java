package redPraire;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class ReceiveMenu {
	
	public ReceiveMenu() {
		
		JFrame frame = new JFrame("RedPraire");
		
		JLabel page = new JLabel("1/1");
		JLabel title = new JLabel("ReceiveMenu");
		JLabel rm1 = new JLabel("1 Blind Receive");
		JLabel rm2 = new JLabel("2 Pre-Adv Receive");
		JLabel rm3 = new JLabel("4 UPI Receive");
		JLabel rmsel = new JLabel("Selection?");
		
		JTextField tfield = new JTextField("");
		JLabel x = new JLabel("");
		
		
		frame.setSize(600, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.black);
		
		page.setBounds(2, 2, 40, 20);
		page.setForeground(Color.white);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		
		title.setBounds(200, 2, 100, 20);
		title.setForeground(Color.white);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		
		rm1.setBounds(2, 40, 140, 20);
		rm1.setForeground(Color.white);
		rm1.setFont(new Font("Arial", Font.BOLD, 14));
		
		rm2.setBounds(150, 40, 140, 20);
		rm2.setForeground(Color.white);
		rm2.setFont(new Font("Arial", Font.BOLD, 14));
		
		rm3.setBounds(2, 58, 140, 20);
		rm3.setForeground(Color.white);
		rm3.setFont(new Font("Arial", Font.BOLD, 14));
		
		rmsel.setBounds(2, 205, 120, 20);
		rmsel.setForeground(Color.white);
		rmsel.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfield.setBounds(85, 205, 40, 20);
		tfield.setForeground(Color.white);
		tfield.setCaretColor(Color.white);
		tfield.setBackground(Color.black);
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		
		
		frame.add(page);
		frame.add(title);
		frame.add(rm1);
		frame.add(rm2);
		frame.add(rm3);
		frame.add(rmsel);
		frame.add(tfield);
		
		
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(tfield.getText().equals("1")) {
						frame.setVisible(false);
						frame.dispose();
						new BlindReceiveMenu();
					} else if(tfield.getText().equals("2")) {
						frame.setVisible(false);
						frame.dispose();
						new PreAdvReceive();
					} else if(tfield.getText().equals("4")) {
						frame.setVisible(false);
						frame.dispose();
						new UPIReceive();
					} else {
						frame.setVisible(false);
						frame.dispose();
						new recMenuNoSel();
					}
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new UserDirected();
				} 
			}
		});

		
		frame.add(x);
	}

}

































