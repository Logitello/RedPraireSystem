package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PickingInv {
	
public PickingInv() {
		
		JFrame failed = new JFrame("RedPraire");
		JLabel title = new JLabel("Information");
		JLabel page = new JLabel("1/1");
		JLabel flogin = new JLabel("Menu selection required");
		JLabel presse = new JLabel("Press ENTER");
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

		flogin.setBounds(2, 30, 240, 20);
		flogin.setFont(new Font("Arial", Font.BOLD, 14));
		flogin.setForeground(Color.white);
		
		presse.setBounds(2, 200, 100, 20);
		presse.setFont(new Font("Arial", Font.BOLD, 14));
		presse.setForeground(Color.white);
		
		tfield.setBounds(120, 200, 10, 20);
		tfield.setForeground(Color.white);
		tfield.setCaretColor(Color.white);
		tfield.setEditable(false);
		
		
		
		failed.add(flogin);
		failed.add(page);
		failed.add(title);
		failed.add(tfield);
		failed.add(presse);
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					failed.setVisible(false);
					failed.dispose();
					new Picking();
				}
			}
		});
		failed.add(x);
		
	}

}
