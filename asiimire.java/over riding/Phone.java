
import java.util.Scanner;

public class Phone {
  public static String name;
  public static int price;
  Phone(String name,int price){
   this.name=name;
   this.price=price;
  }
  protected  void sellPhone(){
   System.out.println("my phone is  "+this.name+"  and i bought it at shs: "+this.price);
  }
  public class Xphone extends Phone{
   public String serialNo;
   Xphone(String name,int price,String serialNo){
      super(name, price);
      this.serialNo=serialNo;
   }
   public void sellPhone(){
      super.sellPhone();
      System.out.println("the serial no  of my phone is :"+this.serialNo);
   }
  }
  public static void main(String[] args) {
   Phone P=new Phone("iphone", 6888);
    Xphone X=P. new Xphone("apple", 0500000000,"4r6444y");
    X.sellPhone();
   P.sellPhone();
   Phone r=new Phone(name,price);
   Scanner scan=new Scanner(System.in);
   System.out.println("enter the name of the phone");
   P.name=scan.nextLine();
   System.out.println("enter the price of the phone");
   P.price=scan.nextInt();
   r.sellPhone();
  }
}
