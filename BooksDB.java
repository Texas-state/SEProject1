//package LibraryMangement;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//public class BooksDB {
//	
//public static int save(String name,String author,String publisher,int quantity){
//	int status=0;
//	try{
//		Connection con=DB1.getConnection();
//		PreparedStatement ps=con.prepareStatement("insert into book(name,author,publisher,quantity)");
//		//ps.setString(1,callno);
//		ps.setString(1,name);
//		ps.setString(2,author);
//		ps.setString(3,publisher);
//		ps.setInt(4,quantity);
//		status=ps.executeUpdate();
//		con.close();
//	}catch(Exception e){System.out.println(e);}
//	return status;
//}
//}
