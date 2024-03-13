import java.util.Scanner;

class Staff extends Student {
    public int salary;

    void printPerson(){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the name");
        name=scan.nextLine();
        scan.nextLine();
        System.out.println("enter the age");
        age=scan.nextInt();
        System.out.println("enter the salary");
        salary=scan.nextInt();
        System.out.println("the name of the : "+name);
        System.out.println("the age is  :"+age);
        System.out.println("the salary is  :"+salary);

    }
}
