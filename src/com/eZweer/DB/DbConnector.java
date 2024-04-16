package com.eZweer.DB;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.jdbc.Driver;

public class DbConnector {
	// Default setting of Database
    private String url = "jdbc:mysql://localhost:3306";
    private String user = "root";
    private String pw = "";
    private Connection con;
    
    public DbConnector(){

    }
    // Create Database whit variable Connection settings
    public DbConnector(String url, String user, String pw){
        this.url = url;
        this.user = user;
        this.pw = pw;
    }
    // enter table to url after create table
    public void setUrl(String url) {
    	this.url = url;
    }
    // try to connect with Database
    public  void connect() throws SQLException {

        Driver driver = new  Driver();
        DriverManager.deregisterDriver(driver);
        con = DriverManager.getConnection(url, user, pw);
        System.out.println("Connection Succsesfuly");
       
       
    // try to close Database
    }
    public  void closeConnection() throws SQLException, NullPointerException {

        con.close();
        System.out.println("Connection Closed");
       
      
    }
    // create new Database
    public void createDatabase() {
    	String createDatabase = "Create Database Customer";
    	try{
	    	connect();
	    	java.sql.Statement statement = con.createStatement();
	    	statement.execute(createDatabase);
	    	statement.close();
    	}catch(SQLException e) {
    		System.out.println(e.getMessage());
    	}catch(NullPointerException e) {
    		System.out.println(e.getMessage());
    	}
    	setUrl(url+"/Customer");
    	
    }
    
    // create Database from SQL File
    public void createDatabaseFromFIle() {
    	StringBuilder sb = new StringBuilder();
    	Scanner sc = null;
    	// try to read the File
    	try {
            File file = new File("Source/Pizza.sql");
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
               System.err.println("File not Found");
            }
    	// if file is found safe each line in sb
    	if (sc !=null) {
	    	while (sc.hasNextLine()) {
	    		sb.append(sc.nextLine());
	    	}
	    	// fill String array with each sql command in sb
	    	String[] createDatabase = sb.toString().split(";");	
		    	try{
			    	connect();
			    	java.sql.Statement statement = con.createStatement();
			    	for (int i = 0; i< createDatabase.length;i++)
			    		{statement.execute(createDatabase[i]);}
			    	statement.close();
		    	}catch(SQLException e) {
		    		System.out.println(e.getMessage());
		    	}catch(NullPointerException ex) {
		    		System.out.println(ex.getMessage());
		    	}catch (IllegalArgumentException iae) {
		    		System.out.println(iae.getMessage());
		    	}
	    	
    	}
    }
    	    
}
