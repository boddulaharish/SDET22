package com.crm.vlion.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;



/**
 * This class contains generic methods to read data from Database
 * @author HARISH
 * 
 */
public class DataBaseUtility {

	Connection con = null;
	ResultSet result = null;
	Driver driverRef;
 /**
  * Connection with database is established
  * @throws Throwable
  * 
  */
	public void connectToDB() throws SQLException {
		DriverManager.registerDriver(driverRef);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet", "root", "root");
	}
	/**
	 * This method Returns the data wrt to column index
	 * @param query
	 * @param Columnindex
	 * @return 
	 * @throws Throwable 
	 * 
	 */
	public String getDataFromDB(String query, int Columnindex) throws Throwable {
		String value = null;
		result = con.createStatement().executeQuery(query);
		while(result.next()) {
			value=result.getString(Columnindex);
		}
		return value;	
	}
	
	/**
	 * get data from DB and verify
	 * @param query
	 * @param columnName
	 * @param expData
	 * @return
	 * @throws SQLException
	 */
	public String getDataFromDB(String query, int columnName, String expData) throws SQLException {
		boolean flag = false;
		result=con.createStatement().executeQuery(query);
		while(result.getString(columnName).equalsIgnoreCase(expData)) {
			if(result.next()) {
				flag=true;
				break;
			}
			
		}
		if(flag) {
			System.out.println(expData+"data verified in database");
			
		}
		return expData;
		
		
	}
		
	
}
