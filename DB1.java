package LibraryMangement;

import java.sql.*;

public class DB1 {
	 public Connection conn = null;
 public Statement s = null;
	public static void main(String[] args) {
		Connection conn = null;
		Statement s = null;
		try{
			conn =DriverManager.getConnection("jdbc:mysql:///LBTESTSAMPLE","root","test123");
               s = conn.createStatement();
//               String sql="create database LBTest7";
//               s.executeUpdate(sql);
//               System.out.println("Database");
               //String sql1= "Create Table Testtable(name VARCHAR(255))"; 
               //s.executeUpdate(sql1);
               	   System.out.println("Created table in given database..."); 
      
        }catch(Exception e){ 
            System.out.println(e);
        }
		
	}
	}
