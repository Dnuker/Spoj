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

    // czy tutaj jest dobrze wykorzystany static (imo chyba ta bo ten kod ma się nie odwoływać bezpośrednio do jakiegoś usera)
    public static User getUserById(int userId, List<User> listOfUsers) {
        for (User user : listOfUsers) {
            if (userId == user.id) {
                return user;
            }
        }
        return null;
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
