package Actividad6;

public class Main {
  public static void main(String[] args) {
    Banco banco = new Banco();

    // Crear empleados
    Empleado empleado1 = new Empleado("John", "Flores", "12345687", "123", "939045911", "john@unsa.edu.pe", "Admin");
    Empleado empleado2 = new Empleado("María", "García", "87654321", "456", "987654321", "maria@unsa.edu.pe", "Cajero");

    // Registrar clientes
    Cliente cliente1 = empleado1.registrarClientes(banco,"Luis", "Alberto", "65494832", "391", "945678999","luis13@unsa.edu.pe");
    Cliente cliente2 = empleado2.registrarClientes(banco,"Sofia", "Paredes", "73829456", "218", "956789012", "sofia@unsa.edu.pe");

    // Agregar empleados al banco
    banco.agregarEmpleado(empleado1);
    banco.agregarEmpleado(empleado2);

    // Mostrar empleados y clientes
    banco.mostrarEmpleados();
    banco.mostrarClientes();

    // Cliente1 crea cuenta propia
    ClienteCuenta cc1 = cliente1.registrarCuenta(TipoCuenta.AHORRO);
    System.out.println("\n--- Cliente1 crea cuenta AHORRO ---");
    cliente1.mostrarCuentas();

    // Empleado1 crea cuenta corriente para cliente1
    ClienteCuenta cc2 = empleado1.registrarCuenta(cliente1, TipoCuenta.CORRIENTE);
    // Empleado1 crea cuenta ahorro con saldo inicial
    ClienteCuenta cc3 = empleado1.registrarCuenta(cliente1, TipoCuenta.AHORRO, 200);

    System.out.println("\n--- Cliente1 después de cuentas creadas por empleado ---");
    cliente1.mostrarCuentas();

    // Vincular cliente2 a la primera cuenta de cliente1
    String numeroCuenta = cc1.getCuenta().getNumeroCuenta();
    empleado1.vincularClienteACuenta(cliente1, cliente2, numeroCuenta);

    System.out.println("\n--- Cuentas después de vincular cliente2 ---");
    cliente1.mostrarCuentas();
    cliente2.mostrarCuentas();

    // Realizar transacciones
    System.out.println("\n--- Realizando transacciones ---");
    cc1.getCuenta().depositar(500);
    cc1.getCuenta().retirar(150);
    cc3.getCuenta().depositar(1000);

    // Mostrar movimientos
    System.out.println("\n--- Movimientos de las cuentas ---");
    for(ClienteCuenta cc : cliente1.getClienteCuentas()){
      System.out.println(cc.getCuenta().mostrarCuenta());
      cc.getCuenta().mostrarMovimientos();
    }

    for(ClienteCuenta cc : cliente2.getClienteCuentas()){
      System.out.println(cc.getCuenta().mostrarCuenta());
      cc.getCuenta().mostrarMovimientos();
    }
  }
}
