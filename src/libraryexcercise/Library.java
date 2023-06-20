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

    //ma zwracajc liste ksiązek których nie udało się wypożyczyc
    public List<Book> lendsBook(int userId, List<Book> booksToLend) {
        List<Book> notAvailableBooks = new ArrayList<>();
        List<Book> booksToLendDuplicated = new ArrayList<>();
        booksToLendDuplicated.addAll(booksToLend);
        for (int key : userHasBookMap.keySet()) {
            for (List<Book> listOfBooks : userHasBookMap.values()) {
                for (Book book : listOfBooks) {
                    for (Book book1 : booksToLend)
                        if (book == book1) {
                            notAvailableBooks.add(book);
                            booksToLendDuplicated.remove(book);
                        }
                }
            }
        }
        userHasBookMap.put(userId, booksToLendDuplicated);
        return notAvailableBooks;
    }

    // true oznacza że książka nie jest dostepna
    public boolean lendsBook(int userId, Book bookToLend) {
        for (int key : userHasBookMap.keySet()) {
            for (List<Book> listOfBooks : userHasBookMap.values()) {
                if (listOfBooks.contains(bookToLend)) {
                    return false;
                }
            }
        }
        List<Book> bookToLendAsList = new ArrayList<>();
        //musi byc jako lista bo mapa przyjmuje tylko listy ksiazek
        bookToLendAsList.add(bookToLend);
        userHasBookMap.put(userId, bookToLendAsList);
        return true;

    }
    //nazwa do zmiany

    public List<Book> listOfAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        List<Book> availableBooksDuplicate = new ArrayList<>();
        //dodaje wszystkie książki do listy
        for (Shelf shelf : shelves) {
            availableBooks.addAll(shelf.books);
        }
        for (Book book : availableBooks) {
            availableBooksDuplicate.add(book);
        }
       /* for (int key : userHasBookMap.keySet()) {
            for (Map.Entry<Integer, List<Book>> value : userHasBookMap.entrySet()) {
                List<Book> unavailableBooks = value.getValue();
                availableBooks.removeAll(unavailableBooks);
            }
        }*/
        for (List<Book> unavailableBooks : userHasBookMap.values()) {
            for (Book book : unavailableBooks) {
                for (Book book1 : availableBooks)
                    if (book == book1) {
                        availableBooksDuplicate.remove(book);
                    }
                //availableBooks.removeAll(unavailableBooks);
            }
        }
        return availableBooksDuplicate;
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
