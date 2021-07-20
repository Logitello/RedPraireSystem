package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiscellaneousMenu {
	
	public MiscellaneousMenu() {
		
JFrame frame = new JFrame("RedPraire");
		
		JLabel page = new JLabel("1/1");
		JLabel title = new JLabel("MiscMenu");
		JLabel l1 = new JLabel("2 Job Details");
		JLabel sel = new JLabel("Selection?");
		
		JTextField tfield = new JTextField("");
		
		
		JLabel x = new JLabel("");
		
		frame.setSize(600,380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
		page.setBounds(2, 2, 40, 20);
		page.setForeground(Color.white);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		
		title.setBounds(200, 2, 140, 20);
		title.setForeground(Color.white);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		
		l1.setBounds(2, 40, 140, 20);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Arial", Font.BOLD, 14));
		
		sel.setBounds(2, 205, 120, 20);
		sel.setForeground(Color.white);
		sel.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfield.setBounds(85, 205, 40, 20);
		tfield.setForeground(Color.white);
		tfield.setCaretColor(Color.white);
		tfield.setBackground(Color.black);
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		
		frame.add(page);
		frame.add(title);
		frame.add(l1);
		frame.add(sel);
		frame.add(tfield);
		
		
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(tfield.getText().equals("2")) {
						frame.setVisible(false);
						frame.dispose();
						new JobDetails();
					} else {
						frame.setVisible(false);
						frame.dispose();
						new MiscellaneousMenuInv();
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
