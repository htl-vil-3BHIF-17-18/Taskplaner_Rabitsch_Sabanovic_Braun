package dal;
import java.sql.*;
import java.util.ArrayList;

import bll.Task; 

public class DatabaseHelper {
	Connection con = null;
    Statement stmt_Select = null; 
    ResultSet rs = null;



public void createConnection() throws SQLException {
	/* Step 1  Registrieren des Treibers*/
    try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    /* Step 2 */
    try {
		con = DriverManager.getConnection("jdbc:oracle:thin:d3b16/d3b@192.168.128.152:1521:ora11g");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void closeConnection() throws SQLException {
	if(this.con != null) {
		con.close();
	}
}

public ArrayList<Task> aufgabenLaden() throws SQLException{
	ArrayList<Task> tasks = new ArrayList<Task>();
	ResultSet rs = null;
	Statement stmt_Select = this.con.createStatement();

    rs = stmt_Select.executeQuery("SELECT * FROM Aufgabe");
    
    while(rs.next()) {
       /* Step 5*/
    	System.out.print(rs.getInt(1) + "\t");
        System.out.println(rs.getString(2));
        System.out.println(rs.getString(3));
        System.out.println(rs.getDate(4));
        System.out.println(rs.getString(5));
    }
	return tasks;
}

}