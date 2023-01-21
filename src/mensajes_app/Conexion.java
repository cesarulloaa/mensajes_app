package mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	// Metodo para establecer conexion a la base de datos
	public Connection get_connection() {
		// Variable para almacenar la conexion
		Connection connection = null;

		try {
			// Se establece la conexion a la base de datos utilizando el driver de MySQL y
			// la URL, usuario y contraseña especificados
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
		} catch (SQLException e) {
			 // En caso de error, se imprime el mensaje de error en la consola
			// TODO: handle exception
			System.out.println(e);
		}
		return connection;
	}

}
