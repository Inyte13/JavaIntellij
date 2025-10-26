package sooper;

import java.util.Set;

public interface IPedido {
  String getReferencia();
  Set<IProducto> getProductos();
  Set<IContenedor> getContenedores();

  void anadirContenedor(IContenedor contenedor);
  IContenedor anadirProducto(IProducto producto);

}
