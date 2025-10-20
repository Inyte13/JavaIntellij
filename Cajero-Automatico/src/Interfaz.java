import java.util.Scanner;

public class Interfaz {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    System.out.println("Por favor introduzca su número de identificación");
    String id=teclado.nextLine();
    System.out.println("Por favor introduzca su contraseña");
    String password=teclado.nextLine();
    CajeroAutomatico cajero=new CajeroAutomatico(id,password);
    int opcionSeleccionada;
    do{
    System.out.println("Elija una de las siguientes opciones:\n" +
        "\tEscriba 1 para consultar su saldo\n" +
        "\tEscriba 2 para ingresar dinero\n" +
        "\tEscriba 3 para sacar dinero\n" +
        "\tEscriba 4 para consultar sus últimos movimientos\n" +
        "Para salir presione cualquier tecla\n" +
        "Una vez escrita la opción pulse la tecla enter");
    opcionSeleccionada=teclado.nextInt();
    switch (opcionSeleccionada){
      case 1:
        cajero.mostrarSaldo();
        break;
      case 2:
        cajero.ingresarDinero();
        break;
      case 3:
        cajero.retirarDinero();
        break;
      case 4:
        cajero.consultarUltimosMovimientos();
        break;
      default:
        cajero.salir();
    }
    System.out.println("La opción que usted ha elegido es: "+opcionSeleccionada);
    }while(opcionSeleccionada==1||opcionSeleccionada==2||opcionSeleccionada==3||opcionSeleccionada==4);
  }
}
