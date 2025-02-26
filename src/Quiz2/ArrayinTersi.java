//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Quiz2;

import java.util.Scanner;

public class ArrayinTersi {
    public ArrayinTersi() {
    }

    public static void main(String[] args) {
        System.out.println("Example 6.2.1 ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Example 6.2.2 ");
        System.out.println("Ededi daxil et:");
        int OneNum = sc.nextInt();
        int[] arr = new int[OneNum];

        for(int i = 1; i < OneNum; ++i) {
            arr[i] = OneNum - i;
        }

        System.out.print("TersMassiv ");

        for(int i = 1; i < arr.length; ++i) {
            System.out.print(arr[i]);
        }

    }
}
