package teoria;

public class Invertir {
	public static void main(String[] args) {
		int list[]= {12,20,18,19};
		int sum=0;
		for(int l:list) {
			sum+=l;
		}
		double prom=sum*1.0/list.length;
		System.out.println(prom);
		int encima=0, debajo=0;
		for(int j:list) {
			if(j>=prom) {
				encima++;
			}else {
				debajo++;
			}
		}
		System.out.println(encima+" alumnos por encima del promedio y "+debajo+" por debajo");
		
		
		
	}

}
