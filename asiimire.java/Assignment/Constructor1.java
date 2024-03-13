package Assignment;
import java.util.Scanner;

public class Constructor1 {
    public static String name;
    public  int age;
    private String status;
    Constructor1(){}
 public static void main(String[] args) {
    Constructor1 C=new Constructor1();
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the name of the sudent");
    name=scan.next();
    System.out.println("enter the age");
    C.age=scan.nextInt();
    System.out.println("enter the status");
    C.status=scan.next();
    System.out.println("the name entered is :"+Constructor1.name);
    System.out.println("the age is:"+C.age);
    System.out.println("the status is: "+C.status);
scan.close();
 }   
}
