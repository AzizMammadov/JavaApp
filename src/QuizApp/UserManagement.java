package QuizApp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class UserManagement {
    private static final String FILE_NAME = "users.dat";
    private Map<String, User> users = new HashMap<>();

    public UserManagement() {
        loadUsers();
    }

    public void registerUser(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Bu istifadəçi adı artıq mövcuddur.");
            return;
        }
        users.put(username, new User(username, password));
        saveUsers();
        System.out.println("Qeydiyyat uğurla tamamlandı!");
    }

    public void loginUser(String username, String password) {
        if (users.containsKey(username) && users.get(username).checkPassword(password)) {
            System.out.println("Giriş uğurludur. Xoş gəldiniz, " + username + "!");
        } else {
            System.out.println("Yanlış istifadəçi adı və ya şifrə.");
        }
    }

    private void loadUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            users = (Map<String, User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            users = new HashMap<>();
        }
    }

    private void saveUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }
    }
}
