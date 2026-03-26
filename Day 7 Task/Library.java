class Book {
    String title;
    String author;

    
    Book(String t, String a) {
        title = t;
        author = a;
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


class IssuedBook extends Book {
    String issuedTo;

    IssuedBook(String t, String a, String user) {
        super(t, a);
        issuedTo = user;
    }

    void showIssued() {
        show();
        System.out.println("Issued to: " + issuedTo);
    }
}

public class Main {
    public static void main(String[] args) {

        
        Book b1 = new Book("Java Basics", "James Gosling");
        System.out.println("Book details:");
        b1.show();

        
        IssuedBook b2 = new IssuedBook("OOP Concepts", "Bjarne Stroustrup", "Dharun");

        System.out.println("\nAfter issuing:");
        b2.showIssued();
    }
}
