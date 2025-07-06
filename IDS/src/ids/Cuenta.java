package ids;

public class Cuenta {
	String titular;
	double saldo;
	public Cuenta(String titular, double saldo) { // Constructor con atributos
		this.titular=titular;
		this.saldo=saldo;}
	
	public String getTitular() { // Getters y Setters
		return titular;}
	public double getSaldo() {
		return saldo;}
	public void setTitular(String titular) {
		this.titular=titular;}
	public void setSaldo(double saldo) {
		this.saldo=saldo;}
	
	public boolean esPremium() { // Método esPremium
		return saldo>=50000;}
	public void depositar(double n) { // Método depositar
		saldo+=n;}
	public void retirar(double n) { // Método retirar
		if(saldo>=n) saldo-=n;}
	public void verSaldo() { // Método verSaldo
		System.out.println("Saldo: S/"+saldo);}
	public static void main(String[] args) { // Main
		Cuenta c1=new Cuenta("luisg",1000); // Creamos nuestra cuenta
		c1.verSaldo();
		c1.depositar(2000);
		c1.verSaldo();
		c1.retirar(75);
		c1.verSaldo();
		System.out.println(c1.esPremium());}}
