package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StartLocationInput {
	
	public StartLocationInput() {
		
		JFrame frame = new JFrame("RedPraire");
		
		JLabel page = new JLabel("1/1");
		JLabel title = new JLabel("XYZStartLocationInput");
		JLabel l1 = new JLabel("Enter name of nearest location:");
		JLabel l2 = new JLabel("Location         :");
		JLabel pe = new JLabel("Press ENTER");
		
		JTextField tfield = new JTextField("");
		
		JLabel x = new JLabel("");
		
		frame.setSize(600, 380);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
		page.setBounds(2, 2, 40, 20);
		page.setForeground(Color.white);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		
		title.setBounds(200, 2, 200, 20);
		title.setForeground(Color.white);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		
		l1.setBounds(2, 40, 400, 20);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Arial", Font.BOLD, 14));
		
		l2.setBounds(2, 80, 110, 20);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Arial", Font.BOLD, 14));
		
		pe.setBounds(2, 200, 100, 20);
		pe.setForeground(Color.white);
		pe.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfield.setBounds(110, 80, 150, 20);
		tfield.setForeground(Color.white);
		tfield.setCaretColor(Color.white);
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield.setBackground(Color.black);
		tfield.setFont(new Font("Arial", Font.BOLD, 14));
		
		
		frame.add(page);
		frame.add(title);
		frame.add(l1);
		frame.add(l2);
		frame.add(pe);
		frame.add(tfield);
		
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(tfield.getText().equals("rec1p") || tfield.getText().equals("rec1u")) {
						frame.setVisible(false);
						frame.dispose();
						new MainMenu();
					} else {
						frame.setVisible(false);
						frame.dispose();
						new StartLocationInputInv();
					}
				}else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new Login();
				}
			}
		});
		
		
		frame.add(x);
		
	}

}
