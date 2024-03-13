package overloading;
import java.util.Scanner;

public class Book {
    public static String title;
    public static  int page;
    public String publisher;
    public double price;
    Book(String t,int p){
        title=t;
        p=page;
    }
    Book(String title,int page,double d){
        this.title=title;
        this.page=page;
        this.price=d;
    }

    public void printBook(){
        System.out.println("the title of the book is "+this.title);
        System.out.println("the pages of the book is "+this.page);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Book bk=new Book(title, page);
        System.out.println("enter the title of the book");
        bk.title=scan.nextLine();
        System.out.println("enter the number of pages");
        bk.page=scan.nextInt();
        bk.printBook();
        Book w=new Book("Peru", 45, 6.90);
        System.out.println(w.title);
        System.out.println(w.page);
        System.out.println(w.price);
    }
    
}
