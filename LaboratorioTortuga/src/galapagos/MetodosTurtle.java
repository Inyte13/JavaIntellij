package galapagos;
import java.awt.*;

public class MetodosTurtle {
	public static void main(String[] args) {
		Turtle t = new Turtle();

		// Movimiento
		t.forward(100);             // Avanza 100 unidades hacia adelante.
		t.backup(50);               // Retrocede 50 unidades.
		t.move(30);                 // Igual que forward, mueve 30 unidades hacia adelante.
		t.turn(90);                 // Gira 90 grados a la derecha (o izquierda según el sistema).
		t.heading(180);             // Establece la dirección de la tortuga a 180 grados.
		t.jumpTo(200, 100);         // Salta a la posición (200, 100) sin dibujar.
		t.moveTo(300, 150);         // Se mueve (dibujando si el lápiz está abajo) a la posición (300, 150).

		// Lápiz (Pen)
		t.penUp();                  // Levanta el lápiz (no dibuja al moverse).
		t.penDown();                // Baja el lápiz (dibuja al moverse).
		t.penColor(Color.RED);      // Cambia el color del lápiz a rojo.
		t.penSize(3);               // Establece el grosor del lápiz a 3 píxeles.

		// Apariencia del cuerpo
		t.bodyColor(Color.GREEN);   // Cambia el color del cuerpo de la tortuga a verde..

		t.hide();                   // Oculta la tortuga.
		t.show();                   // Muestra la tortuga.

		// Funciones adicionales
		t.print("Hola");            // Imprime el mensaje "Hola" en la posición actual.
		t.pause();                  // Detiene momentáneamente el movimiento de la tortuga.
		t.speed(5);                 // Cambia la velocidad de movimiento de la tortuga.
		t.init();                   // Reinicia la tortuga a su estado inicial.
		t.start();                  // Inicia la tortuga en un hilo separado (hilo de ejecución).
		t.run();                    // Método llamado al iniciar el hilo (para Runnable).
	}}
