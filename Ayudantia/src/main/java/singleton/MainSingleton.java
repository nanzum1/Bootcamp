package singleton;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class MainSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1. Obtener Conexion
			Connection conn = Singleton.getConexion();
			System.out.println(conn);
			
			//2. Crear objeto Statement
			Statement st =  conn.createStatement();
			
			//3. Ejecutar QUERY
			String sql = "SELECT * from persona";
			ResultSet rs = st.executeQuery(sql); // ResultSet para traer cosas del SELECT
			
			//4. Leer el resultado del ResultSet Registro Registro
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			
			//5. Cerrar objeto de conexion
			
			conn.close();
					
					
					
	} catch(Exception e) {
		System.out.println(e);
	}
}
}