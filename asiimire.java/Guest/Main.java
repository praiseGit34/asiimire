package Guest;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the name of the guest");
        String guestname=scan.next();
        scan.nextLine();
        System.out.println("enter the guest id");
        String guestId=scan.next();
        scan.nextLine();
        System.out.println("enter the number of days");
        Double days=scan.nextDouble();
        scan.nextLine();
        System.out.println("is the guest a resident or non resident (yes /no)");
        System.out.println("the guest is a :");
        String type =scan.nextLine();
        scan.nextLine();
        
        Guest g=new Guest(guestId,guestname, days);
        Resident r=new Resident( guestId,guestname, days);
        Non_Resident non=g.new Non_Resident(guestId,guestname);
        

         if(type=="resident"){
             System.out.println("the room fee per day is: ");
            int roomfeesperday=scan.nextInt();
           Resident res=new Resident(guestId, guestname,roomfeesperday);
          r.printDetails();
          g.printDetails();
        }
    
        else{
               System.out.println("enter the entrance fee");
               int entrancefee=scan.nextInt();
             
               g.printDetails();
        
            }

        }
    }



    



