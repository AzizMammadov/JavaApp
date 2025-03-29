//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Quiz.Quiz1;

import java.util.Scanner;

public class While {
    public While() {
    }

    public static void main(String[] args) {
        System.out.println("Example 4.1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Example 4.2");
        System.out.println("Example 4.3");
        System.out.println("Example 4.4");
        System.out.println("1. Ededi daxil et ");
        int sum = 0;
        int count = 0;
        System.out.println("Ədədləri daxil edin (prosesi dayandırmaq üçün 0 daxil edin):");

        while(true) {
            int number = sc.nextInt();
            if (number == 0) {
                if (count > 0) {
                    double average = (double)sum / (double)count;
                    System.out.println("Ededlerin cemi " + sum);
                    System.out.println("Ededlerin ortalamasi" + average);
                } else {
                    System.out.println("Eded veya musbet eded daxil edilmeyib /n REPORTED ");
                }

                return;
            }

            sum += number;
            ++count;
        }
    }
}
