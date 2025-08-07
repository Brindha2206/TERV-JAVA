package JDBCCONNECTIVITY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class table {

	public static void main(String[] args) throws SQLException  {
		System.out.println("Welcome to MEC Hotel");
//		 create();
//		 insert();
		
		insertrt2();
		 read();
	}
//	public static void create() throws SQLException  {
//		String url = "jdbc:mysql://localhost:3306/college";
//		String username = "root";
//		String password = "22br06un2005dha";
//		String q = "create table Menuuuu(Id int,name varchar(20),review varchar(20));";
//		Connection c = DriverManager.getConnection(url, username, password);
//		Statement s = c.createStatement();
//		s.executeUpdate(q);
//		
//	}
	public static void read() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/COLLEGE";
		String username = "root";
		String password = "22br06un2005dha";
		String q = "select * from Menuuuu;";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(q);//inbuilt function which execute query and as well data
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"- "+ rs.getString(2)+  "- " + rs.getString(3));
		}
	}
	public static void insertrt1() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/COLLEGE";
		String username = "root";
		String password = "22br06un2005dha";
		int n = sc.nextInt();
		
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		for(int i =1;i<=n;i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String review = sc.nextLine();		
			String q = "insert into Menuuuu values("+id+",'"+name+"','"+review+"');";
			s.executeUpdate(q);
			}
		sc.close();
	}
	public static void insertrt2() throws SQLException {
	    Scanner sc = new Scanner(System.in);

	    String url = "jdbc:mysql://localhost:3306/COLLEGE";
	    String username = "root";
	    String password = "22br06un2005dha";
	    String q = "insert into Menuuuu values(?,?,?)";

	    Connection c = DriverManager.getConnection(url, username, password);
	    PreparedStatement ps = c.prepareStatement(q);

	    System.out.print("Enter number of records: ");
	    int n = Integer.parseInt(sc.nextLine());  // ✅ read full line, then parse

	    for (int i = 1; i <= n; i++) {
	        System.out.print("Enter ID: ");
	        int id = Integer.parseInt(sc.nextLine());

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Review: ");
	        String review = sc.nextLine();

	        ps.setInt(1, id);
	        ps.setString(2, name);
	        ps.setString(3, review);
	        ps.executeUpdate();
	    }

	    ps.close();
	    c.close();
	    sc.close();
	}
}
}
