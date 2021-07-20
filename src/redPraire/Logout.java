package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Logout {
	JFrame frame = new JFrame("RedPraire");
	JLabel title = new JLabel("Logout");
	JLabel page = new JLabel("1/1");
	JLabel logout = new JLabel("Logout:");
	JLabel clock = new JLabel();

	JLabel x = new JLabel("");
	public Logout() throws InterruptedException {
		    
		    
		    frame.setSize(600, 380);
		    frame.setVisible(true);
		    frame.setResizable(false);
		    frame.setLocationRelativeTo(null);
			frame.getContentPane().setBackground(Color.black);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			clock.setBounds(2, 80, 250, 20);
			clock.setFont(new Font("Arial", Font.BOLD, 14));
			clock.setForeground(Color.white);
		    
		    logout.setBounds(2, 40, 250, 20);
			logout.setFont(new Font("Arial", Font.BOLD, 14));
			logout.setForeground(Color.white);
			
			page.setBounds(2, 2, 30, 20);
			page.setFont(new Font("Arial", Font.BOLD, 14));
			page.setForeground(Color.white);
			
			title.setBounds(200, 2, 100, 20);
			title.setFont(new Font("Arial", Font.BOLD, 14));
			title.setForeground(Color.white);

		    
		    
		    frame.add(page);
		    frame.add(logout);
			frame.add(clock);
			frame.add(title);

		    clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
		    
		    frame.add(x);
		    
		    timeShow();
		    
		    

	}
		public void timeShow() {

		    Timer timer = new Timer(3000, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					frame.setVisible(false);
				    frame.dispose();
				    new Login();
					
				}
		    	
		    });
		    timer.setRepeats(false);
		    timer.start();
			
		}
		
	}