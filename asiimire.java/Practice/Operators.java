package Practice;
public class Operators {
    public static void main(String args[]){
        int a= 60;
        double myDouble=40.89;
        //casting a double to an integer
        int b=(int)myDouble;
        System.out.println("the value of b ="+b);
        //the use of operators (-=,*=,/=,++,--)
        int increment=b+=2;
        System.out.println("my increment of b is:"+b);
        int r=a&=7;
        System.out.println(r);
        //logical operators
       boolean y= a<3||a>4;
       System.out.println("the value of my boolean is:"+y);
    }
    
}
