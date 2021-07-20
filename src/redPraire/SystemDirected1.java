package redPraire;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SystemDirected1 {
	public SystemDirected1() {
		JFrame failed = new JFrame("RedPraire");
		JLabel title = new JLabel("Information");
		JLabel page = new JLabel("1/1");
		JLabel flogin1 = new JLabel("No system directed activities found");
		JTextField tfield = new JTextField("");

		JLabel x = new JLabel("");
		

		
		failed.setSize(600, 380);
		failed.setVisible(true);
		failed.setLocationRelativeTo(null);
		failed.setResizable(false);
		failed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		failed.getContentPane().setBackground(Color.black);
		
		

		title.setBounds(200, 2, 150, 20);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		title.setForeground(Color.white);

		page.setBounds(2, 2, 40, 20);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		page.setForeground(Color.white);
		
		tfield.setBounds(120, 200, 0, 0);
		tfield.setForeground(Color.black);
		tfield.setCaretColor(Color.black);
		tfield.setEditable(false);
		
		flogin1.setBounds(2, 30, 350, 20);
		flogin1.setFont(new Font("Arial", Font.BOLD, 14));
		flogin1.setForeground(Color.white);
		
		
		failed.add(page);
		failed.add(title);
		failed.add(tfield);
		failed.add(flogin1);
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					failed.setVisible(false);
					failed.dispose();
					new MainMenu();
					
					
				}
			}
		});
		failed.add(x);

	}
}