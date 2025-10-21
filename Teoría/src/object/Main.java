package object;

public class Main {
  public static void main(String[] args) {
    Animal perro1=new Animal("Canis lupus",4);
    Animal perro2=new Animal("Canis lupus",4);
    Animal gato=new Animal("Felis silvestris",4);
    perro1.equals(perro2); // Solo devuelve true, si son exactamente el mismo, no solo iguales
    System.out.println(perro1.hashCode()); // El identificador del objeto
  }
}
