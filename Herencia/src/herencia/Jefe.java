package herencia;

public class Jefe extends Persona{
	int id_jefe;
	String depa_jefe;
	public Jefe() {}
	public Jefe(int id, String dni, String nombre, String apellido, String domicilio, 
			String telefono, int id_jefe, String depa_jefe) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.id_jefe = id_jefe;
		this.depa_jefe = depa_jefe;}
	
	public int getId_jefe() {
		return id_jefe;
	}
	public void setId_jefe(int id_jefe) {
		this.id_jefe = id_jefe;
	}
	public String getDepa_jefe() {
		return depa_jefe;
	}
	public void setDepa_jefe(String depa_jefe) {
		this.depa_jefe = depa_jefe;
	}
	
	
	

}
