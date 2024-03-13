package Assignment;

import java.util.Scanner;

public class Book {
    public String Title;
    public double Price;
    Book(String Title,double Price){
      this.Title=Title;
      this.Price=Price;
    }
    public void printBook(String t,double p){
        Scanner scan=new Scanner(System.in);
  
        System.out.println("enter the title of the book");
        Title=scan.nextLine();
        System.out.println("enter the price");
        Price=scan.nextInt();

        System.out.println("title="+t);
        System.out.println("price="+p);
    }
    public class Textbook extends Book{
        public String Topic;
    Textbook(String Title,double Price,String topic){
        super(Title,Price);
        this.Topic=Topic;
    }
    public void printBook(String  Topic){
        super.printBook(Topic, Price);
        System.out.println("topic="+Topic);
    }
    
}
public static void main(String[] args) {
 Book bk=new Book();  
}
}
