package libraryexcercise;

public class User {
    static int idCounter = 1;
    private String name;
    private String surname;
    int id;


    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = idCounter;
        idCounter++;
    }
}
