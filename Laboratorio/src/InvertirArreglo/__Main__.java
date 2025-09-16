package InvertirArreglo;

public class __Main__ {
  public static void main(String[] args) {
    Arreglo numeros=new Arreglo();
    if(numeros.ingresarLongitud(10)){
      numeros.ingresarValores();
      numeros.mostrarArreglo();
      numeros.ordenInverso();
      numeros.mostrarArreglo();
    }
  }
}
