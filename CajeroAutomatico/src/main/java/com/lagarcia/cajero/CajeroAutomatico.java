package com.lagarcia.cajero;
import com.lagarcia.banco.CuentaAhorro;
import com.lagarcia.banco.CuentaBancaria;
import com.lagarcia.mock.GeneradorAleatorioDeMovimientos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
  private CuentaBancaria cuentaBancariaActual;
  private String id;
  private String password;

  protected CajeroAutomatico(String id, String password) {
    double saldoAleatorio = ThreadLocalRandom.current().nextDouble(0, 50_000);
    cuentaBancariaActual = new CuentaAhorro("anónimo",saldoAleatorio);
    this.id=id;
    this.password=password;
  }
  protected void mostrarSaldo(){
    System.out.println("Su saldo es S/."+cuentaBancariaActual.obtenerSaldo());
  }
  protected void ingresarDinero(){
    System.out.println("¿Cuánto dinero desea ingresar?");
    Scanner teclado=new Scanner(System.in);
    double cantidad=teclado.nextDouble();
    cuentaBancariaActual.ingresarDinero(cantidad);
  }
  protected void retirarDinero(){
    System.out.println("¿Cuánto dinero desea retirar?");
    Scanner teclado=new Scanner(System.in);
    double cantidad=teclado.nextDouble();
    cuentaBancariaActual.retirarDinero(cantidad);
  }
  protected void consultarUltimosMovimientos(){
    var generadorAleatorioDeMovimientos=new GeneradorAleatorioDeMovimientos();
    Scanner teclado=new Scanner(System.in);
    System.out.println("¿Cuántos movimientos quiere realizar?");
    int numerosDeMovimientos= teclado.nextInt();
    ArrayList<String> movimientos=generadorAleatorioDeMovimientos.obtenerMovimientos(numerosDeMovimientos,"soles");
    mostrarMovimientos(movimientos);
  }
  private void mostrarMovimientos(ArrayList<String> movimientos){
    for(String movimiento:movimientos){
      System.out.println(movimiento);
    }
  }
  protected void mostrarCondicionesLegales(){
    cuentaBancariaActual.informarSobreCondidiconesLegales();
  }
  protected void salir(){
    System.out.println("Gracias por utilizar nuestros servicios");
  }

}

