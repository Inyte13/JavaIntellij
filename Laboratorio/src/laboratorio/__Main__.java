package laboratorio;

import java.util.Scanner;

public class __Main__ {
  public static void main(String[] args) {
    Alumno[] list =new Alumno[3];
    list[0]=new Alumno("Luis", 7.4);
    list[1]=new Alumno("Alexandra", 6.3);
    list[2]=new Alumno("Mafer", -18);
    for(Alumno al:list){
      System.out.println(al.toString());
    }


  }
}
