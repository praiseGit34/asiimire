package Assignment;
import java.util.Scanner;
public class University{
    public String College;
    public  String Name;
    public double Student;
    University(int c,String N ,double s){
        this.College=College;
        this.Student=Student;
        this.Name=Name;
    }
   
    public static void main(String[] args) {
        University uni=new University(0, null, 0);
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the college" );
        uni.College=scan.nextLine();
        scan.nextLine();
        System.out.println("enter the name");
        uni.Name=scan.next();
        scan.nextLine();
        System.out.println("enter the student");
        uni.Student=scan.nextDouble();
        // System.out.println( mak.College);
        // System.out.println(mak.Name);
        // System.out.println(mak.Student);
        System.out.println("the college entered is : "+uni.College);
        System.out.println("the name entered is : "+uni.Name);
        System.out.println("the student entered is : "+uni.Student);
        
        
    }

}

