package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PutawayEntry {
	
	public PutawayEntry() {
		
JFrame frame = new JFrame("RedPraire");
		
		JLabel page = new JLabel("1/1");
		JLabel title = new JLabel("PutawayEntry");
		JLabel l1 = new JLabel("Tag            :");
		JLabel l2 = new JLabel("Pallet         :");
		
		JTextField tfield = new JTextField("");
		JTextField tfield2 = new JTextField("");
		
		JLabel x = new JLabel("");
		
		frame.setSize(600, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
		page.setBounds(2, 2, 40, 20);
		page.setForeground(Color.white);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		
		l1.setBounds(2, 40, 80, 20);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Arial", Font.BOLD, 14));
		
		l2.setBounds(2, 60, 80, 20);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfield.setBounds(85, 40, 150, 20);
		tfield.setForeground(Color.white);
		tfield.setFont(new Font("Arial", Font.BOLD, 14));
		tfield.setBackground(Color.black);
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield.setCaretColor(Color.white);
		
		tfield2.setBounds(85, 60, 150, 20);
		tfield2.setForeground(Color.white);
		tfield2.setFont(new Font("Arial", Font.BOLD, 14));
		tfield2.setBackground(Color.black);
		tfield2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield2.setCaretColor(Color.white);
		
		title.setBounds(200, 2, 150, 20);
		title.setForeground(Color.white);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		
		frame.add(page);
		frame.add(l1);
		frame.add(title);
		frame.add(l2);
		frame.add(tfield);
		frame.add(tfield2);
		
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new PutawayMenu();
				}
			}
		});
		
		tfield2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new PutawayMenu();
				}
			}
		});
		
		
		frame.add(x);
		
	}

}
