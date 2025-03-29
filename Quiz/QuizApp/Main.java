package Quiz.QuizApp;

import java.io.FileInputStream;
import java.io.IOException;

import static Quiz.QuizApp.User.hashPassword;
import static Quiz.QuizApp.UserManagement.FILE_NAME;
import static Quiz.QuizApp.UserManagement.users;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        private static void registerUser(Scanner scanner) {
            System.out.print("İstifadəçi adı: ");
            String username = scanner.nextLine();
            if (users.containsKey(username)) {
                System.out.println("Bu istifadəçi adı artıq mövcuddur.");
                return;
            }
            System.out.print("Şifrə: ");
            String password = scanner.nextLine();
            users.put(username, hashPassword(password));
            saveUsers();
            System.out.println("Qeydiyyat uğurla tamamlandı!");
        }

        private static void loginUser(Scanner scanner) {
            System.out.print("İstifadəçi adı: ");
            String username = scanner.nextLine();
            System.out.print("Şifrə: ");
            String password = scanner.nextLine();

            if (users.containsKey(username) && users.get(username).equals(hashPassword(password))) {
                System.out.println("Giriş uğurludur. Xoş gəldiniz, " + username + "!");
            } else {
                System.out.println("Yanlış istifadəçi adı və ya şifrə.");
            }
        }

        private static void loadUsers() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                users = (Map<String, String>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                users = new HashMap<>();
            }
        }

        private static void saveUsers() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(users);
            } catch (IOException e) {
                System.out.println("Xəta baş verdi: " + e.getMessage());
            }
        }

        private static String hashPassword(String password) {
            try {
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                byte[] hashedBytes = md.digest(password.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : hashedBytes) {
                    sb.append(String.format("%02x", b));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Şifrə kodlama xətası", e);
            }
        }
    }
