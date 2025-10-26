package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Bolsa extends Contenedor{
  private int ancho;

  public Bolsa(String referencia, int altura, int resistencia, int ancho) {
    super(referencia, altura, resistencia);
    this.ancho = ancho;
  }
  public int getDiametro(){
    return (int)(2*ancho/Math.PI);
  }
  @Override
  public int getSuperficie() {
    int radio=getDiametro()/2;
    return (int)(Math.PI*radio*radio);
  }
  @Override
  public TipoContenedor getTipo() {
    return TipoContenedor.BOLSA;
  }
}
