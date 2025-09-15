package algoritmos;

public class BoyerMoore {
  public static int boyerMoore(int[]list){
    int elemento=0;
    int count=0;
    for(int li:list){
      if(count==0){
        elemento=li;
        count=1;
      }else if(li==elemento){
        count+=1;        
      }else{
        count-=1;
      }
    }
    int count2=0;
    for(int li2:list){
      if(li2==elemento){
        count2+=1;
      }
    }
    if(count2>list.length/2){
      return elemento;
    }else{
      return -1;
    }
  }
  public static void main(String[] args) {
    int[]list={1,2,1,3,1};
    System.out.println(boyerMoore(list));    
  }
}
