package herencia;

public class Orco extends Enemigo{
  public Orco(int posicionY, int posicionX) {
    super(posicionY, posicionX);
  }
//Podemos sobreescribir, aunque no sea el inmediatamente superior
  @Override
  public void emitirSonidoDeDolor() {
    System.out.println("¡Nooo!");
  }
}
