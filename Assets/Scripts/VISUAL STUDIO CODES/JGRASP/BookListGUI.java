import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BookListGUI extends JFrame {
    // Sample book data
    private static ArrayList<Book> books = new ArrayList<>();
    
    static {
        books.add(new Book("Book 1", "Author 1", "Fiction", true));
        books.add(new Book("Book 2", "Author 2", "Non-Fiction", false));
        books.add(new Book("Book 3", "Author 3", "Mystery", true));
        // Add more books as needed
    }

    // Book class
    static class Book {
        String title;
        String author;
        String genre;
        boolean available;

        public Book(String title, String author, String genre, boolean available) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.available = available;
        }
    }

    // Constructor
    public BookListGUI() {
        setTitle("Library System - Book List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Display book list
        displayBooks();

        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    // Function to display book list
    private void displayBooks() {
        for (Book book : books) {
            JLabel titleLabel = new JLabel("Title: " + book.title);
            add(titleLabel);
            JLabel authorLabel = new JLabel("Author: " + book.author);
            add(authorLabel);
            JLabel genreLabel = new JLabel("Genre: " + book.genre);
            add(genreLabel);
            JLabel availabilityLabel = new JLabel("Availability: " + (book.available ? "Available" : "Not Available"));
            add(availabilityLabel);
            add(new JSeparator(SwingConstants.HORIZONTAL));
        }
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(BookListGUI::new);
    }
}
