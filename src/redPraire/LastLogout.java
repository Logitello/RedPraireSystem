package redPraire;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LastLogout {
	JFrame frame = new JFrame("RedPraire");
	JLabel title = new JLabel("LastLogoutPrompt");
	JLabel page = new JLabel("1/1");
	JLabel logout = new JLabel("Is this the last time you will logout of");
	JLabel logout2 = new JLabel("any RDT in your shift Y/N?");
	JTextField tfield = new JTextField("");

	JLabel x = new JLabel("");
	public LastLogout() {
		    
		    
		    frame.setSize(600, 380);
		    frame.setVisible(true);
		    frame.setResizable(false);
		    frame.setLocationRelativeTo(null);
			frame.getContentPane().setBackground(Color.black);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
		    logout.setBounds(2, 40, 450, 20);
			logout.setFont(new Font("Arial", Font.BOLD, 14));
			logout.setForeground(Color.white);
		    
			logout2.setBounds(2, 60, 200, 20);
			logout2.setFont(new Font("Arial", Font.BOLD, 14));
			logout2.setForeground(Color.white);
			
			page.setBounds(2, 2, 30, 20);
			page.setFont(new Font("Arial", Font.BOLD, 14));
			page.setForeground(Color.white);
			
			title.setBounds(200, 2, 100, 20);
			title.setFont(new Font("Arial", Font.BOLD, 14));
			title.setForeground(Color.white);
			
			tfield.setBounds(210, 60, 15, 20);
			tfield.setFont(new Font("Arial", Font.BOLD, 14));
			tfield.setForeground(Color.white);
			tfield.setCaretColor(Color.white);
			tfield.setBackground(Color.black);
			tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		    
		    
		    frame.add(page);
		    frame.add(logout);
			frame.add(logout2);
			frame.add(title);
			frame.add(tfield);
			tfield.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						if(tfield.getText().equalsIgnoreCase("Y")) {
							frame.setVisible(false);
							frame.dispose();
							try {
								new Logout();
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
						} else if(tfield.getText().equalsIgnoreCase("N")) {
							frame.setVisible(false);
							frame.dispose();
							try {
								new Logout();
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						} else {
							frame.setVisible(false);
							frame.dispose();
							new LastLogoutInv();
						}
					}
				}
			});

		    
		    frame.add(x);
	}
}
