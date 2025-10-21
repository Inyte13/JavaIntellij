package herencia;

public class Protagonista extends Personaje {
  private String name;
  private static final int UNIDADES_DE_SALTO=10;

  public Protagonista(String name, int posicionY, int posicionX) {
//  La superclase debe ir primero siempre
    super(posicionY, posicionX);
    this.name=name;
  }

  public void recibirCura(int ptos){
    setPuntosDeVida(getPuntosDeVida()+ptos);
  }
  public void saltar(){
    setPosicionY(getPosicionY()+UNIDADES_DE_SALTO);
  }
//Sobreescribiendo el metodo
  @Override
  public void emitirSonidoDeDolor(){
    System.out.println("¡Ay!");
  }
}
