package Practice;

import java.util.*;
public class Triangle {
    public static void main(String args[]){
        // double x=3.190;
        // int m=60;
        // double z=Math.sqrt(x);
        // System.out.println("the value of z is" +z);
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the value the base");
        int base=scan.nextInt();
        System.out.println("enter the height");
        double height=scan.nextDouble();
        // System.out.println("enter the hypotenuse");
        // double hyp=scan.nextDouble();
        double hypotenuse=Math.sqrt((base*base)+(height*height));
        System.out.println("the value of the hypotenuse is :"+hypotenuse);
        
    }
}
