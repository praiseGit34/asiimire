package Practice;
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner mine=new Scanner(System.in);
        System.out.println("enter the value of x");
        double x=mine.nextDouble();
        System.out.println("enter the value of y");
        int y=mine.nextInt();
        if(x==80){
            x+=2;
            System.out.println(x);
            
        }else{
            if(x<=y)
            System.out.println("this is not the answer");
        
    }   
}
}
