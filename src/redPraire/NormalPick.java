package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NormalPick {
	
	public NormalPick() {
		
		JFrame frame = new JFrame("RedPraire");
		
		JLabel page = new JLabel("1/1");
		JLabel title = new JLabel("PickEntry");
		JLabel l1 = new JLabel("Work Zone    :");
		JLabel l2 = new JLabel("List                :");
		JLabel l3 = new JLabel("Ship Dock     :");
		JLabel l4 = new JLabel("SKU               :");
		
		JTextField tfield = new JTextField("");
		JTextField tfield2 = new JTextField("");
		JTextField tfield3 = new JTextField("");
		JTextField tfield4 = new JTextField("");
		
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
		
		tfield.setBounds(100, 22, 100, 20);
		tfield.setForeground(Color.white);
		tfield.setFont(new Font("Arial", Font.BOLD, 14));
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield.setBackground(Color.black);
		tfield.setCaretColor(Color.white);
		
		tfield2.setBounds(100, 42, 180, 20);
		tfield2.setForeground(Color.white);
		tfield2.setFont(new Font("Arial", Font.BOLD, 14));
		tfield2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield2.setBackground(Color.black);
		tfield2.setCaretColor(Color.white);
		
		tfield3.setBounds(100, 62, 100, 20);
		tfield3.setForeground(Color.white);
		tfield3.setFont(new Font("Arial", Font.BOLD, 14));
		tfield3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield3.setBackground(Color.black);
		tfield3.setCaretColor(Color.white);
		
		tfield4.setBounds(100, 82, 100, 20);
		tfield4.setForeground(Color.white);
		tfield4.setFont(new Font("Arial", Font.BOLD, 14));
		tfield4.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield4.setBackground(Color.black);
		tfield4.setCaretColor(Color.white);
		
		frame.add(title);
		frame.add(page);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(tfield);
		frame.add(tfield2);
		frame.add(tfield3);
		frame.add(tfield4);
		
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					
					// Code for text field
					
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new Picking();
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
					new Picking();
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
					new Picking();
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
					new Picking();
				}
			}
		});
		
		
		
		frame.add(x);
		
	}

}
