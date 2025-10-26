package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Caja extends Contenedor{
  private int largo;
  private int ancho;

  public Caja(String referencia, int altura, int resistencia, int largo, int ancho) {
    super(referencia, altura, resistencia);
    this.largo = largo;
    this.ancho = ancho;
  }

  @Override
  public int getSuperficie() {
    return ancho*largo;
  }

  @Override
  public TipoContenedor getTipo() {
    return TipoContenedor.CAJA;
  }
}
