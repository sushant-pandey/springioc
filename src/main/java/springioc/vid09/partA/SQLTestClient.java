package springioc.vid09.partA;

import java.sql.SQLException;

public class SQLTestClient {

	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		StudentDAO sDao = new StudentDAO();
		sDao.selectAllRows();
		sDao.deleteCountry("JP");
	}

}
