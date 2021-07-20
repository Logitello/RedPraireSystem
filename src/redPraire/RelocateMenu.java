package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RelocateMenu {
	
	public RelocateMenu() {
		
		JFrame frame = new JFrame("RedPraire");
		
		JLabel page = new JLabel("1/1");
		JLabel title = new JLabel("RelocateMenu");
		JLabel l1 = new JLabel("1 ExistingRelocate");
		JLabel l2 = new JLabel("2 New Relocate");
		JLabel l3 = new JLabel("3 Zero Demand");
		JLabel sel = new JLabel("Selection?");
		
		JTextField tfield = new JTextField("");
		
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
		
		l1.setBounds(2, 40, 150, 20);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Arial", Font.BOLD, 14));
		
		l2.setBounds(180, 40, 150, 20);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Arial", Font.BOLD, 14));
		
		l3.setBounds(2, 60, 150, 20);
		l3.setForeground(Color.white);
		l3.setFont(new Font("Arial", Font.BOLD, 14));
		
		sel.setBounds(2, 200, 80, 20);
		sel.setForeground(Color.white);
		sel.setFont(new Font("Arial", Font.BOLD, 14));
		
		tfield.setBounds(80, 200, 40, 20);
		tfield.setForeground(Color.white);
		tfield.setFont(new Font("Arial", Font.BOLD, 14));
		tfield.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
		tfield.setBackground(Color.black);
		tfield.setCaretColor(Color.white);
		
		frame.add(title);
		frame.add(page);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(sel);
		frame.add(tfield);
		
		tfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(tfield.getText().equals("1")) {
						frame.setVisible(false);
						frame.dispose();
						new ExistingRelocate();
					} else if(tfield.getText().equals("2")) {
						frame.setVisible(false);
						frame.dispose();
						new NewRelocate();
					} else if(tfield.getText().equals("3")) {
						frame.setVisible(false);
						frame.dispose();
						new ZeroDemand();
					}  else {
						frame.setVisible(false);
						frame.dispose();
						new RelocateMenuInv();
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
