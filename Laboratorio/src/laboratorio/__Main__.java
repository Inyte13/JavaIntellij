package laboratorio;

import java.util.Scanner;

public class __Main__ {
  public static void main(String[] args) {
    Bodega bod1=new Bodega();
    bod1.agregar();
    System.out.println(bod1.busquedaSecuencial("Plátano"));
    bod1.mostrarProductos();    
    
  }  
}
