package object;

public class Animal {
  private String especie;
  private int numeroDePatas;

  public Animal(String especie, int numeroDePatas) {
    this.especie = especie;
    this.numeroDePatas = numeroDePatas;
  }

  public int getNumeroDePatas() {
    return numeroDePatas;
  }

  public String getEspecie() {
    return especie;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "especie='" + especie + '\'' +
        ", numeroDePatas=" + numeroDePatas +
        '}';
  }
}
