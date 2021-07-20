package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExistingRelocate {
	
	public ExistingRelocate() {
		
		JFrame frame = new JFrame("RedPraire");
		
		JLabel page = new JLabel("1/1");
		JLabel title = new JLabel("RelocateEntry");
		JLabel l1 = new JLabel("Work Zone");
		JLabel l2 = new JLabel("Location");
		JLabel l3 = new JLabel("SKU");
		JLabel l4 = new JLabel("Tag");
		JLabel l5 = new JLabel("List");
		
		JLabel n1 = new JLabel(":");
		JLabel n2 = new JLabel(":");
		JLabel n3 = new JLabel(":");
		JLabel n4 = new JLabel(":");
		JLabel n5 = new JLabel(":");
		
		JTextField tfield = new JTextField("");
		JTextField tfield2 = new JTextField("");
		JTextField tfield3 = new JTextField("");
		JTextField tfield4 = new JTextField("");
		JTextField tfield5 = new JTextField("");
		
		JLabel x = new JLabel("");
		
		frame.setSize(600, 380);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
		title.setBounds(200, 2, 120, 20);
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
		
		l4.setBounds(2, 82, 100, 20);
		l4.setForeground(Color.white);
		l4.setFont(new Font("Arial", Font.BOLD, 14));
		
		l5.setBounds(2, 102, 100, 20);
		l5.setForeground(Color.white);
		l5.setFont(new Font("Arial", Font.BOLD, 14));
		
		n1.setBounds(90, 22, 10, 20);
		n1.setForeground(Color.white);
		n1.setFont(new Font("Arial", Font.BOLD, 14));
		
		n2.setBounds(90, 42, 10, 20);
		n2.setForeground(Color.white);
		n2.setFont(new Font("Arial", Font.BOLD, 14));
		
		n3.setBounds(90, 62, 10, 20);
		n3.setForeground(Color.white);
		n3.setFont(new Font("Arial", Font.BOLD, 14));
		
		n4.setBounds(90, 82, 10, 20);
		n4.setForeground(Color.white);
		n4.setFont(new Font("Arial", Font.BOLD, 14));
		
		n5.setBounds(90, 102, 10, 20);
		n5.setForeground(Color.white);
		n5.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfield.setBounds(100, 22, 100, 20);
		tfield.setForeground(Color.white);
		tfield.setFont(new Font("Arial", Font.BOLD, 14));
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield.setBackground(Color.black);
		tfield.setCaretColor(Color.white);
		
		tfield2.setBounds(100, 42, 100, 20);
		tfield2.setForeground(Color.white);
		tfield2.setFont(new Font("Arial", Font.BOLD, 14));
		tfield2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield2.setBackground(Color.black);
		tfield2.setCaretColor(Color.white);
		
		tfield3.setBounds(100, 62, 130, 20);
		tfield3.setForeground(Color.white);
		tfield3.setFont(new Font("Arial", Font.BOLD, 14));
		tfield3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield3.setBackground(Color.black);
		tfield3.setCaretColor(Color.white);
		
		tfield4.setBounds(100, 82, 180, 20);
		tfield4.setForeground(Color.white);
		tfield4.setFont(new Font("Arial", Font.BOLD, 14));
		tfield4.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield4.setBackground(Color.black);
		tfield4.setCaretColor(Color.white);
		
		tfield5.setBounds(100, 102, 180, 20);
		tfield5.setForeground(Color.white);
		tfield5.setFont(new Font("Arial", Font.BOLD, 14));
		tfield5.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield5.setBackground(Color.black);
		tfield5.setCaretColor(Color.white);
		
		frame.add(title);
		frame.add(page);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(n1);
		frame.add(n2);
		frame.add(n3);
		frame.add(n4);
		frame.add(n5);
		frame.add(tfield);
		frame.add(tfield2);
		frame.add(tfield3);
		frame.add(tfield4);
		frame.add(tfield5);
		
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					// Code for text field
					
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new RelocateMenu();
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
					new RelocateMenu();
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
					new RelocateMenu();
				}
			}
		});
		
		tfield4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					// Code for text field
					
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new RelocateMenu();
				}
			}
		});
		
		tfield5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					// Code for text field
					
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new RelocateMenu();
				}
			}
		});
		
		
		
		frame.add(x);
		
	}

}
