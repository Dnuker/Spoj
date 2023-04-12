package libraryexcercise;

import java.util.Scanner;

public class LibraryExcercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book1 = new Book("Zbrodnia i kara", "Fiodor Dostojewski", 1866, "literatura klasyczna");
        Book book2 = new Book("1984", "George Orwell", 1949, "science-fiction");
        Book book3 = new Book("Harry Potter i Kamień Filozficzny", "J.K.Rowling", 1997, "fantasy");
        Book book4 = new Book("Złodziejka książek", "Markus Zusak", 2005, "powieść historyczna");
        Book book5 = new Book("To", "Stephen King", 1986, "powieść grozy");
        Book book6 = new Book("Władca Pierścieni: Drużyna Pierścienia", "J.R.R. Tolkien", 1954, "fantasy");
        Book book7 = new Book("Lalka", "Bolesław Prus", 1890, "literatura klasyczna");
        Book book8 = new Book("Mały Książę", "Antoine de Saint-Exupéry", 1943, "dla dzieci");
        Book book9 = new Book("Folwark zwierzęcy", "George Orwell", 1945, "science-fiction");
        Book book10 = new Book("Hobbit, czyli tam i z powrotem", "J.R.R. Tolkien", 1937, "fantasy");

        Shelf shelf1 = new Shelf("ShelfA");
        shelf1.books.add(book1);
        shelf1.books.add(book2);
        shelf1.books.add(book3);
        shelf1.books.add(book4);
        shelf1.books.add(book5);

        Shelf shelf2 = new Shelf("ShelfB");
        shelf2.books.add(book6);
        shelf2.books.add(book7);
        shelf2.books.add(book8);
        shelf2.books.add(book9);
        shelf2.books.add(book10);

        Library library1 = new Library("Biblioteka Subkowska");
        library1.shelves.add(shelf1);
        library1.shelves.add(shelf2);

        System.out.println(library1.toString());
        System.out.println(library1.findByAuthor("George Orwell"));
    }
}
