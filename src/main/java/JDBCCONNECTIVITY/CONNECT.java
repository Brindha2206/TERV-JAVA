package JDBCCONNECTIVITY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CONNECT {

	public static void main(String[] args) throws SQLException  {
		 create();
		 read();
		 insert();
	}
	public static void create() throws SQLException  {
		String url = "jdbc:mysql://localhost:3306/COLLEGE";
		String username = "root";
		String password = "22br06un2005dha";
		String q = "create table aids(rno int,mark int);";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		s.executeUpdate(q);
		
	}
	public static void read() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/COLLEGE";
		String username = "root";
		String password = "22br06un2005dha";
		String q = "select * from aids;";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(q);//inbuilt function which execute query and as well data
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"- "+ rs.getInt(2));
		}
	}
	public static void insert() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/COLLEGE";
		String username = "root";
		String password = "22br06un2005dha";
		String q = "insert into aids values(63,95);";
		Connection c = DriverManager.getConnection(url, username, password);
		Statement s = c.createStatement();
		s.executeUpdate(q);
		
	}
}
