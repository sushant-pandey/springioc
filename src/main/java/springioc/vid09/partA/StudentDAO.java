package springioc.vid09.partA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521/ORCLCDB.localdomain";
	private String userName = "HR";
	private String password = "HR";
	
	public void selectAllRows() 
			throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from countries_test");
		while(rs.next()) {			
			String country_id = rs.getString(1);
			String country_name = rs.getString(2);
			int region_id = rs.getInt(3);
			System.out.println(country_id + "::" + country_name + "::" + region_id);
		}
		
		con.close();
	}
	
	public void deleteCountry(String country_id) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement stmt = con.createStatement();
		int rs = stmt.executeUpdate("delete from countries_test where country_id = '"+country_id + "'");
		System.out.println(rs);
		
		if(rs == 1) {
			System.out.println("Record successfully deleted for country_id " + country_id);
		}
		
		con.close();
	}

}
