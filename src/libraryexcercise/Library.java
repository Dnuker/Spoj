package libraryexcercise;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    List<Shelf> shelves = new ArrayList<Shelf>();
    List<String> status = new ArrayList<>();
    int statusId = Book.idCounter;
    int userId = User.idCounter;
    List<Boolean> hasBook = new ArrayList<>();

    public Library(String name, List<Shelf> shelves) {
        this.name = name;
        this.shelves = shelves;
        //nie wiem czy to powinno się tu znajdować
        for (int i = 1; i < statusId; i++) {
            status.add("available");
        }
        for (int i = 1; i < userId; i++) {
            hasBook.add(false);
        }
    }

    List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        System.out.println("Books of chosen author:\n");
        for (Shelf shelf : shelves) {
            for (Book book : shelf.books) {
                if (author.equals(book.author)) {
                    foundBooks.add(book);
                }
            }
        }
        return foundBooks;
    }

    public void addsShelf(Shelf shelfName) {
        shelves.add(shelfName);
    }

    //dostosować kod
    public void lendsBook(Book book, User user) {
        status.set(book.id - 1, "unavailable");
        hasBook.set(user.id - 1, true);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n\n");
        // sb.append(shelves.toString());
        for (Shelf shelf : shelves) {
            sb.append(shelf.name).append("\n\n");
            for (Book book : shelf.books) {
                sb.append("Title: ").append(book.title).append("\n")
                        .append("Author: ").append(book.author).append("\n").
                        append("Publication year: ").append(book.releaseDate).append("\n").
                        append("Genre: ").append(book.genre).append("\n").
                        append("Status: ").append(status.get(book.id - 1)).append("\n").
                        append("ID: ").append(book.id).append("\n\n");
            }
        }

        return sb.toString();
    }
}
