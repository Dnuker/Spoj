package libraryexcercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Library {
    String name;
    List<Shelf> shelves;
    List<Status> statusOfBooks;
    List<User> listOfUsers;
    Map<User, List<Book>> userHasBookMap = new HashMap<>();

    public Library(String name, List<Shelf> shelves, List<User> listOfUsers) {
        this.name = name;
        this.shelves = shelves;
     /*   for (Shelf shelf:shelves) {
            for (Book book:shelf.books){
                statusOfBooks.add(Status.AVAILABLE);
            }
        }*/
        this.listOfUsers = listOfUsers;
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

    public Map<User, List<Book>> lendsBook(int userId, List<Book> booksToLend) {
        userHasBookMap.put(User.getUserById(userId, listOfUsers), booksToLend);
        return userHasBookMap;
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
                        //   append("Status: ").append(statusOfBooks.get(book.id - 1)).append("\n").
                                append("ID: ").append(book.id).append("\n\n");
            }
        }

        return sb.toString();
    }
}
