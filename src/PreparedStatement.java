import java.sql.*;

public class PreparedStatement {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			java.sql.PreparedStatement ps=con.prepareStatement("Insert into sangi values(?,?,?,?)");
			ps.setInt(1, 102);
			ps.setString(2, "Sangeetha");
			ps.setString(3, "DT");
			ps.setInt(4, 5000);
			ps.execute();
			ps.close();
			System.out.println("Record Inserted Succcessfully....");
			con.close();
			
		}

		catch(Exception e){
			System.out.println(e);
		}
	}

}
