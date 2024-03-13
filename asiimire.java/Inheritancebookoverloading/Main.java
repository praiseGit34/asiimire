package Inheritancebookoverloading;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
     
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the pages");
     int pages=scan.nextInt();
     System.out.println("enter the bookTitle");
     String bookTitle=scan.next();
     scan.nextLine();
     System.out.println("enter the author"); 
     String Author=scan.next();
     scan.nextLine();
     System.out.println("enter the publisher");
     String publisher=scan.nextLine();
     Book bk=new Book(pages, bookTitle,Author);
     bk.printBook(pages, bookTitle, Author);
     Textbook tb=new Textbook(pages,bookTitle,Author,publisher);
      tb.printBook(publisher);

    scan.close();
    }
    
    
}

