package laboratorio;

public class __Main__ {
  public static void main(String[] args) {
    Lista list=new Lista();
    list.agregarNombres();
    list.agregarNotas();
    System.out.println("Alumn@ con la nota más alta: "+list.alumnoNotaMasAlta());
    System.out.println("Alumn@ con la nota más baja: "+list.alumnoNotaMasBaja());
    System.out.println(list.notaAlumno("Luis"));
    System.out.println(list.toString());
    
  }
}
