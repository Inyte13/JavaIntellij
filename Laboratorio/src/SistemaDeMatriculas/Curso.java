package SistemaDeMatriculas;

public class Curso {
  private int codigo;
  private String nombre;
  private double precio;
  public Curso(int codigo, String nombre, double precio){
    this.codigo=codigo;
    this.nombre=nombre;
    this.precio=precio;
  }
  public int getCodigo() {
    return codigo;
  }
  public String getNombre() {
    return nombre;
  }
  public double getPrecio() {
    return precio;
  }
}
