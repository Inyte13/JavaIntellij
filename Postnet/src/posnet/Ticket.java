package posnet;

public class Ticket {
  private String nombreApellido;
  private double montoTotal;
  private double montoPorCuota;

  public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
    this.nombreApellido = nombreApellido;
    this.montoTotal = montoTotal;
    this.montoPorCuota = montoPorCuota;
  }
}
