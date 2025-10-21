package clasesAbstractas;

public class Cuadrado extends Figura{
  private double anchura;
  private double altura;

  public Cuadrado(double anchura, double altura) {
    this.anchura = anchura;
    this.altura = altura;
  }

  @Override
  public double calcularArea() {
    return anchura*altura;
  }

  @Override
  public double calcularPerimetro() {
    return 2*(anchura+altura);
  }
}
