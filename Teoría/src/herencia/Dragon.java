package herencia;

public class Dragon extends Enemigo{
  private static final int PUNTOS_DE_DANO=80;
  public Dragon(int posicionY, int posicionX) {
    super(posicionY, posicionX);
  }

  @Override
  public int getPuntosDeDano() {
    return PUNTOS_DE_DANO;
  }

  @Override
  public void emitirSonidoDeDolor() {
    System.out.println("");
  }
}
