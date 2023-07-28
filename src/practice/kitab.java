package practice;

import java.util.ArrayList;

class Book{
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList <Book> bookCollection=new ArrayList<Book>();
    public Book(String title,String author,String ISBN){
        this.author=author;
        this.title=title;
        this.ISBN=ISBN;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public static void add_Book(Book book){
        bookCollection.add(book);
    }
    public static void remove_book(Book book){
        bookCollection.remove(book);
    }
    public static ArrayList <Book> get_BookCollection(){
        return bookCollection;
    }
}

public class kitab {
    public static void main(String[] args) {
        Book book1=new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        Book.add_Book(book1);
        Book.add_Book(book2);
        ArrayList <Book> bookCollection=Book.get_BookCollection();
        System.out.println("List of Books: ");
        for (Book book: bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
        Book.remove_book(book1);
        System.out.println("\nAfter removing " + book1.getTitle() + ":");
        System.out.println("List of books:");
        for (Book book: bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

    }
}
