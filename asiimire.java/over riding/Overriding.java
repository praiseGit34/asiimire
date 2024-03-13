package Assignment;

public class Overriding {
    public  String name;
    public double amount;
    protected void getRide(){
        System.out.println("the name is "+name);
        System.out.println("the amount is :"+amount);
    } 
class Monthly extends Overriding{
    public String  id;
    public void getRide(){
        
    }
}  
}
