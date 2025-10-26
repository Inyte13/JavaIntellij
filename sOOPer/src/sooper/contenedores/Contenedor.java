package sooper.contenedores;

import sooper.IContenedor;
import sooper.IProducto;

import java.util.Set;

public abstract class Contenedor implements IContenedor {
  private String referencia;
  private int altura;
  private int resistencia;

  public Contenedor(String referencia, int altura, int resistencia) {
    this.referencia = referencia;
    this.altura = altura;
    this.resistencia = resistencia;
  }

  @Override
  public String getReferencia() {
    return referencia;
  }

  @Override
  public int getVolumen() {
    return altura*getSuperficie();
  }

  @Override
  public int volumenDisponible() {
    return 0;
  }

  @Override
  public int getResistencia() {
    return resistencia;
  }

  @Override
  public Set<IProducto> getProductos() {
    return null;
  }

  @Override
  public boolean hayEspacio(IProducto producto) {
    return false;
  }

  @Override
  public boolean resiste(IProducto producto) {
    return false;
  }
}
