package teoria;

public class Modificable {
	public static int cantidad(String str) {
		int a=str.length()-str.replace("a", "").length();
		int e=str.length()-str.replace("e", "").length();
		int i=str.length()-str.replace("i", "").length();
		int o=str.length()-str.replace("o", "").length();
		int u=str.length()-str.replace("u", "").length();
		int vocales[]= {a,e,i,o,u};
		int max=vocales[0];
		for(int k=0;k<vocales.length;k++) {
			if(vocales[k]>=max) {
				max=vocales[k];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(cantidad("supercalifragilisticoespialidoso"));
	}

}
