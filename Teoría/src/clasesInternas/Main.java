package clasesInternas;

public class Main {
  public static void main(String[] args) {
    Juego game=new Juego(4);
    Juego.Contador count=game.new Contador();
    System.out.println("Puntuación "+game.getPuntuacion());
    count.incrementarPuntuacion(400);
    System.out.println("Puntuación "+game.getPuntuacion());
  }
}
