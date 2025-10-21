package herencia;

public class Nivel {
  public static void main(String[] args) {
    Personaje enemigo=new Personaje(10,0);
    Protagonista prota=new Protagonista("Oriana",0,0);
    prota.emitirSonidoDeDolor();
  }
}
