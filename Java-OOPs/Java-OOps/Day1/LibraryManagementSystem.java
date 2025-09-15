public class LibraryManagementSystem {
    static class Book {
        static String libraryName = "Central Library";

        static void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }

        private String title;
        private String author;
        private final String isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public void displayBookDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "9780132350884");

        Object obj = book1;
        if (obj instanceof Book) {
            ((Book) obj).displayBookDetails();
        }
    }
    
}
