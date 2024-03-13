package Practice;
import java.util.Scanner;

public class Case {
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the score");
        int score= scan.nextInt();
        System.out.println("enter the score two");
        int score2= scan.nextInt();
     //   int score =70;
        switch (score){
            case 90-100:{
                System.out.println(" you have an A+");
                break;
            }
            case 80-89:{
                System.out.println("you have an A");
                break;
            }
            case 70-75:{
                System.out.println("you have  a B+");
                break;
            }
            case 70:{
                System.out.println("you have a B");
                break;
            }
            case 60-68:{
                System.out.println("you have a C");
                break;
            }//wenever the above conditions are not met the default ststement is called
            default:{
                System.out.println("you have just passed");
                break;
            }
            
           
        }
        
    }

}
