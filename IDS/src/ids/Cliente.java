package ids;

import java.util.List;

public class Cliente {
	private int id, dni;
	private String nombre, apellido;
	private List<Ticket>listaTicket;
	public Cliente() {}
	
	public Cliente(int id, int dni, String nombre, String apellido, List<Ticket> listaTicket) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.listaTicket = listaTicket;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<Ticket> getListaTicket() {
		return listaTicket;
	}
	public void setListaTicket(List<Ticket> listaTicket) {
		this.listaTicket = listaTicket;
	}
	

}
