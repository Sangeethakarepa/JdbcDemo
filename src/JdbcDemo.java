import java.sql.*;
public class JdbcDemo {
public static void main(String []args){
	try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
Statement ps=con.createStatement();
String sql="Instert into StudentDetails values(1,'Sangeetha','Java',4000)";
ps.executeUpdate(sql);
System.out.println("Record inserted Successfully....");
con.close();
	}
	catch(Exception e){
	System.out.println(e);	
	}
}
}
