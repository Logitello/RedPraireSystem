package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReplenishPick {
	
	public ReplenishPick() {
		
JFrame frame = new JFrame("RedPraire");
		
		JLabel page = new JLabel("1/1");
		JLabel title = new JLabel("Information");
		JLabel l1 = new JLabel("Access has been denied");
		JLabel pe = new JLabel("Press ENTER");
		
		JLabel x = new JLabel("");
		
		frame.setSize(600, 380);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		page.setBounds(2, 2, 40, 20);
		page.setForeground(Color.white);
		page.setFont(new Font("Arial", Font.BOLD, 14));
		
		title.setBounds(200, 2, 100, 20);
		title.setForeground(Color.white);
		title.setFont(new Font("Arial", Font.BOLD, 14));
		
		l1.setBounds(2, 40, 200, 20);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Arial", Font.BOLD, 14));
		
		pe.setBounds(2, 200, 100, 20);
		pe.setForeground(Color.white);
		pe.setFont(new Font("Arial", Font.BOLD, 14));
		
		frame.add(page);
		frame.add(title);
		frame.add(l1);
		frame.add(pe);
		
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					frame.setVisible(false);
					frame.dispose();
					new Picking();
				} else if(e.getKeyCode() == 121) {
					frame.setVisible(false);
					frame.dispose();
					new Picking();
				}
			}
		});
		
		
		frame.add(x);
		
	}

}
