package libraryexcercise;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    List<Shelf> shelves = new ArrayList<Shelf>();

    public Library(String name, List<Shelf> shelves) {
        this.name = name;
        this.shelves = shelves;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n\n");
        sb.append(shelves.toString());
        return sb.toString();
    }
    List<Book> findByAuthor(String author){
        List<Book> findByAuthor=new ArrayList<>();
        System.out.println("Books of chosen author:\n");
        for (Shelf shelf: shelves){
            for(Book book: shelf.books){
                if (author.equals(book.author)){
                    findByAuthor.add(book);
                }
            }
        }
        return findByAuthor;
    }
    public void addsShelf(Shelf shelfName){
        shelves.add(shelfName);
    }
}
