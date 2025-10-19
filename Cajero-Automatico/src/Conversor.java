import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
  public static void main(String[] args) {
    System.out.println("Bienvenido al conversor de moneda\n" +
        "Por favor, introduzca una cantidad en soles y el programa le devolverá la conversión en US doláres");
    Scanner teclado=new Scanner(System.in);
    BigDecimal soles=teclado.nextBigDecimal();
    BigDecimal tasaDeCambio=new BigDecimal("0.29");
    BigDecimal dolares=soles.multiply(tasaDeCambio);
    System.out.println("S/."+soles+" equivalen a $"+dolares);
  }
}
