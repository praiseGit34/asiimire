package Practice;
public class Condition {
    public static void main (String args[]){
        int a=10;
        if(a==10){
            a+=2;//comparison operators ie <,>,==,!=,<=,>=
            System.out.println("the value of a:"+a);
         }
       else{
            System.out.println("its not ok");
        }
        int maths=50;
        int physics=67;//|| means or && means and ! means not
        if(maths>=50 || physics<=50){
            System.out.println("the conditions are true");
        }
        else{
            System.out.println("you are stupid");
        }
        
    
}
}
