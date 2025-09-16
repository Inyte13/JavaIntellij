package InvertirArreglo;

import java.util.Random;

public class Arreglo {
  int[]nums;
  
  public void ordenInverso(){
    for(int i=0;i<nums.length/2;i++){ // Iteramos la mitad del arreglo
      int temp=nums[i]; // Guardamos en temp el primero valor
      nums[i]=nums[nums.length-i-1]; // El primer valor pasa a ser el último
      nums[nums.length-i-1]=temp; // El último valor pasa a ser el temp
    }
  }
  public void mostrarArreglo(){
    for(int num:nums){
      System.out.print(num+" ");
    }
    System.out.println();
  }
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
}
