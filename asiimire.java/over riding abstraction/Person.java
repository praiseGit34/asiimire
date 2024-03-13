import java.util.Scanner;

abstract class Person {
    public String name;
    public int age;
    public static void getDetails(){
        System.out.println("you are good");
    }
    void printPerson(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the name");
        name=scan.nextLine();
        scan.nextLine();
        System.out.println("enter the age");
        age=scan.nextInt();
        System.out.println("the name is"+name);
        System.out.println("this person is "+age+"years old");
    }
}
