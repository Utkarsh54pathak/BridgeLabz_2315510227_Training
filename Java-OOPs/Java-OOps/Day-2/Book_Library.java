public class Book_Library {
    class Book {
        public String ISBN;
        protected String title;
        private String author;

        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return this.author;
        }
    }

    class EBook extends Book {
        public EBook(String ISBN, String title, String author) {
            super(ISBN, title, author);
        }

        public void displayInfo() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
            System.out.println("Author: " + getAuthor());
        }
    }
}
