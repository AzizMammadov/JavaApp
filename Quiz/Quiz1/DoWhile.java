//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Quiz.Quiz1;

import java.util.Scanner;

public class DoWhile {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Example 5.1");
        //System.out.println("Example 5.2");
        System.out.println("Example 5.3");
        System.out.println("Example 5.4");
        System.out.println(" Daxil etdiyiniz ededlerden en kiciyinini tapilmasi..");
        int minnumber = Integer.MAX_VALUE;

        int number;
        do {
            System.out.println("Ededi daxil et: ");
            number = scanner.nextInt();
            if (number != 0 && minnumber > number) {
                minnumber = number;
            }
        } while(number != 0);

        if (minnumber == Integer.MAX_VALUE) {
            System.out.println("Ededi daxil edilmeyib: ");
        } else {
            System.out.println("Daxil etdiyiniz en kicik eded:" + minnumber);
        }

    }
}
