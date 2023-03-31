package singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class Singleton {
	private static Connection conn = null;
	
	// contructor
	
	private Singleton() {
		String URL = "jdbc:mysql://localhost:3306/ayudantia";
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String USER = "root";
		String PASS = "Notiene1";
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASS);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConexion() {
		if(conn == null) {
			new Singleton();
			System.out.println("se genero la conexion"); 
		} System.out.println("Retorno de conexion");  // debug de conexion 		
		return conn;
	}
}
