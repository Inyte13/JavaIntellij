package ids;

public class EjercicioArrays1D {
// Creamos el método generar
public static int[] generar(){
	int vector[]=new int[10]; // Inicializamos el arreglo "vector"
	for(int i=0;i<10;i++) { // Como sabemos que son 10, el bucle durará eso mismo
		vector[i]=(int)(Math.random()*20);} // Asignamos cada valor a cada posición
	return vector;}
// Creamos el método sumaArrays
public static int[] sumaArrays(int array1[], int array2[]) {
	int suma[]=new int[10]; // Inicializamos el arreglo "suma"
	for(int i=0;i<10;i++) { // Como sabemos que son 10, el bucle durará eso mismo 
		suma[i]=array1[i]+array2[i];} // Asignamos la suma usando dos arrays
	return suma;}
// Creamos el método imprimir
public static void imprimir(int a[], int b[], int c[]) {
	for(int i=0;i<a.length;i++) { // El bucle tendra la duración de los valores de a
		System.out.println(a[i]+"+"+b[i]+"="+c[i]);}} // Imprimimos
// Main 
public static void main(String[] args) {
	int x[]=generar(); // Generamos 10 notas y eso se convertirá en el array x
	int y[]=generar(); // Generamos 10 notas y eso se convertirá en el array y
	int z[]=sumaArrays(x,y); // Sumamos y se asigna a array z
	imprimir(x,y,z); // Se imprime 
}}

