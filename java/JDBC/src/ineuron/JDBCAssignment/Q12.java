package ineuron.JDBCAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Drivers Loaded Successfully");
		String dbURL = "jdbc:mysql://localhost:3306/class";
		String username = "root";
		String password = "password";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet resultSet = null;
		
		try {
		 
		    conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected");
		    }
		   
		    System.out.println("Please Select the Opertion to Perform\n1 : Insert"
		    		+ "\n2 : View\n3 : Update\n4 : Delete");
		    int opt = sc.nextInt();
		    if(opt==1) {
		    	 // Insert Query
			    String insertQuery = "Insert into teacher (id, name) VALUES (?, ?)";
			    psmt = conn.prepareStatement(insertQuery);
			  
			    System.out.println("Select id...");
				int id = sc.nextInt();
				System.out.println("select name...");
				String name = sc.next();
				
				psmt.setInt(1,id);
				psmt.setString(2, name);
				
				int rs = psmt.executeUpdate();
				System.out.println("Row Affected = " + rs);
				
		    }
		    
		    if(opt==2) {
		    	//Select Query
				String SelectQuery = "Select * from teacher";
				if (conn != null) {
					psmt = conn.prepareStatement(SelectQuery) ;
					resultSet = psmt.executeQuery(SelectQuery);
				}
				
				System.out.println("id\tname");
				while(resultSet.next()) {
					Integer id1 = resultSet.getInt(1);
					String name1 = resultSet.getString(2);
					System.out.println(id1 +"\t"+name1);
				}
		    }
		    
		    if(opt==3) {

				
				//Update Query
				String updateQuery = "update teacher set name = ? where id = ?";
				 
				psmt = conn.prepareStatement(updateQuery);
				
				System.out.println("Update the name");
				String nameUpdate = sc.next();
				psmt.setString(1, nameUpdate);
				System.out.println("Select the ID to update : ");
				int idUpdate = sc.nextInt();
				psmt.setInt(2, idUpdate);
				
				int rowsUpdated = psmt.executeUpdate();
				if (rowsUpdated > 0) {
				    System.out.println("An existing id updated successfully!");
				}
		    }
		    
		    if(opt==4) {
	
				
				String deleteQuery = "Delete From teacher Where id =?";
				 
				psmt = conn.prepareStatement(deleteQuery);
				
				System.out.println("Select the ID to Delete : ");
				int idDelete = sc.nextInt();
				psmt.setInt(1, idDelete);
				 
				int rowsDeleted = psmt.executeUpdate();
				if (rowsDeleted > 0) {
				    System.out.println("A user was deleted successfully!");
				}
		    }
		} 
		catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}
