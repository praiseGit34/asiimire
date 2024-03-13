package Assignment;

import java.util.Scanner;

public class Membership {
    public String RegNo;
    public int printReg(){
        System.out.println("the reg no entered is : "+RegNo);
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the regno ");
        String regNo=scan.nextLine();
        Membership member=new Membership();
        member.printReg();
       
    }
    
}
