package SistemaDeMatriculas;

public class Alumno {
  private int codigo;
  private String nombres;
  private String apellidos;
  public Alumno(int codigo, String nombres, String apellidos) {
    this.codigo = codigo;
    this.nombres = nombres;
    this.apellidos = apellidos;
  }
  public int getCodigo() {
    return codigo;
  }
  public String getNombres() {
    return nombres;
  }
  public String getApellidos() {
    return apellidos;
  }
  @Override
  public String toString() {
    return "Alumno{" +
            ", nombres='" + nombres + '\'' +
            ", apellidos='" + apellidos + '\'' +
            '}';
  }
}
