package laboratorio;

import java.util.Scanner;

public class Alumno {
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
      System.out.print("Ingrese las notas: ");
      double nota=teclado.nextDouble();
      if(0<=nota&&nota<=10){
        notas[i]=nota;
        condiciones[i]=agregarCondicion(nota);
      }else{
        System.out.println("Nota inválida");
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
}

