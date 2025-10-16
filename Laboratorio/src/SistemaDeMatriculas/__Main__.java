package SistemaDeMatriculas;

public class __Main__ {
  public static void main(String[] args) {
    SistemaDeMatriculas sisMatri=new SistemaDeMatriculas();
    sisMatri.agregarAlumno();
    sisMatri.agregarCurso();
    sisMatri.matricular();
    sisMatri.buscarAlu(3);
    sisMatri.buscarMatri(2);
    System.out.println(sisMatri.montoTotal());
  }
}
