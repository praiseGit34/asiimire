package Practice;
public class Text {
    public static void main(String[] args){
       java.lang.String myName="asiimire praise";
        System.out.println("my name is :"+myName);
        //changing of cases
        System.out.println("the length of my name is:"+myName.length());
        System.out.println("my name in capital letters is : "+myName.toUpperCase());
        System.out.println("my name in small letters is : "+myName.toLowerCase());
        //position of letters
        java.lang.String text="i am a girl";
        System.out.println("the index of g in the text is :"+text.indexOf("g"));//whereby the plus after the quotation marks is concatenation
    
        System.out.println(text.startsWith("g"));
        //adding two strings
        java.lang.String am="50";
        java.lang.String an="39";
        java.lang.String add=am + an;
        System.out.println(add);
        java.lang.String temp="i love u";
        System.out.println(temp);

        
    }
    
}
