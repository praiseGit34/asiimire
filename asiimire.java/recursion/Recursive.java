package recursion;

import java.util.Scanner;

public class Recursive {
    public void printResults(int n){
       
        if ( n==10){
            System.out.println("your mark is good");
        }else{
            System.out.println("try again");
            n--;
            printResults(n);
        }
    }
    public static void main(String[] args) {
       Recursive R=new Recursive();
       Scanner scan= new Scanner(System.in);
       System.out.println("enter the mark");
       int  mark=scan.nextInt();
        R.printResults(mark); 
    }

}
