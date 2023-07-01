class library{
    String[] books;
    int no_of_books=0;
    library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String books: this.books) {
            if (books==null){
                continue;
            }
            System.out.println(" * "+books);
        }
    }
    void issueBooks(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("the book has been issued");
                this.books[i]=null;
                return;
            }

        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class librarymgmt {
    public static void main(String[] args) {
        library l=new library();
        l.addBook("think and grow rich");
        l.addBook("Data Structure");
        l.addBook("Algorithms");
        l.addBook("C programming");
        l.addBook("Java Programming");
        l.showAvailableBooks();
        l.issueBooks("Java Programming");
        l.showAvailableBooks();
        l.returnBook("Java Programming");
        l.showAvailableBooks();
    }
}
