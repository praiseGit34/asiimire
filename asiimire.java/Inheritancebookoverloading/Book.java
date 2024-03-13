package Inheritancebookoverloading;

public class Book {
   
        public static int pages;
        public static String bookTitle;
        protected static String Author;
        Book(int pages,String bookTitle,String Author){
                this.pages=pages;
                this.bookTitle=bookTitle;
                this.Author=Author;
        }
        protected void printBook( int pages,String bookTitle,String Author){
               
                System.out.println("the book has  "+pages+"pages");
                System.out.println("the title is:"+bookTitle);
                System.out.println("the author is :"+Author);
}
}
