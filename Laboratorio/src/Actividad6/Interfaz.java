//package Actividad6;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Interfaz {
//  Banco banco;
//
//  public Interfaz(Banco banco) {
//    this.banco = banco;
//  }
//
//  public void menuAdmin(Administrador admin, String cargo){
//    Scanner teclado=new Scanner(System.in);
//    int opcion;
//    do{
//      System.out.println("-------------------");
//      System.out.println("Elija una de las siguientes opciones:\n" +
//          "\t1) Registrar administrador\n" +
//          "\t2) Registrar empleado\n" +
//          "\t3) Registrar cliente\n" +
//          "\t4) Añadir titular a una cuenta\n" +
//          "\t5) Buscar cuenta\n" +
//          "\t6) Buscar persona\n" +
//          "\t7) Mostrar todas las cuentas\n" +
//          "\t8) Mostrar todos los usuarios\n" +
//          "\t9) Salir");
//      opcion=teclado.nextInt();
//      String nombre,apellido,dni,direccion,nroTelefono,correo,contrasena;
//      TipoCargo tipoCargo;
//      switch (opcion){
//        case 1:
//          System.out.println("---------Registrando administrador---------");
//          nombre=ingresarNombre(cargo);
//          apellido=ingresarApellido(cargo);
//          dni=ingresarDni(cargo);
//          direccion=ingresarDireccion(cargo);
//          nroTelefono=ingresarNroTelefono(cargo);
//          correo=ingresarCorreo(cargo);
//          contrasena=ingresarContrasena(cargo);
//          admin.registrarAdmin(banco,nombre,apellido,dni,direccion,nroTelefono,correo,contrasena).mostrarAdmin();
//          break;
//        case 2:
//          System.out.println("---------Registrando empleado---------");
//          nombre=ingresarNombre(cargo);
//          apellido=ingresarApellido(cargo);
//          dni=ingresarDni(cargo);
//          direccion=ingresarDireccion(cargo);
//          nroTelefono=ingresarNroTelefono(cargo);
//          correo=ingresarCorreo(cargo);
//          contrasena=ingresarContrasena(cargo);
//          tipoCargo=ingresarTipoDeCargo(cargo);
//          admin.registrarEmpleado(nombre,apellido,dni,direccion,nroTelefono,correo,tipoCargo,contrasena).mostrarEmpleado();
//          break;
//        case 3:
//          System.out.println("---------Registrando cliente---------");
//          nombre=ingresarNombre(cargo);
//          apellido=ingresarApellido(cargo);
//          dni=ingresarDni(cargo);
//          direccion=ingresarDireccion(cargo);
//          nroTelefono=ingresarNroTelefono(cargo);
//          correo=ingresarCorreo(cargo);
//          contrasena=ingresarContrasena(cargo);
//          admin.registrarCliente(nombre,apellido,dni,direccion,nroTelefono,correo,contrasena).mostrarCliente();
//          break;
//        case 4:
//          Cliente solicitante=validarDni("solicitante");
//          Cliente nuevoTitular=validarDni("nuevo titular");
//          Cuenta cuenta= buscarCuentaPorCliente(solicitante.getClienteCuentas());
//          ClienteCuenta cc=admin.vincularClienteACuenta(solicitante,nuevoTitular,cuenta.getNumeroCuenta());
//          if(cc==null){
//            System.out.println(nuevoTitular.getNombre()+" "+nuevoTitular.getApellido()+" ya es titular de la cuenta "+cuenta.getNumeroCuenta());
//          }else{
//            cuenta.mostrarCuenta();
//          }
//          break;
//        case 5:
//          buscarCuenta().mostrarCuenta();
//          break;
//        case 6:
//          int option;
//          do{
//            System.out.println("-------------------");
//            System.out.println("Elija una de las siguientes opciones:\n" +
//                "\t1) Buscar administrador\n" +
//                "\t2) Buscar empleado\n" +
//                "\t3) Buscar cliente\n" +
//                "\t4) Salir");
//            option=teclado.nextInt();
//            switch (option){
//              case 1:
//                buscarPersona(Banco.administradores).mostrarAdmin();
//                break;
//              case 2:
//                buscarPersona(Banco.empleados);
//                break;
//              case 3:
//                buscarPersona(Banco.clientes);
//                break;
//              case 4:
//                System.out.println("Saliendo");
//                break;
//              default:
//                System.out.println("Ingrese un número válido (1-4)");
//            }
//          }while(option!=4);
//          break;
//        case 7:
//          banco.mostrarCuentas();
//          break;
//        case 8:
//          banco.mostrarAdmins();
//          banco.mostrarEmpleados();
//          banco.mostrarClientes();
//          break;
//        case 9:
//          System.out.println("Saliendo...");
//          break;
//        default:
//          System.out.println("Ingrese un número válido (1-9)");
//      }
//    }while(opcion!=9);
//  }
//  public void menuEmpleado(Empleado empleado, String cargo){
//    Scanner teclado=new Scanner(System.in);
//    int opcion;
//    do{
//      System.out.println("-------------------");
//      System.out.println("Elija una de las siguientes opciones:\n" +
//          "\t1) Registrar cliente\n" +
//          "\t2) Añadir titular a una cuenta\n" +
//          "\t3) Buscar cuenta\n" +
//          "\t4) Buscar cliente\n" +
//          "\t5) Mostrar todas las cuentas\n" +
//          "\t6) Mostrar todos los clientes\n" +
//          "\t7) Salir");
//      opcion=teclado.nextInt();
//      String nombre,apellido,dni,direccion,nroTelefono,correo,contrasena;
//      TipoCargo tipoCargo;
//      switch (opcion){
//        case 1:
//          System.out.println("---------Registrando cliente---------");
//          nombre=ingresarNombre(cargo);
//          apellido=ingresarApellido(cargo);
//          dni=ingresarDni(cargo);
//          direccion=ingresarDireccion(cargo);
//          nroTelefono=ingresarNroTelefono(cargo);
//          correo=ingresarCorreo(cargo);
//          contrasena=ingresarContrasena(cargo);
//          empleado.registrarCliente(nombre,apellido,dni,direccion,nroTelefono,correo,contrasena).mostrarCliente();
//          break;
//        case 2:
//          Cliente solicitante=validarDni("solicitante");
//          Cliente nuevoTitular=validarDni("nuevo titular");
//          Cuenta cuenta= buscarCuentaPorCliente(solicitante.getClienteCuentas());
//          ClienteCuenta cc=empleado.vincularClienteACuenta(solicitante,nuevoTitular,cuenta.getNumeroCuenta());
//          if(cc==null){
//            System.out.println(nuevoTitular.getNombre()+" "+nuevoTitular.getApellido()+" ya es titular de la cuenta "+cuenta.getNumeroCuenta());
//          }else{
//            cuenta.mostrarCuenta();
//          }
//          break;
//        case 3:
//          buscarCuenta().mostrarCuenta();
//          break;
//        case 4:
//          buscarPersona(Banco.clientes);
//          break;
//        case 5:
//          banco.mostrarCuentas();
//          break;
//        case 6:
//          banco.mostrarClientes();
//          break;
//        case 7:
//          System.out.println("Saliendo...");
//          break;
//        default:
//          System.out.println("Ingrese un número válido (1-7)");
//      }
//    }while(opcion!=7);
//  }
////  public void menuEmpleado(Cliente cliente){
////    Scanner teclado=new Scanner(System.in);
////    int opcion;
////    do{
////      System.out.println("Elija una de las siguientes opciones:\n" +
////          "\t1) Buscar cuenta\n" +
////          "\t2) Mostrar todas tus cuentas\n" +
////          "\t3) Retirar\n" +
////          "\t4) Depositar\n" +
////          "\t5) Transferencia\n" +
////          "\t6) Salir");
////      opcion=teclado.nextInt();
////      String nombre,apellido,dni,direccion,nroTelefono,correo,contrasena;
////      TipoCargo tipoCargo;
////      switch (opcion){
////        case 1:
////          buscarCuentaPorCliente(cliente.getClienteCuentas());
////          break;
////        case 2:
////          break;
////        case 3:
////          buscarCuenta().mostrarCuenta();
////          break;
////        case 4:
////          buscarPersona(Banco.clientes);
////          break;
////        case 5:
////          banco.mostrarCuentas();
////          break;
////        case 6:
////          banco.mostrarClientes();
////          break;
////        case 7:
////          System.out.println("Saliendo...");
////          break;
////        default:
////          System.out.println("Ingrese un número válido (1-7)");
////      }
////    }while(opcion!=7);
////  }
//
//  private static Cuenta buscarCuentaPorCliente(ArrayList<ClienteCuenta> clienteCuentas){
//    Scanner teclado=new Scanner(System.in);
//    String nroCuenta;
//    Cuenta cuenta;
//    do{
//      System.out.print("Ingresa el número de la cuenta: ");
//      nroCuenta=teclado.nextLine();
//      cuenta=Banco.buscarCuentaPorCliente(clienteCuentas,nroCuenta);
//      if(!numeroCuentaValida(nroCuenta)){
//        System.out.println("El número de cuenta no es válido");
//        continue;
//      }
//      if(cuenta==null){
//        System.out.println("El número de cuenta no existe");
//      }
//    }while(!numeroCuentaValida(nroCuenta)||cuenta==null);
//    return cuenta;
//  }
//
//  private static Cuenta buscarCuenta(){
//    Scanner teclado=new Scanner(System.in);
//    String nroCuenta;
//    Cuenta cuenta;
//    do{
//      System.out.print("Ingrese el número de la cuenta: ");
//      nroCuenta=teclado.nextLine();
//      cuenta=Banco.buscarCuenta(nroCuenta);
//      if(!numeroCuentaValida(nroCuenta)){
//        System.out.println("El número de cuenta no es válido");
//        continue;
//      }
//      if(cuenta==null){
//        System.out.println("El número de cuenta no existe");
//      }
//    }while(!numeroCuentaValida(nroCuenta)||cuenta==null);
//    return cuenta;
//  }
//  private static <T extends Persona> T buscarPersona(List<T> personas){
//    Scanner teclado=new Scanner(System.in);
//    String dni;
//    T persona;
//    do{
//      System.out.print("Ingrese el número de DNI: ");
//      dni=teclado.nextLine();
//      persona=Banco.buscarPersona(personas,dni);
//      if(!dniValido(dni)){
//        System.out.println("El DNI no es válido");
//        continue;
//      }
//      if(persona==null){
//        System.out.println("Ese usuario no esta registrado");
//      }
//    }while(!dniValido(dni)||persona==null);
//    return persona;
//  }
//
//
//  private static String ingresarNroTelefono(String cargo){
//    Scanner teclado=new Scanner(System.in);
//    String nroTelefono;
//    do{
//      System.out.print("Número de teléfono del nuevo "+cargo+": ");
//      nroTelefono=teclado.next();
//      if(!nroTelefonoValido(nroTelefono)){
//        System.out.println("El número de télefono no es válido");
//      }
//    }while(!nroTelefonoValido(nroTelefono));
//    return nroTelefono;
//  }
//  private static String ingresarCorreo(String cargo){
//    Scanner teclado=new Scanner(System.in);
//    String correo;
//    do{
//      System.out.print("Correo del nuevo "+cargo+": ");
//      correo=teclado.next();
//      if(!correoValido(correo)){
//        System.out.println("El correo no es válido");
//      }
//    }while(!correoValido(correo));
//    return correo;
//  }
//  private static String ingresarContrasena(String cargo){
//    Scanner teclado=new Scanner(System.in);
//    String contrasena;
//    do{
//      System.out.print("Contraseña del nuevo "+cargo+": ");
//      contrasena=teclado.next();
//      if(!contrasenaValida(contrasena)){
//        System.out.println("La contraseña debe tener mínimo 6 caracteres");
//      }
//    }while(!contrasenaValida(contrasena));
//    return contrasena;
//  }
//
//  private static boolean numeroCuentaValida(String numeroCuenta) {
//    return numeroCuenta.matches("^\\d{6}$");
//  }
//
//
//  private static boolean tipoDeCargoValido(String entrada) {
//    for (TipoCargo t : TipoCargo.values()) {
//      if (t.name().equals(entrada)) {
//        return true;
//      }
//    }
//    return false;
//  }
//
//}
