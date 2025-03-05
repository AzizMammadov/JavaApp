package Quiz2;

import java.util.Arrays;
import java.util.Scanner;

public class SearchWithArray {
    public static void main(String[] args) {


        System.out.println("Example 6.3.1 ");

/* İstifadəçidən 10 ədəd daxil edin və həmin massivdə istənilən bir ədədin olub olmadığını tapın.
Əgər varsa, "Ədəd tapıldı" mesajını, yoxdursa "Ədəd tapılmadı" mesajını yazdırın.*/


        Scanner scanner = new Scanner(System.in);
int [] array = new int[10];
System.out.println("Enter 10 numbers : ");
for (int i = 0; i < array.length; i++) {
    array[i] = scanner.nextInt();
}
System.out.println("Numbers : "+ Arrays.toString(array));
System.out.println(" Which number do u wanna search : ");
int search = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                found = true;
                System.out.println("Eded " + i + ". indekste movcuddur.");
                break;
            }
        }

        if (!found) {
            System.out.println("Eded massivde yoxdur.");
        }
    }
}
