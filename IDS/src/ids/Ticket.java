package ids;

import java.util.Date;

public class Ticket {
	private int numero, asiento, fila;
	private double precio;
	private Date dateCompra, dateValidez;
	public Ticket(int numero, int asiento, int fila, double precio, Date dateCompra, Date dateValidez) {
		this.numero = numero;
		this.asiento = asiento;
		this.fila = fila;
		this.precio = precio;
		this.dateCompra = dateCompra;
		this.dateValidez = dateValidez;
	}
	public Ticket() {}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Date getDateCompra() {
		return dateCompra;
	}
	public void setDateCompra(Date dateCompra) {
		this.dateCompra = dateCompra;
	}
	public Date getDateValidez() {
		return dateValidez;
	}
	public void setDateValidez(Date dateValidez) {
		this.dateValidez = dateValidez;
	}
	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", asiento=" + asiento + ", fila=" + fila + ", precio=" + precio
				+ ", dateCompra=" + dateCompra + ", dateValidez=" + dateValidez + "]";
	}
	
	
	

}
