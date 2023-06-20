package libraryexcercise;

import java.util.List;

public class User {
    static int idCounter = 1;
    private String name;
    private String surname;
    public int id;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = idCounter;
        idCounter++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name:").append(name).
                append("\nSurname:").append(surname).
                append("\nBooks:\n");
        return sb.toString();

    }
}