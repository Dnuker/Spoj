import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Library {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book1 = new Book("Zbrodnia i kara","Fiodor Dostojewski",1866,"literatura klasyczna");
        Book book2 = new Book("1984","George Orwell",1949,"science-fiction");
        Book book3 = new Book("Harry Potter i Kamień Filozficzny","J.K.Rowling",1997,"fantasy");
        Book book4 = new Book("Złodziejka książek","Markus Zusak",2005,"powieść historyczna");
        Book book5 = new Book("To","Stephen King",1986,"powieść grozy");

        ArrayList<Book> shelf1 = new ArrayList<Book>();
        shelf1.add(book1);
        shelf1.add(book2);
        shelf1.add(book3);
        shelf1.add(book4);
        shelf1.add(book5);

        System.out.println(shelf1.toString());
    }

}
