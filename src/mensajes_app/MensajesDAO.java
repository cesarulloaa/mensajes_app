package mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
	/*
	 * Este metodo se utiliza para insertar un nuevo mensaje en la base de datos.
	 * Recibe como parametro un objeto de tipo Mensajes y lo utiliza para establecer
	 * los valores de los campos del nuevo mensaje en la base de datos.
	 * 
	 */
	public static void crearMensajesDB(Mensajes mensaje) {
		// Se crea un objeto de la clase Conexion para obtener una conexion a la base de
		// datos
		Conexion db_connect = new Conexion();

		try (Connection conexion = db_connect.get_connection()) {
			// Se crea un objeto de tipo PreparedStatement para ejecutar la consulta SQL
			PreparedStatement ps = null;

			try {
				// Se establece la consulta SQL para insertar un nuevo registro en la tabla
				// mensajes
				String query = "INSERT INTO mensajes (`mensaje`, `autor_mensaje`) VALUES (?, ?)";
				ps = conexion.prepareStatement(query);
				// Se establecen los valores de los parametros de la consulta a partir del
				// objeto Mensajes recibido como parametro
				ps.setString(1, mensaje.getMensaje());
				ps.setString(2, mensaje.getAutor_mensaje());
				ps.executeUpdate();
				System.out.println("Mensaje creado correctamente");
			} catch (SQLException ex) {
				System.out.println(ex);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void leerMensajesDB() {
		Conexion db_connect = new Conexion();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try (Connection conexion = db_connect.get_connection()) {
			String query = "SELECT * FROM mensajes";
			ps = conexion.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id_mensaje"));
				System.out.println("Mensaje: " + rs.getString("mensaje"));
				System.out.println("Autor: " + rs.getString("autor_mensaje"));
				System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
				System.out.println("");
			}

		} catch (SQLException e) {
			System.out.println("No se pudo recuperar los mensajes");
			System.out.println(e);
		}

	}

	public static void borrarMensajesDB(int id_mensaje) {
		Conexion db_connect = new Conexion();
		try (Connection conexion = db_connect.get_connection()) {
			PreparedStatement ps = null;

			try {
				String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
				ps = conexion.prepareStatement(query);
				ps.setInt(1, id_mensaje);
				ps.executeUpdate();
				System.out.println("El mensaje ha sido borrado");
			} catch (SQLException e) {
				System.out.println("No se pudo borrar el mensaje");
				System.out.println(e);

			}

		} catch (SQLException e) {
			System.out.println("No se pudo recuperar los mensajes");
			System.out.println(e);
		}
	}

	public static void actualizarMensajeDB(Mensajes mensaje) {
		Conexion db_connect = new Conexion();
		try (Connection conexion = db_connect.get_connection()) {
			PreparedStatement ps = null;

			try {
				String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
				ps = conexion.prepareStatement(query);
				ps.setString(1, mensaje.getMensaje());
				ps.setInt(2, mensaje.getId_mensaje());
				ps.executeUpdate();
				System.out.println("Mensaje se ha actualizó correctamente");
			} catch (SQLException ex) {
				System.out.println(ex);
				System.out.println("No se puedo actualizar el mensaje");
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
