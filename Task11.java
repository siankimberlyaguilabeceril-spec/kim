class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + price;
    }
}

public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 2008, 45.99);
        Book book2 = new Book("The Pragmatic Programmer", "Andrew Hunt", 2019, 52.49);
        Book book3 = new Book("Introduction to Algorithms", "Thomas H. Cormen", 2009, 89.99);

        System.out.println("Book 1:");
        System.out.println(book1.toString());
        System.out.println();

        System.out.println("Book 2:");
        System.out.println(book2.toString());
        System.out.println();

        System.out.println("Book 3:");
        System.out.println(book3.toString());
    }
}