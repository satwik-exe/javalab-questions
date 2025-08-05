package ClassAndObjects;

public class Book {
     String title;
     String author;
     String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    public String toString() {
        return "'" + title + "' by " + author + " (ISBN: " + isbn + ")";
    }

    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "978");
        Book book2 = new Book("1984", "George Orwell", "979");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9799");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}