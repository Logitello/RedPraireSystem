package redPraire;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class rec1u {
	public static void main(String[] args) {
	//public rec1u() {
		
		JFrame frame = new JFrame("RedPraire");
		JTextField tfield = new JTextField("");

		JLabel count = new JLabel("");
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/redpraire", "root", "Artur162534")) {
		    System.out.println("Database connected!");
		    Statement stmt = connection.createStatement();
		
		String s1 = null;
		String s2 = null;
		String s4 = null;
		String s8 = null;
		
		
		
		int i = 0;
		final AtomicInteger j = new AtomicInteger(0);
		
		
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM product WHERE Location = 'REC1U'");
			while(rs.next()) {
				i++;
	    	}
	    	rs.next();
	    	tfield.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						j.incrementAndGet();
						
					} 
				}
				
				});
		} finally {
			stmt.close();
		}
		
		
		
		JLabel page = new JLabel("1/2");
		JLabel title = new JLabel("QueryInventoryCompletion");
		JLabel l1 = new JLabel("SKU");
		JLabel l2 = new JLabel("Qty");
		JLabel l3 = new JLabel("Cont");
		JLabel l4 = new JLabel("Tag");
		JLabel l5 = new JLabel("Pall");
		JLabel l6 = new JLabel("Locn");
		JLabel l7 = new JLabel("Zone");
		JLabel l8 = new JLabel("Desc");
		JLabel l9 = new JLabel("QC");
		JLabel l10 = new JLabel("Lock");
		JLabel l11 = new JLabel(":");
		JLabel l12 = new JLabel(":");
		JLabel l13 = new JLabel(":");
		JLabel l14 = new JLabel(":");
		JLabel l15 = new JLabel(":");
		JLabel l16 = new JLabel(":");
		JLabel l17 = new JLabel(":");
		JLabel l18 = new JLabel(":");
		JLabel l19 = new JLabel(":");
		JLabel l20 = new JLabel(":");
		JLabel l21 = new JLabel(s1);
		JLabel l22 = new JLabel(s2);
		JLabel l24 = new JLabel(s4);
		JLabel l26 = new JLabel("REC1U");
		JLabel l28 = new JLabel(s8);
		JLabel count2 = new JLabel("of");
		JLabel count3 = new JLabel("");
		
		JLabel x = new JLabel("");
		
		
		frame.setSize(600, 380);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		
		
		
		String k = String.valueOf(i);
		count3.setText(k);
		String l = String.valueOf(j);

		count.setText(l);
		
		page.setBounds(2, 2, 20, 20);
		page.setForeground(Color.white);
		page.setFont(new Font("Arial",  Font.BOLD, 14));
		
		title.setBounds(200, 2, 230, 20);
		title.setForeground(Color.white);
		title.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l1.setBounds(2, 22, 40, 20);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l2.setBounds(2, 42, 40, 20);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l3.setBounds(2, 62, 40, 20);
		l3.setForeground(Color.white);
		l3.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l4.setBounds(2, 82, 40, 20);
		l4.setForeground(Color.white);
		l4.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l5.setBounds(2, 102, 40, 20);
		l5.setForeground(Color.white);
		l5.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l6.setBounds(2, 122, 40, 20);
		l6.setForeground(Color.white);
		l6.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l7.setBounds(2, 142, 40, 20);
		l7.setForeground(Color.white);
		l7.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l8.setBounds(2, 162, 40, 20);
		l8.setForeground(Color.white);
		l8.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l9.setBounds(2, 182, 40, 20);
		l9.setForeground(Color.white);
		l9.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l10.setBounds(2, 202, 40, 20);
		l10.setForeground(Color.white);
		l10.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l11.setBounds(40, 22, 5, 20);
		l11.setForeground(Color.white);
		l11.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l12.setBounds(40, 42, 5, 20);
		l12.setForeground(Color.white);
		l12.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l13.setBounds(40, 62, 5, 20);
		l13.setForeground(Color.white);
		l13.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l14.setBounds(40, 82, 5, 20);
		l14.setForeground(Color.white);
		l14.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l15.setBounds(40, 102, 5, 20);
		l15.setForeground(Color.white);
		l15.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l16.setBounds(40, 122, 5, 20);
		l16.setForeground(Color.white);
		l16.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l17.setBounds(40, 142, 5, 20);
		l17.setForeground(Color.white);
		l17.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l18.setBounds(40, 162, 5, 20);
		l18.setForeground(Color.white);
		l18.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l19.setBounds(40, 182, 5, 20);
		l19.setForeground(Color.white);
		l19.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l20.setBounds(40, 202, 5, 20);
		l20.setForeground(Color.white);
		l20.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l21.setBounds(50, 22, 200, 20);
		l21.setForeground(Color.white);
		l21.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l22.setBounds(50, 22, 200, 20);
		l22.setForeground(Color.white);
		l22.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l24.setBounds(50, 22, 200, 20);
		l24.setForeground(Color.white);
		l24.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l26.setBounds(50, 22, 200, 20);
		l26.setForeground(Color.white);
		l26.setFont(new Font("Arial",  Font.BOLD, 14));
		
		l28.setBounds(50, 22, 200, 20);
		l28.setForeground(Color.white);
		l28.setFont(new Font("Arial",  Font.BOLD, 14));
		
		count.setBounds(2, 222, 30, 20);
		count.setForeground(Color.white);
		count.setFont(new Font("Arial",  Font.BOLD, 14));
		
		count2.setBounds(35, 222, 20, 20);
		count2.setForeground(Color.white);
		count2.setFont(new Font("Arial",  Font.BOLD, 14));
		
		count3.setBounds(60, 222, 30, 20);
		count3.setForeground(Color.white);
		count3.setFont(new Font("Arial",  Font.BOLD, 14));
		
		
		tfield.setBounds(90, 222, 10, 20);
		tfield.setForeground(Color.white);
		tfield.setBackground(Color.white);
		tfield.setEditable(false);
		
		frame.add(page);
		frame.add(title);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
		frame.add(l9);
		frame.add(l10);
		frame.add(l11);
		frame.add(l12);
		frame.add(l13);
		frame.add(l14);
		frame.add(l15);
		frame.add(l16);
		frame.add(l17);
		frame.add(l18);
		frame.add(l19);
		frame.add(l20);
		frame.add(l21);
		frame.add(l22);
		frame.add(l24);
		frame.add(l26);
		frame.add(l28);
		frame.add(count);
//		frame.add();
		

		frame.add(x);
		
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
		
		
	//}
	
	}
}
