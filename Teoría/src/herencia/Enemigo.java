package herencia;

public class Enemigo extends Personaje{
  private static final int PUNTOS_DE_DANO=10;
  public Enemigo(int posicionY, int posicionX) {
    super(posicionY, posicionX);
  }
  public int getPuntosDeDano(){
    return PUNTOS_DE_DANO;
  }
  public void emitirSonidoDeFuria(){
    System.out.println("Grrr");
  }

}
