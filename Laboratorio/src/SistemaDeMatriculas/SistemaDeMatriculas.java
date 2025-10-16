package SistemaDeMatriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeMatriculas {
  ArrayList<Alumno> alumnos=new ArrayList<>();
  ArrayList<Curso> cursos=new ArrayList<>();
  ArrayList<Matricula> matriculas=new ArrayList<>();
  public void agregarAlumno(){
    Scanner teclado=new Scanner(System.in);
    System.out.print("Ingrese el código del alumno: ");
    int codigo=teclado.nextInt();
    teclado.nextLine();
    System.out.print("Ingrese sus nombres del alumno: ");
    String nombre=teclado.nextLine();
    System.out.print("Ingrese sus apellidos del alumno: ");
    String apellido=teclado.nextLine();
    Alumno alu=new Alumno(codigo,nombre,apellido);
    alumnos.add(alu);
  }
  public void agregarCurso(){
    Scanner teclado=new Scanner(System.in);
    System.out.print("Ingrese el código del curso: ");
    int codigo=teclado.nextInt();
    teclado.nextLine();
    System.out.print("Ingrese el nombre del curso: ");
    String nombre=teclado.nextLine();
    System.out.print("Ingrese el precio del curso: ");
    double precio=teclado.nextDouble();
    teclado.nextLine();
    Curso curso=new Curso(codigo,nombre,precio);
    cursos.add(curso);
  }
  public void matricular(){
    Scanner teclado=new Scanner(System.in);
    System.out.print("Ingrese el codigo del alumno: ");
    int codAlu=teclado.nextInt();
    System.out.print("Ingrese el codigo del curso: ");
    int codCurso=teclado.nextInt();
    System.out.print("Ingrese el codigo de la matricula: ");
    int codMatri=teclado.nextInt();
    Matricula matricula=new Matricula(codMatri,codAlu,codCurso);
    matriculas.add(matricula);
  }
  public Alumno buscarAlu(int codigo){
    for(Alumno alu:alumnos){
      if(alu.getCodigo()==codigo){
        return alu;
      }
    }
    return null;
  }
  public void buscarMatri(int codigo){
    for(Matricula matri:matriculas){
      if(matri.getCodMatri()==codigo){
        for(Alumno alu:alumnos){
          if(alu.getCodigo()== matri.getCodAlu()){
            System.out.println(alu);
          }
        }
        for(Curso curso:cursos){
          if(curso.getCodigo()==matri.getCodCurso()){
            System.out.println(curso.getNombre());
          }
          
        }
      }
    }
  }
  public double montoTotal(){
    double suma=0;
    for(Matricula matri:matriculas){
      for(Curso curso:cursos){
        if(matri.getCodCurso()==curso.getCodigo()){
          suma+=curso.getPrecio();
        }
      }
    }
    return suma;
  }
}
