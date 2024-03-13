package Practice;
import java.util.Scanner;

abstract class Peer {
    public String name;
    public int age;
    void peer(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void printPeer(){}

    
    public class Peerson extends Peer{
        public  double salary;
        public Peerson(String name, int age) {
        
            this.salary=salary;
        }
        public  void printPeer(){
            System.out.println("the name of this peer : "+name);
            System.out.println("the peer is "+age+"years");
        }
    }
    public static void main (String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the name of the peer");
        String name=scan.nextLine();
        scan.nextLine();
        System.out.println("enter the age of the peer");
        int age=scan.nextInt();
        System.out.println("enter the salary of the peer");
        int salary=scan.nextInt();
        scan.close();
        Peerson peer=new Peerson(name,age,salary);

    }
}

