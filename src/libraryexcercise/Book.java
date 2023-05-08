package libraryexcercise;

class Book {
    String title;
    static int idCounter = 1;
    String author;
    int releaseDate;
    Genre genre;
    int id;

    public Book(String title, String author, int releaseDate, Genre genre) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.id = idCounter;
        idCounter++;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Publication year: " + releaseDate + "\n" +
                "Genre: " + genre + "\n" +
                "ID: " + id + "\n\n";
    }
}

