package logica;

public class POO {
	public static void main(String[] args) {
		//Enter variables that you previously defined in the construct
		Alumno a1=new Alumno(4,"Luis","García");
		System.out.println("El id es "+a1.getId());
		System.out.println("El nombre es "+a1.getNombre());
		System.out.println("El apellido es "+a1.getApellido());
		//We can set or modify our empty class
		Alumno a2=new Alumno();
		a2.setId(3);
		a2.setNombre("Ana");
		a2.setApellido("Paula");
		System.out.println("El id es "+a2.getId());
		System.out.println("El nombre es "+a2.getNombre());
		System.out.println("El apellido es "+a2.getApellido());
		//With set we can modify the value
		a1.setId(13);
		System.out.println("El id es "+a1.getId());
		System.out.println("El nombre es "+a1.getNombre());
		System.out.println("El apellido es "+a1.getApellido());
		
		
	}
}
