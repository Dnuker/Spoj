package libraryexcercise;

import static jdk.internal.org.jline.reader.LineReader.SuggestionType.HISTORY;

class Book {
    String title;
    String author;
    int releaseDate;
    genre genre;

    //zmien genre z string na enum
    public Book(String title,String author, int releaseDate, genre genre){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Publication year: " + releaseDate + "\n" +
                "Genre: " + genre+ "\n\n";
    }

}

