package overloading;
import java.util.*;
public class Computer {
  public String type;
  public int size;
  protected void useComputer(){
    System.out.println("my computer is a " +type+ "  and is  " +size+ " in size");
  }
  public class Laptop extends Computer {
    public String name;
    public void useComputer(String name){
        super.useComputer();
        System.out.println("my computer is called "+name);
    }
  } 
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    Computer C=new Computer();
    Laptop L=C.new Laptop();
    System.out.println("enter the type of your computer");
    String type=scan.nextLine();
    System.out.println("enter the size of your computer");
    int size=scan.nextInt();
    L.useComputer("praise");
  }
}
