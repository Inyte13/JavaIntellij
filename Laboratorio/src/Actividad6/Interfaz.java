package Actividad6;

import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {
  Banco banco=new Banco();
  public void login(){
    String dni;
    Persona persona=null;
    String contrasena;
    Scanner teclado=new Scanner(System.in);
    do{
      System.out.print("DNI: ");
      dni=teclado.next();
      if(!dniValido(dni)){
        System.out.println("El DNI no es válido");
        continue;
      }
      persona=Banco.buscarPorDni(dni);
      if(persona==null){
        System.out.println("DNI no encontrado");
      }
    }while(persona==null);
    do{
      System.out.print("Contraseña: ");
      contrasena=teclado.nextLine();
      if(!contrasena.equals(persona.getContrasena())){
        System.out.println("Contraseña incorrecta");
      }
    }while(!contrasena.equals(persona.getContrasena()));
  }
  public void menuAdmin(Administrador admin, String cargo){
    Scanner teclado=new Scanner(System.in);
    System.out.println("Elija una de las siguientes opciones:\n" +
        "\t1) Registrar administrador\n" +
        "\t2) Registrar empleado\n" +
        "\t3) Registrar cliente\n" +
        "\t4) Añadir titular a una cuenta\n" +
        "\t5) Buscar cuenta\n" +
        "\t6) Buscar persona\n" +
        "\t7) Mostrar todas las cuentas\n" +
        "\t8) Mostrar todas las personas\n" +
        "\t9) Salir");
    int opcion=teclado.nextInt();
    String nombre,apellido,dni,direccion,nroTelefono,correo,contrasena;
    TipoCargo tipoCargo;
    switch (opcion){
      case 1:
        System.out.println("---------Registrando administrador---------");
        nombre=ingresarNombre(cargo);
        apellido=ingresarApellido(cargo);
        dni=ingresarDni(cargo);
        direccion=ingresarDireccion(cargo);
        nroTelefono=ingresarNroTelefono(cargo);
        correo=ingresarCorreo(cargo);
        contrasena=ingresarContrasena(cargo);
        admin.registrarAdmin(banco,nombre,apellido,dni,direccion,nroTelefono,correo,contrasena);
        break;
      case 2:
        System.out.println("---------Registrando empleado---------");
        nombre=ingresarNombre(cargo);
        apellido=ingresarApellido(cargo);
        dni=ingresarDni(cargo);
        direccion=ingresarDireccion(cargo);
        nroTelefono=ingresarNroTelefono(cargo);
        correo=ingresarCorreo(cargo);
        contrasena=ingresarContrasena(cargo);
        tipoCargo=ingresarTipoDeCargo(cargo);
        admin.registrarEmpleado(nombre,apellido,dni,direccion,nroTelefono,correo,tipoCargo,contrasena);
        break;
      case 3:
        System.out.println("---------Registrando cliente---------");
        nombre=ingresarNombre(cargo);
        apellido=ingresarApellido(cargo);
        dni=ingresarDni(cargo);
        direccion=ingresarDireccion(cargo);
        nroTelefono=ingresarNroTelefono(cargo);
        correo=ingresarCorreo(cargo);
        contrasena=ingresarContrasena(cargo);
        admin.registrarCliente(nombre,apellido,dni,direccion,nroTelefono,correo,contrasena);
        break;
      case 4:
        Cliente solicitante=validarDni("solicitante");
        Cliente nuevoTitular=validarDni("nuevo titular");
        Cuenta cuenta=buscarPorNroCuenta(solicitante.getClienteCuentas());
        ClienteCuenta cc=admin.vincularClienteACuenta(solicitante,nuevoTitular,cuenta.getNumeroCuenta());
        if(cc==null){
          System.out.println(nuevoTitular.getNombre()+" "+nuevoTitular.getApellido()+" ya es titular de cuenta "+cuenta.getNumeroCuenta());
        }
        break;
      case 5:
    }


  }
  private static Cliente validarDni(String estado){
    Scanner teclado=new Scanner(System.in);
    String dni;
    do{
      System.out.print("DNI del "+estado+": ");
      dni=teclado.next();
      if(!dniValido(dni)){
        System.out.println("El DNI no es válido");
      }
    }while(!dniValido(dni));
    return Banco.buscarPersona(Banco.clientes,dni);
  }

  private static Cuenta buscarPorNroCuenta(ArrayList<ClienteCuenta> clienteCuentas){
    Scanner teclado=new Scanner(System.in);
    String nroCuenta;
    Cuenta cuenta;
    do{
      System.out.print("Ingresa el número de la cuenta: ");
      nroCuenta=teclado.nextLine();
      cuenta=Banco.buscarCuenta(clienteCuentas,nroCuenta);
      if(!numeroCuentaValida(nroCuenta)){
        System.out.println("El número de cuenta no es válido");
        continue;
      }
      if(cuenta==null){
        System.out.println("El número de cuenta no existe");
      }
    }while(!numeroCuentaValida(nroCuenta)||cuenta==null);
    return cuenta;
  }

  private static String ingresarNombre(String cargo){
    Scanner teclado=new Scanner(System.in);
    System.out.print("Nombre de pila del nuevo "+cargo+": ");
    String nombre=teclado.next();
    return nombre;
  }
  private static String ingresarApellido(String cargo){
    Scanner teclado=new Scanner(System.in);
    System.out.print("Apellido del nuevo "+cargo+": ");
    String apellido=teclado.next();
    return apellido;
  }
  private static String ingresarDni(String cargo){
    Scanner teclado=new Scanner(System.in);
    String dni;
    do{
      System.out.print("DNI del nuevo "+cargo+": ");
      dni=teclado.next();
      if(!dniValido(dni)){
        System.out.println("El DNI no es válido");
      }
      if(Banco.buscarPorDni(dni)!=null){
        System.out.println("El DNI ya está registrado");
      }
    }while(!dniValido(dni));
    return dni;
  }
  private static String ingresarDireccion(String cargo){
    Scanner teclado=new Scanner(System.in);
    System.out.print("Dirección del nuevo "+cargo+": ");
    String direccion=teclado.next();
    return direccion;
  }
  private static String ingresarNroTelefono(String cargo){
    Scanner teclado=new Scanner(System.in);
    String nroTelefono;
    do{
      System.out.print("Número de teléfono del nuevo "+cargo+": ");
      nroTelefono=teclado.next();
      if(!nroTelefonoValido(nroTelefono)){
        System.out.println("El número de télefono no es válido");
      }
    }while(!nroTelefonoValido(nroTelefono));
    return nroTelefono;
  }
  private static String ingresarCorreo(String cargo){
    Scanner teclado=new Scanner(System.in);
    String correo;
    do{
      System.out.print("Correo del nuevo "+cargo+": ");
      correo=teclado.next();
      if(!correoValido(correo)){
        System.out.println("El correo no es válido");
      }
    }while(!correoValido(correo));
    return correo;
  }
  private static String ingresarContrasena(String cargo){
    Scanner teclado=new Scanner(System.in);
    String contrasena;
    do{
      System.out.print("Contraseña del nuevo "+cargo+": ");
      contrasena=teclado.next();
      if(!contrasenaValida(contrasena)){
        System.out.println("La contraseña debe tener mínimo 6 caracteres");
      }
    }while(!contrasenaValida(contrasena));
    return contrasena;
  }

  private static TipoCargo ingresarTipoDeCargo(String cargo) {
    Scanner teclado = new Scanner(System.in);
    TipoCargo tipoCargo = null;
    String entrada;
    do {
      System.out.print("Tipo de cargo del nuevo " + cargo + " (");
      for (TipoCargo t : TipoCargo.values()) {
        System.out.print(t.name() + " ");
      }
      System.out.print("): ");

      entrada = teclado.next().toUpperCase();

      if (tipoDeCargoValido(entrada)) {
        tipoCargo = TipoCargo.valueOf(entrada);
      } else {
        System.out.println("Tipo de cargo inválido. Intente nuevamente.");
      }
    } while (tipoCargo == null);
    return tipoCargo;
  }

  private static boolean numeroCuentaValida(String numeroCuenta) {
    return numeroCuenta.matches("^\\d{6}$");
  }


  private static boolean tipoDeCargoValido(String entrada) {
    for (TipoCargo t : TipoCargo.values()) {
      if (t.name().equals(entrada)) {
        return true;
      }
    }
    return false;
  }
  private static boolean contrasenaValida(String contrasena) {
    return contrasena.length() >= 6;
  }

  private static boolean correoValido(String correo) {
    return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
  }

  private static boolean nroTelefonoValido(String telefono) {
    return telefono.matches("^9\\d{8}$");
  }
  private static boolean dniValido(String dni) {
    return dni.matches("\\d{8}");
  }
}
