package laboratorio;

import java.util.Scanner;

public class __Main__ {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    System.out.print("Ingrese el tamaño del arreglo: ");
    int n=teclado.nextInt();
    Lista list=new Lista(n);
    list.agregar();
    int masRepetido= list.masRepetido();
    if(list.mayorMitad(masRepetido)){
      System.out.println(masRepetido);
    }else{
      System.out.println("No hay mayoría");
    }
  }
}
