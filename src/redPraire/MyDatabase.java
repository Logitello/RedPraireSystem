package redPraire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabase {
	
public static void main(String[] args) {
        

		String url = "jdbc:mysql://localhost:3306/redpraire";
		String username = "root";
		String password = "Artur162534";

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		    Statement stmt = connection.createStatement();
		    try {
		    	ResultSet rs = stmt.executeQuery("SELECT * FROM product");
		    	
		    	while(rs.next()) {
		    		int id = rs.getInt("id");
		    		String str1 = rs.getString("SKU");
		    		String str2 = rs.getString("Qty");
		    		String str3 = rs.getString("Tag");
		    		String str4 = rs.getString("Description");
		    		String str5 = rs.getString("Location");
		    		//System.out.println("No.	SKU	");
		    		System.out.format("%-4s	%-8s %-10s %-10s %-25s %s\n", id, str1, str2, str3, str4, str5);
		    	}
		    	
		    	rs.next();
		    	
		    } finally {
		    	stmt.close();
		    }
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
		
		System.out.println("Loading driver...");

		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
		    throw new IllegalStateException("Cannot find the driver in the classpath!", e);
		}
		
		
		
	}

}
