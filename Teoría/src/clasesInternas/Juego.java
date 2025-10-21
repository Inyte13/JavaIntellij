package clasesInternas;

public class Juego {
  private int numeroJugadores;
  private int puntuacion=0;

  public Juego(int numeroJugadores) {
    this.numeroJugadores = numeroJugadores;
  }

  public int getPuntuacion() {
    return puntuacion;
  }
//  El Contador no tiene sentido sin el Juego, por eso va dentro
  public class Contador{
    public void incrementarPuntuacion(int puntos){
      puntuacion+=puntos;
    }
    public void decrementarPuntuacion(int puntos){
      puntuacion-=puntos;
    }
  }
}
