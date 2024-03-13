package Practice;
import java.util.Scanner;
public class Method {
    public static int add( int a,int b){
        int sum=a+b;
        System.out.println(" the sum of a and b: "+sum);
        return sum;
    }
    public static void enter( String fname  ,String lname ,String studentNo ){
       System.out.println("the first name is :"+fname);
       System.out.println("the last name is:  "+lname);
       System.out.println("the Student number is   :"+studentNo);

    }
    public static void main(String[] args) { 
       Scanner scan=new Scanner(System.in);
       System.out.println("enter your first name");
       String enter=scan.next();
       System.out.println("enter your last name");
       String L=scan.next();
       System.out.println("enter you student number");
       String s=scan.next();
       scan.nextLine();
       enter(enter, L, s);
       System.out.println("enter the value of a");
       int a=scan.nextInt();
       System.out.println("enter the value of b");
       int b=scan.nextInt();
       add(a, b);
       scan.close();
    
       
    }
    
}
