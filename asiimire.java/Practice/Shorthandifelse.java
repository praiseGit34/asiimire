package Practice;
import java.util.Scanner;
public class Shorthandifelse {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter the value of m :");
        int num=r.nextInt();
        System.out.println("the value you have entered is :"+num);
       //short hand elseif
        String result=(num>=80)? "you have passed":"you have failed";
        System.out.println(result);
    }
    
}
