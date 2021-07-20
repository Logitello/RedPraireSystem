package redPraire;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserDirected {
	public UserDirected() {
		JFrame frame = new JFrame("RedPraire");
		JLabel page = new JLabel("1/1");
		JLabel title = new JLabel("UserMenu");
		JLabel m1 = new JLabel("1  Receive");
		JLabel m2 = new JLabel("2  Putaway");
		JLabel m3 = new JLabel("3  Picking");
		JLabel m4 = new JLabel("4  Relocate");
		JLabel m5 = new JLabel("5  Inventory");
		JLabel m6 = new JLabel("6  Marshall");
		JLabel m7 = new JLabel("7  Vehicle Load");
		JLabel m8 = new JLabel("8  Miscellaneous");
		JLabel msel = new JLabel("Selection?");
		
		
		JTextField tfield = new JTextField("");
		JLabel x = new JLabel("");
		
		frame.setSize(600, 380);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		
		page.setBounds(2, 2, 40, 20);
		page.setForeground(Color.white);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		
		title.setBounds(200, 2, 100, 20);
		title.setForeground(Color.white);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		
		m1.setBounds(2, 40, 140, 20);
		m1.setForeground(Color.white);
		m1.setFont(new Font("Arial", Font.BOLD, 14));
		
		m2.setBounds(150, 40, 140, 20);
		m2.setForeground(Color.white);
		m2.setFont(new Font("Arial", Font.BOLD, 14));
		
		m3.setBounds(2, 58, 140, 20);
		m3.setForeground(Color.white);
		m3.setFont(new Font("Arial", Font.BOLD, 14));
		
		m4.setBounds(150, 58, 140, 20);
		m4.setForeground(Color.white);
		m4.setFont(new Font("Arial", Font.BOLD, 14));
		
		m5.setBounds(2, 76, 140, 20);
		m5.setForeground(Color.white);
		m5.setFont(new Font("Arial", Font.BOLD, 14));
		
		m6.setBounds(150, 76, 140, 20);
		m6.setForeground(Color.white);
		m6.setFont(new Font("Arial", Font.BOLD, 14));
		
		m7.setBounds(2, 94, 140, 20);
		m7.setForeground(Color.white);
		m7.setFont(new Font("Arial", Font.BOLD, 14));
		
		m8.setBounds(150, 94, 140, 20);
		m8.setForeground(Color.white);
		m8.setFont(new Font("Arial", Font.BOLD, 14));
		
		msel.setBounds(2, 205, 120, 20);
		msel.setForeground(Color.white);
		msel.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfield.setBounds(85, 205, 40, 20);
		tfield.setForeground(Color.white);
		tfield.setCaretColor(Color.white);
		tfield.setBackground(Color.black);
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		
		frame.add(page);
		frame.add(title);
		frame.add(m1);
		frame.add(m2);
		frame.add(m3);
		frame.add(m4);
		frame.add(m5);
		frame.add(m6);
		frame.add(m7);
		frame.add(m8);
		frame.add(msel);
		frame.add(tfield);
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(tfield.getText().equals("1")) {
						frame.setVisible(false);
						frame.dispose();
						new ReceiveMenu();
					} else if(tfield.getText().equals("2")) {
						frame.setVisible(false);
						frame.dispose();
						new PutawayMenu();
					} else if(tfield.getText().equals("3")) {
						frame.setVisible(false);
						frame.dispose();
						//new PickingMenu();
					} else if(tfield.getText().equals("4")) {
						frame.setVisible(false);
						frame.dispose();
						new RelocateMenu();
					} else if(tfield.getText().equals("5")) {
						frame.setVisible(false);
						frame.dispose();
						new InventoryMenu();
					} else if(tfield.getText().equals("6")) {
						frame.setVisible(false);
						frame.dispose();
						new MarshallMenu();
					} else if(tfield.getText().equals("7")) {
						frame.setVisible(false);
						frame.dispose();
						new VehicleLoadMenu();
					} else if(tfield.getText().equals("8")) {
						frame.setVisible(false);
						frame.dispose();
						new MiscellaneousMenu();
					} else {
						frame.setVisible(false);
						frame.dispose();
						new mmenuNoSel2();
					}
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new MainMenu();
				} 
			}
			});
		
		
		frame.add(x);
		
	}
}
