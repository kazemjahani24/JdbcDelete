package phonerepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import dbutil.Dbutil;

public class Phonerepository {

	
	public static void phone() {

try {
			Connection con = Dbutil.getConnection();
			
			Statement stmt = con.createStatement();

			
			String query = "delete from phone WHERE id=2";			
			PreparedStatement preparedStmt = con.prepareStatement(query);
		
		    preparedStmt.executeUpdate(query);
}
catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		
	}
}
	
		
