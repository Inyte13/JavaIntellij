package ids;

import javax.swing.JOptionPane;

public class TryCatch {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingresa un número:");
        try {
            int numero = Integer.parseInt(input); // Puede lanzar NumberFormatException
            JOptionPane.showMessageDialog(null, "El número ingresado es: " + numero);} 
        catch (NumberFormatException e) {
            // Mostrar el mensaje breve de error en una ventana
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            // Mostrar más detalles del error en la consola (para el programador)
            System.out.println("Detalles técnicos del error:");
            e.printStackTrace();}}} // Esto imprime toda la traza del error en consola

