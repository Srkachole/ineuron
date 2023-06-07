package ineuron.JDBCAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		
		Connection connection =null;
		PreparedStatement psmt = null;
		ResultSet resultSet = null;
		Scanner sc = new Scanner(System.in);
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Drivers Loaded Successfully");
			
			String url = "jdbc:mysql://localhost:3306/class";
			String userName = "root";
			String password = "password";
			
			connection = DriverManager.getConnection(url,userName,password);
			
			String SelectQuery = "Select * from teacher";
			if (connection != null) {
				psmt = connection.prepareStatement(SelectQuery) ;
				resultSet = psmt.executeQuery();
			}
			
			System.out.println("id\tname");
			while(resultSet.next()) {
				Integer id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				System.out.println(id +"\t"+name);
			}	
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		finally{
			if(connection!=null) {
				try {
					resultSet.close();
					psmt.close();
					connection.close();
				}
				catch (SQLException se) {
					se.printStackTrace();
				}
				sc.close();
				}
			}
		}
	}