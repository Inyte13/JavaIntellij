package herencia;

public class Empleado extends Persona{ // Hereda de la clase Persona (clase padre)
	int identificacion;
	String cargo;
	double sueldo;
	public Empleado() {
	}
	public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
			int identificacion, String cargo, double sueldo) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.identificacion = identificacion;
		this.cargo = cargo;
		this.sueldo = sueldo;}
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
	

}
