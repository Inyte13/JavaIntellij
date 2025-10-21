package com.lagarcia.mock;

import java.util.ArrayList;
import java.util.Random;

public class GeneradorAleatorioDeMovimientos {
  private static final String TRANSFERENCIA="Transferencia de ";
  private static final String INGRESO="Ingreso de ";
  private static final String RETIRADA="Retirada de ";
  private static final String PAGO_CON_TARJETA="Pago con tarjeta de ";
  private static final String NOMINA="Ingreso nómina de ";
  private static final String PAGO_RECIBO="Pago de recibo de ";

  public ArrayList<String> obtenerMovimientos(int numeroDeMovientos, String moneda){
    ArrayList<String> movimientos=new ArrayList<>();
    for(int i=0;i<numeroDeMovientos;i++){
      Random random=new Random();
      int numeroAleatorio=random.nextInt(5)+1;
      String tipoDeMovimiento;
      switch (numeroAleatorio){
        case 1:
          tipoDeMovimiento=TRANSFERENCIA;
          break;
        case 2:
          tipoDeMovimiento=INGRESO;
          break;
        case 3:
          tipoDeMovimiento=RETIRADA;
          break;
        case 4:
          tipoDeMovimiento=PAGO_CON_TARJETA;
          break;
        case 5:
          tipoDeMovimiento=NOMINA;
          break;
        default:
          tipoDeMovimiento=PAGO_RECIBO;
          break;
      }
      double cantidadAleatoria=random.nextDouble()*2999+1;
      String movimiento=tipoDeMovimiento+String.format("%.2f",cantidadAleatoria)+" "+moneda;
      movimientos.add(movimiento);
    }
    return movimientos;

  }
}

