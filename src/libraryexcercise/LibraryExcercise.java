package libraryexcercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryExcercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Shelf> shelves1 = new ArrayList<Shelf>();
        Book book1 = new Book("Zbrodnia i kara", "Fiodor Dostojewski", 1866, genre.CLASSICS);
        Book book2 = new Book("1984", "George Orwell", 1949, genre.SCIENCE_FICTION);
        Book book3 = new Book("Harry Potter i Kamień Filozficzny", "J.K.Rowling", 1997, genre.FANTASY);
        Book book4 = new Book("Złodziejka książek", "Markus Zusak", 2005, genre.HISTORY);
        Book book5 = new Book("To", "Stephen King", 1986, genre.HORROR);
        Book book6 = new Book("Władca Pierścieni: Drużyna Pierścienia", "J.R.R. Tolkien", 1954, genre.FANTASY);
        Book book7 = new Book("Lalka", "Bolesław Prus", 1890, genre.CLASSICS);
        Book book8 = new Book("Mały Książę", "Antoine de Saint-Exupéry", 1943, genre.FOR_CHILDREN);
        Book book9 = new Book("Folwark zwierzęcy", "George Orwell", 1945, genre.SCIENCE_FICTION);
        Book book10 = new Book("Hobbit, czyli tam i z powrotem", "J.R.R. Tolkien", 1937, genre.FANTASY);
        Shelf shelf1 = new Shelf("ShelfA");
        Shelf shelf2 = new Shelf("ShelfB");


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

        Library library1 = new Library("Biblioteka Subkowska",shelves1);
        library1.addsShelf(shelf1);
        library1.addsShelf(shelf2);

        System.out.println(library1.toString());
        System.out.println(library1.findByAuthor("George Orwell"));
    }
}
