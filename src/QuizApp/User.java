package QuizApp;
import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String passwordHash;

    public User(String username, String password) {
        this.username = username;
        this.passwordHash = hashPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.passwordHash.equals(hashPassword(password));
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


