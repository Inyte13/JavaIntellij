package laboratorio;

import java.util.Scanner;

public class Lista {
  private int nums[];
  public Lista(int n){
    nums=new int[n];
  }
	public void agregar() {
    Scanner teclado=new Scanner(System.in);
		for(int i=0;i<nums.length;i++) {
			System.out.print("Ingrese un número en el índice "+i+": ");
			nums[i]=teclado.nextInt();
		}
	}
	public int masRepetido() {
    int count=0,elemento=0;
		for(int num:nums) {
      if(count==0){
        elemento=num;
        count=1;
      }else if(num==elemento){
        count+=1;
      }else{
        count-=1;
      }
		}
    return elemento;
	}
  public boolean mayorMitad(int elemento){
    int count=0;
    for(int num:nums){
      if(num==elemento){
        count+=1;
      }
    }
    return count>nums.length/2;
  }
  public int[] getNums(){
    return nums;
  }
}

