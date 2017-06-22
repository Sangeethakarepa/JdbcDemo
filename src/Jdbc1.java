
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc1 {
public static void main(String[] args){
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		Statement stmt=con.createStatement();
		String sql=("Insert into sangi values(1,'sangi','java',2000)");
		stmt.executeUpdate(sql);
		System.out.println("Record Inserted Successfully....");
		con.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
