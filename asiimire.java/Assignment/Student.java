package Assignment;

import java.util.Scanner;

public class Student {
    public static String course;
    public String name;
    public int regNo;
    //instance members will be accessed through objects and class members can be accessed by every mamber of the class
    
    public static void main(String[] args) {
        Student S=new Student();
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the course ");
        String course=scan.nextLine();
        System.out.println("enter the name");
        S.name=scan.nextLine();
        scan.nextLine();
        System.out.println("enter the regno");
       S.regNo=scan.nextInt();
    
        System.out.println( "the student is doing: "+course);
        System.out.println("the name of the student is: "+S.name);
        System.out.println("the regno is :"+S.regNo);
        Student T=new Student();
        T.name="praise";
        System.out.println(T.name);
    }
    
}
