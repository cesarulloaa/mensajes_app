package mensajes_app;

import java.util.Scanner;

public class MensajesService {
	/*
	 * Este metodo se utiliza para crear un nuevo mensaje. Pide al usuario que
	 * ingrese el mensaje y el nombre del autor, crea un nuevo objeto de tipo
	 * Mensajes utilizando esta información, y luego llama al metodo crearMensajesDB
	 * de la clase MensajesDAO para insertar el nuevo mensaje en la base de datos.
	 * 
	 */
	public static void crearMensaje() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu mensaje");
		String mensaje = sc.nextLine();

		System.out.println("Tu nombre");
		String nombre = sc.nextLine();

		Mensajes registro = new Mensajes();
		registro.setMensaje(mensaje);
		registro.setAutor_mensaje(nombre);

		MensajesDAO.crearMensajesDB(registro);
	}

	/*
	 * Este metodo se utiliza para listar los mensajes en la base de datos.
	 * 
	 */

	public static void listarMensaje() {
		MensajesDAO.leerMensajesDB();

	}

	/*
	 * Este metodo se utiliza para eliminar un mensaje de la base de datos, llama al
	 * metodo borrarMensajesDB de la clase MensajesDAO.
	 */

	public static void borrarMensaje() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica el id del mensaje a borrar");
		int id_mensaje = sc.nextInt();
		MensajesDAO.borrarMensajesDB(id_mensaje);
	}
	//Destinado a actualizar un mensaje en la base de datos.
	public static void editarMensaje() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica tu nuevo mensaje");
		String mensaje = sc.nextLine();
		
		System.out.println("Indica el id del mensaje que quieres editar");
		int id_mensaje = sc.nextInt();
		
		Mensajes acturalizar = new Mensajes();
		acturalizar.setId_mensaje(id_mensaje);
		acturalizar.setMensaje(mensaje);
		MensajesDAO.actualizarMensajeDB(acturalizar);
	}

}
