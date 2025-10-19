package teoria;

public class Metodos {
  //  Método con un número indefinido de parametros que será un list (double[])
  private double calcularMediaAritmetica(double...numeros){
    if(numeros.length==0){
      return 0.0;
    }
    double suma=0.0;
    for(double nums:numeros){
      suma+=nums;
    }
    return suma/numeros.length;
  }
}
