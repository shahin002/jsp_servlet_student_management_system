/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Class;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rashu
 */
public class Database_Connection {
    
    public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@Rashed:49160:xe", "system", "12345");
	}catch(Exception ex){System.out.println(ex);}
	return con;
}
    
}
