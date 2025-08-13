package package1;

public class Operaciones {
	// Atributos privados
	private int num1, num2;
	// Getters and Setters
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		if(num1>0) this.num1=num1;
		else System.out.println("El primer número debe ser mayor que 0");
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		if(num2>=1) this.num2=num2;
		else System.out.println("El segundo número debe ser mayor o igual que 1");
	}
	// Constructor
	public Operaciones(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
	}
	// Métodos
	public int suma() {
		return num1+num2;
	}
	public boolean esPar() {
		return num1%2==0;
	}
	public void mostrarNumerosHasta() {
		System.out.println("Números hasta "+num2+":");
		for(int i=1;i<=num2;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public double dividir() {
		if(getNum2()!=0) return (double)getNum1()/getNum2();
		else{
			System.out.println("No se puede dividir entre 0");
			return 0;}
	}
}


