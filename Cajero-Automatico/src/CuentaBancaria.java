public class CuentaBancaria {
  private String titular;
  private TipoDeCuenta tipoDeCuenta;
  private double saldo;
  private final double COMISION=1.2;

//  Constructor
  public CuentaBancaria(String titular,TipoDeCuenta tipoDeCuenta, double saldo) {
    this.titular = titular;
    this.tipoDeCuenta = tipoDeCuenta;
    this.saldo = saldo;
  }
//  Otro constructor, sobrecarga de constructores
  public CuentaBancaria(String titular, double saldo){
    this(titular,TipoDeCuenta.AHORRO,saldo); // Usamos this para usar el constructor más completo
  }
//  Constructor default
  public CuentaBancaria(){
    this("",TipoDeCuenta.AHORRO,0);
  }

  public void retirarDinero(double cantidad){
    if(cantidad<0){
      return;
    }
    double comision=calcularComision();
    saldo-=comision;
    saldo-=cantidad;
  }
  public double calcularComision(){
    switch (tipoDeCuenta){
      case AHORRO:
        return COMISION;
      default:
        return 0;
    }
  }
  public void ingresarDinero(double cantidad){
    saldo+=cantidad;
  }
  public void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo){
    tipoDeCuenta=nuevoTipo;
  }
  public double obtenerSaldo(){
    return saldo;
  }


  @Override
  public String toString() {
    return "CuentaBancaria{" +
        "titular='" + titular + '\'' +
        ", tipoDeCuenta='" + tipoDeCuenta + '\'' +
        ", saldo=" + saldo +
        '}';
  }
}
