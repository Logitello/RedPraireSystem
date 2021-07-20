package redPraire;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainMenu {
	public MainMenu() {
		JFrame mmenu = new JFrame("RedPraire");
		JLabel title = new JLabel("MainMenu");
		JLabel page = new JLabel("1/1");
		JLabel mm1 = new JLabel("1 System Directed");
		JLabel mm2 = new JLabel("2 User Directed");
		JLabel mm3 = new JLabel("3 Logout");
		JLabel sitemm = new JLabel("W114");
		JLabel selmm = new JLabel("Selection?");
		JTextField tfield = new JTextField("");
		

		JLabel x = new JLabel("");



		// F10 is working as BACK button
		

		mmenu.setSize(600, 380);
		mmenu.setVisible(true);
		mmenu.setResizable(false);
		mmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mmenu.setLocationRelativeTo(null);
		mmenu.getContentPane().setBackground(Color.black);

		title.setBounds(200, 2, 100, 20);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		title.setForeground(Color.white);
		
		page.setBounds(2, 2, 40, 20);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		page.setForeground(Color.white);
		
		selmm.setBounds(2, 205, 120, 20);
		selmm.setFont(new Font("Arial", Font.BOLD, 14));
		selmm.setForeground(Color.white);
		
		mm1.setBounds(2, 55, 160, 20);
		mm1.setFont(new Font("Arial", Font.BOLD, 14));
		mm1.setForeground(Color.white);
		
		mm2.setBounds(2, 75, 160, 20);
		mm2.setFont(new Font("Arial", Font.BOLD, 14));
		mm2.setForeground(Color.white);
		
		mm3.setBounds(2, 95, 160, 20);
		mm3.setFont(new Font("Arial", Font.BOLD, 14));
		mm3.setForeground(Color.white);

		sitemm.setBounds(2, 35, 120, 20);
		sitemm.setFont(new Font("Arial", Font.BOLD, 14));
		sitemm.setForeground(Color.white);
		
		tfield.setBounds(85, 205, 20, 20);
		tfield.setForeground(Color.white);
		tfield.setCaretColor(Color.white);
		tfield.setBackground(Color.black);
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		
		mmenu.add(page);
		mmenu.add(title);
		mmenu.add(sitemm);
		mmenu.add(selmm);
		mmenu.add(mm1);
		mmenu.add(mm2);
		mmenu.add(mm3);
		mmenu.add(tfield);
		mmenu.add(x);
		
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(tfield.getText().equals("1")) {
						mmenu.setVisible(false);
						mmenu.dispose();
						new SystemDirected();
					} else if(tfield.getText().equals("2")) {
						mmenu.setVisible(false);
						mmenu.dispose();
						new UserDirected();
					} else if(tfield.getText().equals("3")) {
						mmenu.setVisible(false);
						mmenu.dispose();
						new LastLogout();
						
					} else if(tfield.getText().equals("")) {
						mmenu.setVisible(false);
						mmenu.dispose();
						new mmenuNoSel();
					}	else {
						mmenu.setVisible(false);
						mmenu.dispose();
						new mmenuInv();
					}
				} else if(e.getKeyCode() == 114) {
					mmenu.setVisible(false);
					mmenu.dispose();
					new QueryMenu();
				}
			}
		});
		
	}

}
