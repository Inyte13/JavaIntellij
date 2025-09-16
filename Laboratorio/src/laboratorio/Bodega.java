package laboratorio;

import java.util.Scanner;

public class Bodega {
  private Producto[] productos;
  
  public void agregar(){
    Scanner teclado=new Scanner(System.in);
    System.out.print("Ingrese la cantidad de productos: ");
    int n=teclado.nextInt();
    productos=new Producto[n];
    for(int i=0;i<n;i++){
      System.out.print("Código "+(i+1)+": ");
      int codigo=teclado.nextInt();
      System.out.print("Nombre "+(i+1)+": ");
      String nombre=teclado.next();
      System.out.print("Stock "+(i+1)+": ");
      int cantidad=teclado.nextInt();
      productos[i]=new Producto(codigo,nombre,cantidad);
    }
  }
  public String busquedaSecuencial(String nombre){
    for(Producto p:productos){
      if(p.getName().equalsIgnoreCase(nombre)){
        return p.toString();        
      }
    }
    return "El producto "+nombre+" no se encontró";
  }
//  public String busquedaBinaria(String nombre){
//    
//  }
  public void mostrarProductos(){
    for(Producto p:productos){
      System.out.println(p.toString());
    }
  }
//  public Producto[] ordenarStock(){
//    
//  }
  
  
}
