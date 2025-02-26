//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Quiz1;

import java.util.Scanner;

public class SadeVeCut {
    public SadeVeCut() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Sade olub-olmamasıni yoxlamaq istediyiniz ededi daxil edin ");
        int num3 = sc.nextInt();
        if (num3 <= 1) {
            System.out.println("Ədəd sadə ola bilməz.");
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)num3); ++i) {
                if (num3 % i == 0) {
                    System.out.println("Ədəd mürəkkəbdir.");
                    return;
                }
            }

            System.out.println("Ədəd sadədir.");
        }

        System.out.println(" ******************************** ");
        System.out.println("Ədəd daxil et. ");
        int num4 = sc.nextInt();
        if (num4 % 2 == 0) {
            System.out.println("Ədəd cutdur= " + num4);
        } else {
            System.out.println("Ədəd tekdir= " + num4);
        }

    }
}
