package sooper;

import sooper.enums.Categoria;

public interface IProducto {
  String getReferencia();
  int getPeso();
  int getVolumen();
  Categoria getCategoria();

  boolean esCompatible(IProducto producto);
  boolean hayEspacio(IContenedor contenedor);
}
