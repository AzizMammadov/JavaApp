//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Quiz2;

import java.util.Scanner;

public class Array {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Example 6.2 ");
        System.out.println("Example 6.3 ");
        System.out.println("Example 6.4 ");
        int[] arr = new int[5];
        int[] squares = new int[arr.length];

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(i + 1 + "-ci ədədi daxil edin: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; ++i) {
            squares[i] = arr[i] * arr[i];
        }

        for(int i = 0; i < squares.length; ++i) {
            System.out.print(squares[i] + ", ");
        }

    }
}
