import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
  private CuentaBancaria cuentaBancariaActual;
  private String id;
  private String password;

  public CajeroAutomatico(String id, String password) {
    double saldoAleatorio = ThreadLocalRandom.current().nextDouble(0, 50_000);
    cuentaBancariaActual = new CuentaBancaria("anónimo",saldoAleatorio);
    this.id=id;
    this.password=password;
  }
  public void mostrarSaldo(){
    System.out.println("Su saldo es S/."+cuentaBancariaActual.obtenerSaldo());
  }
  public void ingresarDinero(){
    System.out.println("¿Cuánto dinero desea ingresar?");
    Scanner teclado=new Scanner(System.in);
    double cantidad=teclado.nextDouble();
    cuentaBancariaActual.ingresarDinero(cantidad);
  }
  public void retirarDinero(){
    System.out.println("¿Cuánto dinero desea retirar?");
    Scanner teclado=new Scanner(System.in);
    double cantidad=teclado.nextDouble();
    cuentaBancariaActual.retirarDinero(cantidad);
  }
  public void consultarUltimosMovimientos(){
    var generadorAleatorioDeMovimientos=new GeneradorAleatorioDeMovimientos();
    Scanner teclado=new Scanner(System.in);
    System.out.println("¿Cuántos movimientos quiere realizar?");
    int numerosDeMovimientos= teclado.nextInt();
    ArrayList<String> movimientos=generadorAleatorioDeMovimientos.obtenerMovimientos(numerosDeMovimientos,"soles");
    mostrarMovimientos(movimientos);
  }
  public void mostrarMovimientos(ArrayList<String> movimientos){
    for(String movimiento:movimientos){
      System.out.println(movimiento);
    }
  }
  public void salir(){
    System.out.println("Gracias por utilizar nuestros servicios");
  }

}
