package libraryexcercise;

import java.util.*;


public class Library {
    String name;
    List<Shelf> shelves;
    List<User> listOfUsers;
    Map<Integer, List<Book>> userHasBookMap = new HashMap<>();

    public Library(String name, List<Shelf> shelves, List<User> listOfUsers) {
        this.name = name;
        this.shelves = shelves;
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
    public User getUserById(int userId) {
        for (User user : listOfUsers) {
            if (userId == user.id) {
                return user;
            }
        }
        return null;
    }

    public void addsShelf(Shelf shelfName) {
        shelves.add(shelfName);
    }

    public Map<Integer, List<Book>> lendsBook(int userId, List<Book> booksToLend) {
        userHasBookMap.put(userId, booksToLend);
        return userHasBookMap;
    }
    //nazwa do zmiany
    public List<Book> availableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        //dodaje wszystkie książki do listy
        for (Shelf shelf : shelves) {
            for (Book book : shelf.books){
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
    public List<Book> availableBooks(Map<Integer,List<Book>> mapWithBooksToLend) {
        List<Book> availableBooks = new ArrayList<>();
        //dodaje wszystkie książki do listy
        for (Shelf shelf : shelves) {
            for (Book book : shelf.books){
            availableBooks.add(book);
            }
        }
        for (Map.Entry<Integer,List<Book>> value : mapWithBooksToLend.entrySet()) {
            List<Book> unavailableBooks = value.getValue();
            availableBooks.removeAll(unavailableBooks);
        }
        return availableBooks;
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
