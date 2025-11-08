package Actividad6;

import java.util.ArrayList;

public class Banco {
  static ArrayList<Empleado> empleados;
  static ArrayList<Cliente> clientes;
  static ArrayList<Administrador> administradores;
  static ArrayList<ClienteCuenta> clienteCuentas;

  public Banco() {
    empleados=new ArrayList<>();
    clientes=new ArrayList<>();
    administradores=new ArrayList<>();
    clienteCuentas=new ArrayList<>();
  }

  public static Cuenta buscarCuenta(ArrayList<ClienteCuenta> clienteCuentas, String numeroCuenta) {
    for (ClienteCuenta cc : clienteCuentas) {
      if (cc.getCuenta().getNumeroCuenta().equals(numeroCuenta)) {
        return cc.getCuenta();
      }
    }
    return null;
  }

  public static Cliente registrarClientes(Persona creador,String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo){
    Cliente cliente=Cliente.crearCliente(creador,nombre,apellido,dni, direccion, nroTelefono,correo);
    agregarCliente(cliente);
    return cliente;
  }

  public static Empleado registrarEmpleado(Persona creador, String nombre, String apellido, String dni, String direccion, String nroTelefono, String correo, TipoCargo cargo){
    Empleado empleado=Empleado.crearEmpleado(creador,nombre,apellido,dni,direccion,nroTelefono,correo,cargo);
    agregarEmpleado(empleado);
    return empleado;
  }

  public static ClienteCuenta vincularClienteACuenta(Persona creador,Cliente solicitante, Cliente nuevoTitular, String numeroCuenta){
    Cuenta cuentaSolicitante=buscarCuenta(clienteCuentas,numeroCuenta);
    Cuenta cuentaNuevoTitular=buscarCuenta(clienteCuentas,numeroCuenta);
    if(verificarCuenta(cuentaSolicitante)&&!verificarCuenta(cuentaNuevoTitular)){
      return ClienteCuenta.crearClienteCuenta(creador,nuevoTitular,cuentaSolicitante.getTipoCuenta());
    }
    return null;
  }

  public static ClienteCuenta registrarClienteCuenta(Persona creador,Cliente cliente,TipoCuenta tipoCuenta){
    return ClienteCuenta.crearClienteCuenta(creador,cliente,tipoCuenta);
  }

  public static ClienteCuenta registrarClienteCuenta(Persona creador,Cliente cliente,TipoCuenta tipoCuenta,double saldo){
    return ClienteCuenta.crearClienteCuenta(creador,cliente,tipoCuenta);
  }




  static boolean verificarCuenta(Cuenta cuenta){
    return cuenta!=null;
  }






  static void agregarCliente(Cliente cliente){
    clientes.add(cliente);
  }
  static void agregarEmpleado(Empleado empleado){
    empleados.add(empleado);
  }

  public void agregarAdmin(Administrador admin){
    administradores.add(admin);
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

}
