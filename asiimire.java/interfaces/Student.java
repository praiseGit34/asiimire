package interfaces;
interface API3{
    static void showDetails(){
        System.out.println("java is good");
    }
    void printDetails(String name);
}
public class Student implements API3 {
    public void printDetails(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Student S=new Student();
        S.printDetails("praises");
        API3.showDetails();
    }
    
}
