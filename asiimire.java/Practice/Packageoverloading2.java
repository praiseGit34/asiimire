package Practice;

 import java.util.Scanner;

public class Packageoverloading2 {
   
    public static int add( int a,int b){
        int sum=a+b;
        System.out.println("sum= "+sum);
        return 0;
    }
    public static void enter( String fname  ,String lname ,String status ){
       System.out.println("the first name is :"+fname);
       System.out.println("the last name is:  "+lname);
       System.out.println("the Student number is : "+status);

    }
    public static void main(String[] args) {
       add( 5,7);
       Packageoverloading2 p=new Packageoverloading2();
       Scanner scan=new Scanner(System.in);
       System.out.println("enter your first name");
       String fname=scan.next();
       System.out.println("enter your last name");
       String lname=scan.next();
       scan.nextLine();
       System.out.println("enter you student  status");
       String status=scan.nextLine();
       //enter(f);
       
       Packageoverloading2.enter(fname,lname,status);
       
    }
    
}


