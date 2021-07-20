package redPraire;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BlindReceiveMenu {
	
	public BlindReceiveMenu() {
		
		JFrame frame = new JFrame("RedPraire");
		
		JLabel l1 = new JLabel("1/1");
		JLabel l2 = new JLabel("BasReceiveMenu");
		JLabel l3 = new JLabel("2 Pre-Adv Receive");
		JLabel l4 = new JLabel("Selection?");
		
		JTextField tfield = new JTextField("");
		
		
		JLabel x = new JLabel("");
		
		frame.setSize(600,380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
		l1.setBounds(2, 2, 40, 20);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Arial", Font.BOLD, 14));
		
		l2.setBounds(200, 2, 140, 20);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Arial", Font.BOLD, 14));
		
		l3.setBounds(2, 40, 140, 20);
		l3.setForeground(Color.white);
		l3.setFont(new Font("Arial", Font.BOLD, 14));
		
		l4.setBounds(2, 205, 120, 20);
		l4.setForeground(Color.white);
		l4.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfield.setBounds(85, 205, 40, 20);
		tfield.setForeground(Color.white);
		tfield.setCaretColor(Color.white);
		tfield.setBackground(Color.black);
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(tfield);
		
		
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(tfield.getText().equals("2")) {
						frame.setVisible(false);
						frame.dispose();
						new ReceivePreAdviceEntry();
					} else {
						frame.setVisible(false);
						frame.dispose();
						new BlindReceiveInv();
					}
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new ReceiveMenu();
				}
			}
		});
		
		
		
		frame.add(x);
		
	}

}
