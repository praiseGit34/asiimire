package overloading;
import java.util.Scanner;

public class Customer {
    public  static String name;
    public static int age;
    Customer(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int add(int a,int b){
        System.out.println("the sum is:"+(a+b));
        return a+b;
    }
    public int add(){                                                                                
        System.out.println("the name is"+this.name);
        return 0;
    }
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
    //  System.out.println("enter the name of the customer");
    //  String name=scan.nextLine();
    //  System.out.println("enter the age");
    //  int age=scan.nextInt();
     Customer C=new Customer(name, age);
     
     System.out.println("enter the value of a");
     int a=scan.nextInt();
     System.out.println("enter the value of b");
     int b=scan.nextInt();
     scan.nextLine();
     System.out.println("enter the name ");
     String name=scan.nextLine();
     scan.close();
     C.add();//constructor overloading
     C.add(a, b);//constructor overloading
    }
    
}
