import java.util.Scanner;

import Practice.Payment;

public class Payment {
    String workerName;
    static int rate=50;
    int number_of_days;
    //private static Payment[] Payment;
    Payment(String W,int days){
        workerName=W;
        number_of_days=days;
    }
    public void printWorkerDetails(){
        System.out.println("the worker name is: "+this.workerName);
        System.out.println("the number of days: "+this.number_of_days);
        System.out.println("your payment is shs: "+this.number_of_days*rate);
    }
   public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("enter the number of workers");
    int m =scan.nextInt();
    Payment [] P=new Payment[m];
    for(int n=0;n<m;n++){
        System.out.println("enter the name of the worker");
        scan.nextLine();
        String name=scan.nextLine();
        
        System.out.println("enter the number of days");
        int number_of_days=scan.nextInt();
        P [n] =new Payment(name,number_of_days);
    }
       System.out.println("worker's information");
       for(Payment pay:P){
        pay.printWorkerDetails();
       }
        
    }}