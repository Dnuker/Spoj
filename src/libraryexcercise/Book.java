package libraryexcercise;

class Book {
    String title;
    static int idCounter = 1;
    String author;
    int releaseDate;
    Genre genre;
    //zmienic status tak aby znajdował sie w library
    //String stauts = "available";
    int id;

    public Book(String title, String author, int releaseDate, Genre genre) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.id = idCounter;
        idCounter++;
    }
    //to tutaj jest wykorzystywany
    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Publication year: " + releaseDate + "\n" +
                "Genre: " + genre + "\n" +
                "ID: " + id + "\n\n";
    }
}

