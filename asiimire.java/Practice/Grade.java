package Practice;


public class Grade {
    public static void main (String[] args){
        String firstName="Asiimire";
        String secondName="Praise";
        String fullName= firstName   +   secondName;
        System.out.println("my fullname is: "+fullName);
        //use of a plus sign means concatenation
        System.out.println("my full name in capital letters is:"+fullName.toUpperCase());
        System.out.println("the index of i in my full name is :"+fullName.indexOf("r"));

        //am casting my int values to a double after the operation.also testing for precedence of operators
        int x=5,y=6,z=4;
        double answer =(x+y*z);
        System.out.println( "my answer = "+answer); 
        //converting a double to an integer(type casting)
        double m=4.0098d;
        int h=(int)m;
        System.out.println("my integer h= " +h);

        //boolean
        boolean myBool=false;
        System.out.println("my bool is: "+myBool);
        //test
        long myNum=12200000000000000L;
        System.out.println("my num is: "+myNum);
//exponential ie e meaning that 35 *10 power 3
        float f1 = 35e3f;
        double d1 = 12E4d;
        
        System.out.println("my new value is : "+f1);
        System.out.println("my new value is : "+d1);

        //multiplication  assignment
        int k=17;
        k*=3;
        System.out.println("the new value of k is: " +k);
        //logical operator
       
        
        
    }
}
