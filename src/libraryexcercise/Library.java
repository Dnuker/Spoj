package libraryexcercise;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    List<Shelf> shelves = new ArrayList<Shelf>();

    public Library(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n\n");
        sb.append(shelves.toString());
        return sb.toString();
    }
    String findByAuthor(String author){
        StringBuilder sb = new StringBuilder();
        System.out.println("Books of chosen author:\n");
        for (libraryexcercise.Shelf shelf: shelves){
            for(libraryexcercise.Book book: shelf.books){
                if (author.equals(book.author)){
                    sb.append(book.toString());
                }
            }
        }
        return sb.toString();
    }
}
