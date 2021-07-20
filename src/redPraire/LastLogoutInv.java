package redPraire;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LastLogoutInv {
	JFrame fr = new JFrame("RedPraire");
	JLabel title = new JLabel("Information");
	JLabel page = new JLabel("1/1");
	JLabel un = new JLabel("Unknown action");
	JLabel pe = new JLabel("Press ENTER");
	JTextField tf = new JTextField("");
	
	JLabel x = new JLabel("");
	
	public LastLogoutInv() {
		
		fr.setSize(600, 380);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.getContentPane().setBackground(Color.black);
		fr.setVisible(true);
		
		title.setBounds(200, 2, 100, 20);
		title.setForeground(Color.white);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		
		page.setBounds(2, 2, 40, 20);
		page.setForeground(Color.white);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		
		un.setBounds(2, 25, 150, 20);
		un.setForeground(Color.white);
		un.setFont(new Font("Arial", Font.BOLD, 14));
		
		pe.setBounds(2, 200, 100, 20);
		pe.setForeground(Color.white);
		pe.setFont(new Font("Arial", Font.BOLD, 14));
		
		tf.setBounds(120, 200, 10, 20);
		tf.setForeground(Color.white);
		tf.setCaretColor(Color.white);
		tf.setEditable(false);
		
		fr.add(title);
		fr.add(page);
		fr.add(un);
		fr.add(pe);
		fr.add(tf);
		fr.add(x);
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					fr.setVisible(false);
					fr.dispose();
					new LastLogout();
				} else {
					
				}
			}
		});
	}
}
