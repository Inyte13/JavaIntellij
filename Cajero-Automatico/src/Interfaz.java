import java.util.Scanner;

public class Interfaz {
  public static void main(String[] args) {
    System.out.println("Elija una de las siguientes opciones:\n" +
        "\tEscriba 1 para consultar su saldo\n" +
        "\tEscriba 2 para ingresar dinero\n" +
        "\tEscriba 3 para sacar dinero\n" +
        "\tEscriba 4 para consultar sus últimos movimientos\n" +
        "Una vez escrita la opción pulse la tecla enter");
    Scanner teclado=new Scanner(System.in);
    int opcionSeleccionada=teclado.nextInt();
    System.out.println("La opción que usted ha elegido es: "+opcionSeleccionada);

  }
}
