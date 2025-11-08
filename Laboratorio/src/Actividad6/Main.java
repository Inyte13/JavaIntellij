package Actividad6;

public class Main {
  public static void main(String[] args) {
    Banco banco = new Banco();
    // Super admin
    Administrador superAdmin=Administrador.registrarSuperAdmin(banco,"Luis","García","75608627","123","989045911","lgarciada@unsa.edu.pe");

    // Creando admins
    Administrador admin1=superAdmin.registrarAdmin(banco,"Oriana","del Pilar","12345678","456","948384940","ocutipa@unsa.edu.pe");

    Administrador admin2=superAdmin.registrarAdmin(banco,"Camila", "Flores", "23456781","789","932432849","cflaca@unsa.edu.pe");

    // Creando empleados
    Empleado emp1=admin1.registrarEmpleado("Lucía","Corrales","34567891","891","932483922","lcorrales@unsa.edu.pe",TipoCargo.ASESOR_FINANCIERO);

    Empleado emp2=admin2.registrarEmpleado("Mario","Luigi","43829389","389","943883921","mluigi@unsa.edu,pe",TipoCargo.ANALISTA_CREDITO);

    // Creando clientes
    Cliente cl1=emp1.registrarClientes("Anabel","Benito","48399392","389","983929038","abenito@unsa.edu.pe");

    Cliente cl2=emp2.registrarClientes("Estrella","Juarez","48992838","382","938382839","ejuarez@unsa.edu.pe");

    // Registrando cuentas
    emp1.registrarCuenta(cl1,TipoCuenta.AHORRO,4893.89);
    emp2.registrarCuenta(cl2,TipoCuenta.CORRIENTE);

    emp1.buscarCuenta()

    // Añadiendo titulares a una cuenta
    emp1.vincularClienteACuenta(cl1,cl2,"000001");

    cl1.buscarCuenta("000001").depositar(4329.433);
    cl1.mostrarCuentas();

  }
}
