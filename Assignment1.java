class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // Nested class Publisher
    class Publisher {
        String publisherName;
        int year;

        Publisher(String publisherName, int year) {
            this.publisherName = publisherName;
            this.year = year;
        }

        void displayPublisher() {
            System.out.println("Publisher Name : " + publisherName);
            System.out.println("Year Published : " + year);
        }
    }

    void displayBook(Publisher pub) {
        System.out.println("Book Title     : " + title);
        System.out.println("Author         : " + author);
        pub.displayPublisher();
    }
}

public class Assignment1{
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling");
        Book.Publisher pub1 = book1.new Publisher("Pearson Education", 2023);
        book1.displayBook(pub1);
    }
}
