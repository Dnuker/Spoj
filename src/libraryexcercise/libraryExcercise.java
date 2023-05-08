package libraryexcercise;

import java.util.ArrayList;
import java.util.List;

public class libraryExcercise {

    public static void main(String[] args) {
        List<Shelf> shelves1 = new ArrayList<Shelf>();
        Shelf shelf1 = new Shelf("ShelfA");
        Shelf shelf2 = new Shelf("ShelfB");
        List<User> listOfUsers = new ArrayList<>();
        List<User> listOfUsers2 = new ArrayList<>();
        Book book1 = new Book("Zbrodnia i kara", "Fiodor Dostojewski", 1866, Genre.CLASSICS);
        Book book2 = new Book("1984", "George Orwell", 1949, Genre.SCIENCE_FICTION);
        Book book3 = new Book("Harry Potter i Kamień Filozficzny", "J.K.Rowling", 1997, Genre.FANTASY);
        Book book4 = new Book("Złodziejka książek", "Markus Zusak", 2005, Genre.HISTORY);
        Book book5 = new Book("To", "Stephen King", 1986, Genre.HORROR);
        Book book6 = new Book("Władca Pierścieni: Drużyna Pierścienia", "J.R.R. Tolkien", 1954, Genre.FANTASY);
        Book book7 = new Book("Lalka", "Bolesław Prus", 1890, Genre.CLASSICS);
        Book book8 = new Book("Mały Książę", "Antoine de Saint-Exupéry", 1943, Genre.FOR_CHILDREN);
        Book book9 = new Book("Folwark zwierzęcy", "George Orwell", 1945, Genre.SCIENCE_FICTION);
        Book book10 = new Book("Hobbit, czyli tam i z powrotem", "J.R.R. Tolkien", 1937, Genre.FANTASY);
        Book book11 = new Book("Test", "George Orwell", 1949, Genre.SCIENCE_FICTION);

        User user1 = new User("Robert", "Mac");
        User user2 = new User("Random", "User");
        listOfUsers.add(user1);
        listOfUsers.add(user2);

        shelf1.addsBook(book1);
        shelf1.addsBook(book2);
        shelf1.addsBook(book3);
        shelf1.addsBook(book4);
        shelf1.addsBook(book5);

        shelf2.addsBook(book6);
        shelf2.addsBook(book7);
        shelf2.addsBook(book8);
        shelf2.addsBook(book9);
        shelf2.addsBook(book10);

        Library library1 = new Library("Biblioteka Subkowska", shelves1, listOfUsers);
        library1.addsShelf(shelf1);
        library1.addsShelf(shelf2);
        Library library2 = new Library("Biblioteka Czczewska", shelves1,listOfUsers2);
        List<Book> booksToLend = new ArrayList<>();
        booksToLend.add(book1);
        booksToLend.add(book2);
        booksToLend.add(book3);

        library1.lendsBook(2, booksToLend);
        library2.lendsBook(1,booksToLend);
        System.out.println(library1.toString());
        System.out.println(library1.findByAuthor("George Orwell"));
        System.out.println(library1.userHasBookMap);
        System.out.println("\n\n");
        System.out.println(library2.userHasBookMap);
    }
}
