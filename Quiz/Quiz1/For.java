//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Quiz.Quiz1;

import java.util.Scanner;

public class For {
    public For() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exmaple 3.4");
        System.out.print("Bir ədəd daxil edin: ");
        String number = scanner.nextLine();

        for(int i = 0; i <= number.length(); ++i) {
            System.out.print(number.charAt(i));
            if (i < number.length() - 1) {
                System.out.print(", ");
            }
        }

    }
}
