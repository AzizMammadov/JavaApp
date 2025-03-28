//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Quiz1;

import java.util.Scanner;

public class ex4 {
    public ex4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin:");
        int num1 = sc.nextInt();
        System.out.println("Emeliyyat isaresini daxil edin:");
        char op = sc.next().charAt(0);
        System.out.println("ikinci ədədi daxil edin:");
        int num2 = sc.nextInt();
        switch (op) {
            case '*':
                System.out.println(num1 * num2);
                break;
            case '+':
                System.out.println(num1 + num2);
                break;
            case ',':
            case '.':
            default:
                System.out.println("Emeliyyat isaresi duzgun deyil:");
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("0-a bolmek mumkun deyil:");
                }
        }

    }
}
