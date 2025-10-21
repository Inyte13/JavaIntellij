package herencia;

public class Personaje {
  private int puntosDeVida=100;
  private int posicionX=0;
  private int posicionY=0;

  public Personaje(int posicionY, int posicionX) {
    this.posicionY = posicionY;
    this.posicionX = posicionX;
  }

  public void recibirDano(int ptos){
    puntosDeVida-=ptos;
  }
  public void moverALaDerecha(int unidades){
    posicionX+=unidades;
  }
  public void moverALaIzquierda(int unidades){
    posicionX-=unidades;
  }
  public void emitirSonidoDeDolor(){
    System.out.println("¡Auch!");
  }


  public int getPuntosDeVida() {
    return puntosDeVida;
  }

  public void setPuntosDeVida(int puntosDeVida) {
    this.puntosDeVida = puntosDeVida;
  }

  public int getPosicionX() {
    return posicionX;
  }

  public void setPosicionX(int posicionX) {
    this.posicionX = posicionX;
  }

  public int getPosicionY() {
    return posicionY;
  }

  public void setPosicionY(int posicionY) {
    this.posicionY = posicionY;
  }

}
