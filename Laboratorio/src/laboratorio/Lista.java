package laboratorio;

import java.util.*;

public class Lista {
  private String[]nombres=new String[8];
  private String[]condiciones=new String[8];
  private double[]notas=new double[8];

  public void agregarNombres() {
    Scanner teclado=new Scanner(System.in);
    for (int i=0;i<nombres.length;i++) {
      System.out.print("Ingrese el nombre "+(i+1)+": ");
      nombres[i]=teclado.next();
    }
  }
  public void agregarNotas() {
    Scanner teclado=new Scanner(System.in);
    for(int i=0;i<notas.length;i++){
      System.out.print("Ingrese las nota "+(i+1)+": ");
      double nota=teclado.nextDouble();
      if(0<=nota&&nota<=10){
        notas[i]=nota;
        condiciones[i]=agregarCondicion(nota);
      }else{
        System.out.println("Nota inválida (0-10)");
        i--;
      }
    }
  }
  public String agregarCondicion(double nota){
    if(nota<5){
      return "Suspenso";
    }else if(nota<7){
      return "Bien";}
    else if(nota<9) {
      return "Notable";
    }else{
      return "Sobresaliente";
    }
  }
  public String alumnoNotaMasBaja(){
    double min=notas[0];
    int indiceMin=0;
    for(int i=0;i<notas.length;i++){
      if(notas[i]<min){
        indiceMin=i;
        min=notas[i];
      }
    }
    return nombres[indiceMin];
  }
  public String alumnoNotaMasAlta(){
    double max=notas[0];
    int indiceMax=0;
    for(int i=0;i<notas.length;i++){
      if(notas[i]>max){
        indiceMax=i;
        max=notas[i];
      }
    }
    return nombres[indiceMax];
  }
  public double notaAlumno(String alumno){
    for(int i=0;i<notas.length;i++) {
      if (nombres[i].equalsIgnoreCase(alumno)) {
        return notas[i];
      }
    }
    return -1;
  }
  @Override
  public String toString() {
    return "Lista{" +
            "nombres=" + Arrays.toString(nombres) +
            ", condiciones=" + Arrays.toString(condiciones) +
            ", notas=" + Arrays.toString(notas) +
            '}';
  }
}

