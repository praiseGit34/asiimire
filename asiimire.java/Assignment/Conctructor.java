package Assignment;

public class Conctructor {
    public String name;
    public int age;
    Conctructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    public class Tructor extends Conctructor{
       
        public String status;
         Tructor(String name,int age,String status){
             super(name,age);
             this.status=status;   
         }
    }
    public static void main(String[] args) {
        
    }
    
}
