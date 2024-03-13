package interfaces;
interface API{
 default void show(){
    System.out.println("Java is good");
 }
 interface API1 extends API{
    void display();
 }
 interface API2 extends API{
    void printDetails();
 }
}

class Test implements API {
   public  void display(){
    System.out.println("these are interfaces");
   }
   public void printDetails(){
    System.out.println("they allow multiple inheritance");
   }
   public static void main(String[] args) {
    Test T=new Test();
    T.show();
    T.display();
    T.printDetails();
   } 
}
