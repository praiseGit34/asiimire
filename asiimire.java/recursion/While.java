package recursion;
import java.util.Scanner;

public class While {
  public int stdNo;
  protected void getWhile( int stdNo){
  if(stdNo==18){
    System.out.println("this is the person i have looking for");
  }else{
    System.out.println("my serious student");
  }
  stdNo+=2;
  getWhile(stdNo);
  }
    public static void main(String args[]){
      Scanner scan =new Scanner(System.in);
      While S=new While();
      System.out.println("enter the stdNo");
      int stdNo=scan.nextInt();
      S.getWhile(stdNo);
      //   int a=18;
      //   while(a<=18){
      //       a++;
      //       System.out.println(a); 
           
      //     // continue;
      //   }
      //   System.out.println("--------------------------");
      //   int y=20;
      //   do{
      // System.out.println(y);
      // y+=2;
      //   }while(y<=30);
    }
    
}
