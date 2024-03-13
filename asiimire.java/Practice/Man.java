package Practice;
import java.util.Scanner;

public class Man {
    public static String name;
    private static int age;
    Man(String name,int age){
        this.name=name;
        this.age=age;
    }
    public  static int printMan(){
        Man M=new Man(name,age);
        System.out.println("the name of the man is: ");
        System.out.println("the man is "+M.age+"years");
        return 0;
    }
    public class Female extends Man{
        public static int children;
        Female(String name,int age,int children){
            super(name, age);
            this.children=children;
        }
      
        public static int printMan(){
            Female F=Man.new Female(name, age, children);
            System.out.println("the chidren of the female are: "+F.children);
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the name");
        String name=scan.nextLine();
        scan.nextLine();
        System.out.println("enter the age");
        int age=scan.nextInt();
        System.out.println("enter the number of children");
        int children =scan.nextInt();
       
        Man M=new Man(name, age);
        Female F= M.new Female(name, age, children);
        F.printMan();
        scan.close();
    }
    
}
