package ReemplazarPorCero;

import java.util.Random;

public class Arreglo {
  int[]nums;
  
  public void ingresarValores(){
    Random random=new Random();
    for(int i=0;i<nums.length;i++){
      nums[i]= random.nextInt(51)-25; // Asigno un valor random [0,50>
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
  public void sustituirXCero(){
    for(int i=0;i<nums.length;i++){
      if(nums[i]<0){
        nums[i]=0;
      }
    }
  }
  public void mostrarArreglo(){
    for(int num:nums){
      System.out.print(num+" ");
    }
    System.out.println();
  }
}
