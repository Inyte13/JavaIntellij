package Actividad6;

import java.util.ArrayList;

public class Banco {
  private ArrayList<Empleado> empleados;
  private ArrayList<Cliente> clientes;

  public Banco() {
    empleados=new ArrayList<>();
    clientes=new ArrayList<>();
  }

  public void agregarEmpleado(Empleado empleado){
    empleados.add(empleado);
  }

  public void agregarCliente(Cliente cliente){
    clientes.add(cliente);
  }

  public void mostrarEmpleados(){
    for(Empleado empleado:empleados){
      System.out.println(empleado.mostrarEmpleado());
    }
  }

  public void mostrarClientes(){
    for(Cliente cliente:clientes){
      System.out.println(cliente.mostrarCliente());
    }
  }
}
