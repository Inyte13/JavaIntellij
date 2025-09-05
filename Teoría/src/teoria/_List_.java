package teoria;

public class _List_ {
			
	public static void main(String[] args) {
		
	}
	public static void max(int list[]) {
		int max=list[0], indice=0; // Inicializamos variables
		for(int i=0;i<list.length;i++) {
			if(list[i]>max) { // Si el list iterado es mayor que el primer valor
				max=list[i]; // Se convierte en el nuevo max
				indice=i; // Y se guarda el índice
			}
		} 
		System.out.println("La mayor frecuencia es "+indice+" con "+max);
	}
	
	public static void min(int list[]) { 
		int min=list[0], indice=0; // Inicializamos variables
		for(int i=0;i<list.length;i++) { 
			if(list[i]<min) { // Si el list iterado es menor que el primer valor
				min=list[i]; // Se convierte en el nuevo min
				indice=i; // Y se guarda el índice
			}
		}
		System.out.println("La menor frecuencia es "+indice+" con "+min);
	}
	
	public static void histograma(int list[]) { // Método histograma
		for(int i=0;i<list.length;i++) { 
			System.out.print("Nota "+i+": "); // Informamos la nota que es
			for(int k=0;k<list[i];k++) {
				System.out.print("*"); // Se repetira list[i] veces
			}
			System.out.println(); // Enter
		}
	}

}





