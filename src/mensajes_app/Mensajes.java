package mensajes_app;

public class Mensajes {
	int id_mensaje; // id del mensaje
	String mensaje; // contenido del mensaje
	String autor_mensaje; // nombre del autor del mensaje
	String fecha_mensaje; // fecha en que se creo el mensaje

	/*
	 * Constructor vacio
	 */

	public Mensajes() {

	}

	/*
	 * Constructor con parametros
	 */

	public Mensajes(String mensaje, String autor_mensaje, String fecha_mensaje) {
		super();
		this.mensaje = mensaje;
		this.autor_mensaje = autor_mensaje;
		this.fecha_mensaje = fecha_mensaje;
	}
	
	//Getters y setters

	public int getId_mensaje() {
		return id_mensaje;
	}

	public void setId_mensaje(int id_mensaje) {
		this.id_mensaje = id_mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getAutor_mensaje() {
		return autor_mensaje;
	}

	public void setAutor_mensaje(String autor_mensaje) {
		this.autor_mensaje = autor_mensaje;
	}

	public String getFecha_mensaje() {
		return fecha_mensaje;
	}

	public void setFecha_mensaje(String fecha_mensaje) {
		this.fecha_mensaje = fecha_mensaje;
	}

}
