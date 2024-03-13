package Assignment;

public class Constructoroverloading {
    public String name;
    public int age;
    public int contact;
    Constructoroverloading(String name,int age,int contact){
        this.name=name;
        this.age=age;
        this.contact=contact;
    }
    Constructoroverloading(String name,int age ){
        this.name=name;
        this.age=age;
    }
    Constructoroverloading(){
        age=50;
    
    }
    // public class Cons extends Constructoroverloading{
    //     public static String course;
    //     public double salary;
    //    Cons(String name,int age, String course,double salary){
    //         super(name, age);
    //         course=course;
    //         this.salary=salary; 
    //     }
    // }

   public static void main(String[] args ) {
    Constructoroverloading C=new Constructoroverloading("praise",40,0444764);
    System.out.println("the name is: "+C.name);
    System.out.println("she is : "+C.age+   "years");
    System.out.println("contact her on   "+C.contact);
    Constructoroverloading Y=new Constructoroverloading("pearl",45);
    System.out.println("the name is: "+Y.name);
    System.out.println("she is : "+Y.age+   "years");
    Constructoroverloading g=new Constructoroverloading();
    System.out.println("thea age is "+g.age);
   } 
}
