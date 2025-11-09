package Actividad6;

import java.util.ArrayList;

public class Banco {
  static ArrayList<Empleado> empleados;
  static ArrayList<Cliente> clientes;
  static ArrayList<Administrador> administradores;
  static ArrayList<ClienteCuenta> clienteCuentas;
  static ArrayList<Cuenta> cuentas;
  static ArrayList<Transaccion> transacciones;

  public Banco() {
    empleados=new ArrayList<>();
    clientes=new ArrayList<>();
    administradores=new ArrayList<>();
    clienteCuentas=new ArrayList<>();
    cuentas=new ArrayList<>();
  }

  public static Cuenta buscarCuenta(ArrayList<ClienteCuenta> clienteCuentas, String numeroCuenta) {
    for (ClienteCuenta cc : clienteCuentas) {
      if (cc.getCuenta().getNumeroCuenta().equals(numeroCuenta)) {
        return cc.getCuenta();
      }
    }
    return null;
  }

  public static Empleado registrarEmpleado(Persona creador, String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, TipoCargo cargo){
    Empleado empleado=Empleado.crearEmpleado(creador,nombre,apellido,dni,direccion,nroTelefono,correo,cargo);
    agregarEmpleado(empleado);
    return empleado;
  }

  public static Cliente registrarClientes(Persona creador,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo){
    Cliente cliente=Cliente.crearCliente(creador,nombre,apellido,dni, direccion, nroTelefono,correo);
    agregarCliente(cliente);
    return cliente;
  }

  public static Cuenta registrarCuenta(Persona creador,Cliente cliente,TipoCuenta tipoCuenta){
    Cuenta cuenta=Cuenta.crearCuenta(creador,tipoCuenta);
    ClienteCuenta cc=ClienteCuenta.crearClienteCuenta(creador,cliente,cuenta);
    agregarClienteCuenta(cc);
    agregarCuenta(cuenta);
    return cuenta;
  }
  public static Cuenta registrarCuenta(Persona creador,Cliente cliente,TipoCuenta tipoCuenta,double saldo){
    Cuenta cuenta=Cuenta.crearCuenta(creador,tipoCuenta,saldo);
    ClienteCuenta cc=ClienteCuenta.crearClienteCuenta(creador,cliente,cuenta);
    agregarClienteCuenta(cc);
    agregarCuenta(cuenta);
    return cuenta;
  }

  public static ClienteCuenta vincularClienteACuenta(Persona creador,Cliente solicitante, Cliente nuevoTitular, String numeroCuenta){
    Cuenta cuentaSolicitante=buscarCuenta(solicitante.getClienteCuentas(),numeroCuenta);
    Cuenta cuentaNuevoTitular=buscarCuenta(nuevoTitular.getClienteCuentas(),numeroCuenta);
    if(verificarCuenta(cuentaSolicitante)&&!verificarCuenta(cuentaNuevoTitular)){
      return ClienteCuenta.crearClienteCuenta(creador,nuevoTitular,cuentaSolicitante);
    }
    return null;
  }

  public static Transaccion registrarRetiro(Persona creador,Cuenta cuenta,double monto){
    Transaccion transaccion=cuenta.retirar(creador,monto);
    if(verificarTransaccion(transaccion)){
      transacciones.add(transaccion);
    }
    return transaccion;
  }
  public static Transaccion registrarDeposito(Persona creador,Cuenta cuenta,double monto){
    Transaccion transaccion=cuenta.deposito(creador,monto);
    if(verificarTransaccion(transaccion)){
      transacciones.add(transaccion);
    }
    return transaccion;
  }

  public static Transaccion registrarTransferencia(Persona creador,String nroCuentaEmisor,double monto,String nroCuentaReceptor){
    Cuenta cuentaEmisor=buscarCuenta(clienteCuentas,nroCuentaEmisor);
    Cuenta cuentaReceptor=buscarCuenta(clienteCuentas,nroCuentaReceptor);
    if(!verificarCuenta(cuentaEmisor)||!verificarCuenta(cuentaReceptor)){
      return null;
    }
    Transaccion transaccion=cuentaEmisor.transferencia(creador,monto,cuentaReceptor);
    if(verificarTransaccion(transaccion)){
      transacciones.add(transaccion);
    }
    return transaccion;
  }

  public static boolean verificarCuenta(Cuenta cuenta){
    return cuenta!=null;
  }
  public static boolean verificarTransaccion(Transaccion transaccion){
    return transaccion!=null;
  }







  static void agregarAdmin(Administrador admin){
    administradores.add(admin);
  }

  static void agregarEmpleado(Empleado empleado){
    empleados.add(empleado);
  }

  static void agregarCliente(Cliente cliente){
    clientes.add(cliente);
  }

  static void agregarClienteCuenta(ClienteCuenta cc){
    clienteCuentas.add(cc);
  }

  static void agregarCuenta(Cuenta cuenta){
    cuentas.add(cuenta);
  }

  public void mostrarAdmins(){
    administradores.forEach(a-> System.out.println(a.mostrarAdmin()));
  }

  public void mostrarEmpleados(){
    empleados.forEach(e-> System.out.println(e.mostrarEmpleado()));
  }

  public void mostrarClientes(){
    clientes.forEach(c-> System.out.println(c.mostrarCliente()));
  }

  public void mostrarCuentas(){
    cuentas.forEach(cuenta-> System.out.println(cuenta.mostrarCuenta()));
  }

}
