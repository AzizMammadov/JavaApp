//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Quiz.Quiz1;

import java.util.Scanner;

public class SwitchCase {
    public SwitchCase() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ayın nömrəsini daxil edin (1-12): ");
        int ay = sc.nextInt();
        switch (ay) {
            case 1 -> System.out.println("Yanvar");
            case 2 -> System.out.println("Fevral");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Aprel");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("İyun");
            case 7 -> System.out.println("İyul");
            case 8 -> System.out.println("Avqust");
            case 9 -> System.out.println("Sentyabr");
            case 10 -> System.out.println("Oktyabr");
            case 11 -> System.out.println("Noyabr");
            case 12 -> System.out.println("Dekabr");
            default -> System.out.println("Yanlış nomreni daxil etdin.");
        }

        System.out.println("*******************************************************************************");
        char letter = sc.next().charAt(0);
        switch (letter) {
            case 'A' -> System.out.println("Ela");
            case 'B' -> System.out.println("Yaxsi");
            case 'C' -> System.out.println("Kafi");
            case 'D' -> System.out.println("Zeif");
            default -> System.out.println("Not found");
        }

    }
}
