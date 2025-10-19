import java.util.Scanner;

public class Interfaz {
  public static void main(String[] args) {
    int opcionSeleccionada;
    do{
    System.out.println("Elija una de las siguientes opciones:\n" +
        "\tEscriba 1 para consultar su saldo\n" +
        "\tEscriba 2 para ingresar dinero\n" +
        "\tEscriba 3 para sacar dinero\n" +
        "\tEscriba 4 para consultar sus últimos movimientos\n" +
        "Para salir presione cualquier tecla\n" +
        "Una vez escrita la opción pulse la tecla enter");
    Scanner teclado=new Scanner(System.in);
    opcionSeleccionada=teclado.nextInt();
    switch (opcionSeleccionada){
      case 1:
        System.out.println("La opción que usted ha elegido es consultar su saldo");
        break;
      case 2:
        System.out.println("La opción que usted ha elegido es ingresar dinero");
        break;
      case 3:
        System.out.println("La opción que usted ha elegido es sacar dinero");
        break;
      case 4:
        System.out.println("La opción que usted ha elegido es consultar sus últimos movimientos");
        break;
      default:
        System.out.println("Gracias por usar nuestros servicios");
    }
    System.out.println("La opción que usted ha elegido es: "+opcionSeleccionada);
    }while(opcionSeleccionada==1||opcionSeleccionada==2||opcionSeleccionada==3||opcionSeleccionada==4);
  }
}
