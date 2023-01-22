package mensajes_app;

import java.sql.Connection;
import java.util.Scanner;
import mensajes_app.*;

public class Inicio {
	public static void main(String[] args) {
		// Se crea un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// Opciones del menu
		// Variable para almacenar la opcion seleccionada por el usuario
		int opcion = 0;
		// Se ejecuta el menu en un bucle do-while hasta que el usuario seleccione la
		// opcion de salir
		do {
			System.out.println("-------------------------");
			System.out.println("Aplicacion de mensajes");
			System.out.println("1. Crear mensaje");
			System.out.println("2. Listar mensaje");
			System.out.println("3. Eliminar mensaje");
			System.out.println("4. Editar mensaje");
			System.out.println("5. Salir");
			// Leer la opcion del usuario
			opcion = sc.nextInt();
			// Se ejecuta la accion correspondiente a la opcion seleccionada
			switch (opcion) {
			case 1:
				// Llamada al metodo crearMensaje de la clase MensajesService para crear un
				// mensaje
				MensajesService.crearMensaje();
				break;
			case 2:
				// Llamada al metodo listarMensaje de la clase MensajesService para listar los
				// mensajes
				MensajesService.listarMensaje();

				break;
			case 3:
				// Llamada al metodo editarMensaje de la clase MensajesService para eliminar un
				// mensaje
				MensajesService.borrarMensaje();
				
				break;
			case 4:
				// Llamada al metodo borrarMensaje de la clase MensajesService para editar un
				// mensaje
				MensajesService.editarMensaje();
				break;
			default:
				break;

			}

		} while (opcion != 5);

	}
}