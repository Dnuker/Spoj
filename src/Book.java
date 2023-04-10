import java.util.List;
import java.util.Scanner;
class Book {
    String title;
    String author;
    int releaseDate;
    String genre;
    public Book(String title,String author, int releaseDate, String genre){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }
    public String toString() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Publication year: " + releaseDate + "\n" +
                "Genre: " + genre+ "\n\n";
    }
}
