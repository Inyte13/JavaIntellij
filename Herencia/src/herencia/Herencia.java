package herencia;

public class Herencia {
	public static void main(String[] args) {
		Persona vector[]=new Persona[4]; // Polimorfismo, todo empleado es Persona pero no al revés
		vector[0]=new Persona();
		vector[1]=new Empleado();
		vector[2]=new Consultor();
		vector[3]=new Jefe();
	}}
