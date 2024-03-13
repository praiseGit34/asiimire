import java.util.Scanner;

public class Student{
     String name;
    int studNo;
    Student(String N,int t){
        name=N;
        studNo=t;
    }
    public void printDetails(){
        System.out.println("my name is: "  +this.name+  " and my student number is: "+this.studNo);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of students");
        int n=scan.nextInt();
        Student [] S=new Student[n];
        for(int i =0; i<n;i++){
            System.out.println("enter the name of the student");
            scan.nextLine();
             String name=scan.nextLine();
            System.out.println("enter the student number");
            int  studNo=scan.nextInt();
            S[i]=new Student(name, studNo);
        }
        System.out.println("\t the students information");
        for(Student M:S){
            M.printDetails();
        }
}}