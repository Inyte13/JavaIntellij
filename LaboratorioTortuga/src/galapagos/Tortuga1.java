//Laboratorio Nro 13 - Ejercicio8
//Autor: Luis Alberto García Daza
//Colaboró:
//Tiempo: 2:00
package galapagos;
public class Tortuga1 {
	public static void main(String[] args) {
		Turtle t = new Turtle(); // Crea tortuga
		t.speed(1000); // Velocidad máxima
		int u=0;
		for (int z=1;z<=3;z++) { //Primer patrón girando a la izq
			t.jumpTo(0,0); //Vuelve al centro
			t.heading(0); 
			t.turn(180+u); //Nueva dirección
			u+=45;
			for (int c=1;c<=3;c++) {
				t.move(25); //Avanza 25
				t.turn(-45); //Gira 45 izq
				t.move(25); //Avanza 25
				t.turn(180); //Gira 180
				t.move(25); //Avanza 25
				t.turn(-135);} //Gira 135 izq
			t.move(25);}
		u=0;
		for (int z=1;z<=3;z++) { //Segundo patrón girando a la izq
			t.jumpTo(0,0);
			t.heading(0);
			t.turn(180+u);
			u+=45;
			for (int c=1;c<=3;c++) { 
				t.move(25); //Avanza 25
				t.turn(45); //Gira 45 
				t.move(25); //Avanza 25
				t.turn(180); //Gira 180
				t.move(25); //Avanza 25
				t.turn(135);} //Gira 135
			t.move(25);}}}


