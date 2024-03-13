package Assignment;
import java.util.Scanner;

public class Car {
    String Name;
    static Double amount;
    static String colour;
    static String owner;
    static String plateno;//constructor
    private static String name;
    Car(String name ,Double A ,String C ,String owner ,String no){
        this.Name=name;
        this.amount=A;
        this.colour=C;
        this.owner =owner;
        this.plateno=no;  
    }

    public static void main (String args []){
        Scanner scan=new Scanner(System.in);
        Car car=new Car(name,amount,colour,owner,plateno);
        System.out.println("enter the name of the car");
        //String name=scan.next();
        car.name=scan.next();

        System.out.println("enter the price of the car");
        car.amount=scan.nextDouble();

        System.out.println("enter the colour of the car");
        car.colour=scan.next();
        
        System.out.println("enter the owner of the car");
        car.owner=scan.next();

        System.out.println("enter the plateno of the car");
        car.plateno=scan.next();

        System.out.println("the car is "+name);
        System.out.println("the price of the car is "+amount);
        System.out.println("the color of the car is "+colour);
        System.out.println("the owner of the car is "+owner);
        System.out.println("the plateno is "+plateno);






    
    }

    
}
