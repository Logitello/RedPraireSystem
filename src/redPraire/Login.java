package redPraire;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login {
	public Login() {
		JFrame login = new JFrame("RedPraire");
		
		JLabel acc = new JLabel("Username:"); 
		JLabel pass = new JLabel("Password:");
		JLabel page = new JLabel("1/1");
		JLabel site = new JLabel("Thorne");
		JLabel info = new JLabel("RPPRODWMS (PL0236)");
		JLabel title = new JLabel("Login");
		JLabel createdby = new JLabel("(c) JDA 1995-2018");
		JLabel x = new JLabel("");
		JTextField acc1 = new JTextField("") ;
		JTextField pass1 = new JTextField("");
		
		
		login.setSize(600, 380);
		login.setVisible(true);
		login.setResizable(false);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setLocationRelativeTo(null);
		login.getContentPane().setBackground(Color.black);
		
		title.setBounds(200, 2, 40, 20);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		title.setForeground(Color.white);
		
		page.setBounds(2, 2, 40, 20);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		page.setForeground(Color.white);

		info.setBounds(2, 30, 160, 20);
		info.setFont(new Font("Arial", Font.BOLD, 14));
		info.setForeground(Color.white);
		
		site.setBounds(2, 50, 120, 20);
		site.setFont(new Font("Arial", Font.BOLD, 14));
		site.setForeground(Color.white);
		
		acc.setBounds(2, 70, 160, 20);
		acc.setFont(new Font("Arial", Font.BOLD, 14));
		acc.setForeground(Color.white);
		
		pass.setBounds(2, 90, 160, 20);
		pass.setFont(new Font("Arial", Font.BOLD, 14));
		pass.setForeground(Color.white);
		
		createdby.setBounds(2, 220, 160, 20);
		createdby.setFont(new Font("Arial", Font.BOLD, 14));
		createdby.setForeground(Color.white);
		
		login.add(title);
		login.add(page);
		login.add(site);
		login.add(info);
		login.add(acc);
		login.add(pass);
		login.add(createdby);
		login.add(acc1);
		login.add(pass1);
		login.add(x);
		
		acc1.setBounds(82, 70, 160, 20);
		acc1.setBackground(Color.black);
		acc1.setForeground(Color.white);
		acc1.setCaretColor(Color.white);
		acc1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		acc1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(acc1.getText().equals("jud") && (pass1.getText().equals("sze"))) {
						login.setVisible(false);
						login.dispose();

						new StartLocationInput();
						
						
					} else {
						login.setVisible(false);
						login.dispose();
						new FailedLogin();
						
					}
				}
			}
		});
		
		pass1.setBounds(82, 90, 160, 20);
		pass1.setCaretColor(Color.white);
		pass1.setBackground(Color.black);
		pass1.setForeground(Color.white);
		pass1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));;
		pass1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(acc1.getText().equals("jud") && (pass1.getText().equals("sze"))) {
						login.setVisible(false);
						login.dispose();
						new StartLocationInput();
						
					} else {
						login.setVisible(false);
						login.dispose();
						new FailedLogin();
						
					}
				}
			}
		});
		
		
		
		
		
	
	}
	
}
