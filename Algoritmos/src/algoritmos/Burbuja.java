package algoritmos;

public class Burbuja {
  public static int[] ordenarBurbuja(int[]lista){
    for(int i=0;i<lista.length;i++){
      for(int j=0;j<lista.length-i-1;j++){
        if(lista[j]>lista[j+1]){
          int temp=lista[j];
          lista[j]=lista[j+1];
          lista[j+1]=temp;
        }
      }
    }
    return lista;
  }
  public static void main(String[] args) {
    int[]lista={15, 10, 18, 12, 20, 8, 11, 14, 19, 13};
    for(int li:ordenarBurbuja(lista)){
      System.out.print(li+" ");
    }
  }
}
