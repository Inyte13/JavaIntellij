package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public abstract class Higiene extends Producto {
  public Higiene(String referencia, int peso, int volumen) {
    super(referencia, peso, volumen);
  }

  @Override
  public Categoria getCategoria() {
    return Categoria.HIGIENE;
  }

  @Override
  public boolean esCompatible(IProducto producto) {
    return false;
  }
}
