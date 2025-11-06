package Actividad6;

import java.time.LocalDateTime;

public class Transaccion {
  private String numeroTransaccion;
  private LocalDateTime fechaTransaccion;
  private TipoTransaccion tipoTransaccion;
  private double monto;
  private static int count=1;

  private Transaccion(TipoTransaccion tipoTransaccion, double monto) {
    this.numeroTransaccion = generarNumeroTransaccion();
    this.fechaTransaccion = LocalDateTime.now();
    this.tipoTransaccion = tipoTransaccion;
    this.monto = monto;
  }
  public static Transaccion crearTransaccion(TipoTransaccion tipo, double monto) {
    return new Transaccion(tipo, monto);
  }
  private String generarNumeroTransaccion(){
    return "Transaccion-"+count++;
  }

  @Override
  public String toString() {
    return "Transaccion{" +
        "numeroTransaccion='" + numeroTransaccion + '\'' +
        ", fechaTransaccion=" + fechaTransaccion +
        ", tipoTransaccion=" + tipoTransaccion +
        ", monto=" + monto +
        '}';
  }
}

