package springioc.vid09.partG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CountryDAO {

	private String driver;
	private String url;
	private String userName;
	private String password;

	private Connection con;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	@PostConstruct
	private void init() 
			throws ClassNotFoundException, SQLException {
		System.out.println("Creating the DB Connection");
		Class.forName(driver);
		con = DriverManager.getConnection(url, userName, password);
	}

	public void selectAllRows() 
			throws ClassNotFoundException, SQLException {
		System.out.println("select all rows method called");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from countries_test");
		while (rs.next()) {
			String country_id = rs.getString(1);
			String country_name = rs.getString(2);
			int region_id = rs.getInt(3);
			System.out.println(country_id + "::" + country_name + "::" + region_id);
		}
	}

	public void deleteCountry(String country_id) 
			throws ClassNotFoundException, SQLException {
		System.out.println("Deleting db row method called");
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement stmt = con.createStatement();
		int rs = stmt.executeUpdate("delete from countries_test where country_id = '" + country_id + "'");
		System.out.println(rs);

		if (rs == 1) {
			System.out.println("Record successfully deleted for country_id " + country_id);
		}
	}

	/*
	 * THis method is called when the application context is closed
	 * 
	 */
//	@PreDestroy
	private void destroy() 
			throws SQLException {
		System.out.println("Destroy Method called");
		con.close();
	}

}
