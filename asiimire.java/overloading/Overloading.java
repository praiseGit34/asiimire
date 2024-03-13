package overloading;


import java.util.Scanner;
public class Overloading {
  static int plusMethod(int x, int y) {
    return x + y;
  }
  
  static double plusMethod(double x, double y) {
    return x - y;
  }
  
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the value of a ");
    int a=scan.nextInt();
    scan.nextLine();
    System.out.println("enter the value of b");
    int b=scan.nextInt();
    int num1=plusMethod(a, b);
    System.out.println("the sum of a and b is:"+num1);
    // int myNum1 = plusMethodInt(8, 5);
    // double myNum2 = plusMethodDouble(4.3, 6.26);
    // System.out.println("int: " + myNum1);
    // System.out.println("double: " + myNum2);
  }
}
    

