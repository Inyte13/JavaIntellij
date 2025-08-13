package package1;

public class OperacionesAvanzadas extends Operaciones{ // OperacionesAvanzadas hereda todo de Operaciones
	public OperacionesAvanzadas(int num1, int num2) {
		super(num1, num2); // Para inicializar las variables heredadas
	}
	public int multiplicar() {
		return getNum1()*getNum2();
	}
	@Override
	public double dividir() {
		if(getNum2()!=0) return getNum1()/getNum2();
		else{
			System.out.println("No se puede dividir entre 0");
			return 0;}
	}
	public double dividirP() {
		return super.dividir();
	}
}
