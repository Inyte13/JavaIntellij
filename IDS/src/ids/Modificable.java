package ids;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Modificable {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		List<Ticket> listTicket=new ArrayList<Ticket>(); // List padre de ArrayList
		Ticket ticket1=new Ticket(12,2,5,1500,new Date(),new Date());
		Ticket ticket2=new Ticket();
		ticket2.setNumero(13);
		ticket2.setAsiento(4);
		ticket2.setFila(3);
		ticket2.setPrecio(2000);
		ticket2.setDateCompra(new Date());
		ticket2.setDateValidez(new Date());
		listTicket.add(ticket1);
		listTicket.add(ticket2);
		Ticket ticket3=new Ticket(12,100,200,3000,new Date(2025-8-25),new Date());
		double sumaPrecios=0;
		for(Ticket tick:listTicket) {
			sumaPrecios+=tick.getPrecio();
		}
		System.out.println("La suma de los precios son "+sumaPrecios);
		System.out.print("Ingrese la fila para ver todo los tickets: ");
		int filaSelect=teclado.nextInt();
		boolean bandera=false;
		for(Ticket tick:listTicket) {
			if(tick.getFila()==filaSelect) {
				System.out.println(tick.toString());
				bandera=true;
			}
		}
		if(bandera==false) {
			System.out.println("No se encontraron tickets para la fila "+filaSelect);
		}
		Cliente cli1=new Cliente();
		cli1.setId(1234);
		cli1.setDni(2894529);
		cli1.setNombre("Luis");
		cli1.setApellido("García");
		cli1.getListaTicket().add(ticket1);
		cli1.getListaTicket().add(ticket3);
	}
}
