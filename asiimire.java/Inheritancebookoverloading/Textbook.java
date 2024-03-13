package Inheritancebookoverloading;   
public class Textbook extends Book{
    public static String publisher;
    public Textbook(int pages,String bookTitle,String Author,String publisher){
        super(pages, bookTitle,Author);
        this.publisher=publisher;
    }

    public  void printBook(String publisher){
        super.printBook(pages,bookTitle,Author);
        System.out.println("the publisher is : "+publisher);
    }
}
