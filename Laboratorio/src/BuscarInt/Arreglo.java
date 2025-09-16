package BuscarInt;

import java.util.Random;

public class Arreglo {
  int[]nums; // Referencio nums
  
  public void ingresarValores(){
    Random random=new Random();
    for(int i=0;i<nums.length;i++){
      nums[i]= random.nextInt(51); // Asigno un valor random [0,50>
    }
  }
  public boolean ingresarLongitud(int longitud){
    if(longitud<0){
      System.out.println("No se puede crear arreglos con tamaño negativo");
      return false;
    }
    nums=new int[longitud];
    return true;
  }
  public int busquedaSecuencial(int valor){
    for(int i=0;i<nums.length;i++){
      if(nums[i]==valor){
        return i;
      }
    }
    return -1;
  }
  public void mostrarArreglo(){
    for(int num:nums){
      System.out.print(num+" ");
    }
    System.out.println();
  }
}
