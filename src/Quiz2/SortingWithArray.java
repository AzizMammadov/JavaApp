package Quiz2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingWithArray {
    public static void main(String[] args) {

/* İstifadəçidən 6 ədəd daxil edin və bu ədədləri kiçikdən böyüyə doğru sıralayın. (Bunu etmək
üçün sort metodundan istifadə edə bilərsiniz.)
*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
       Integer[] arr = new Integer[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
                    }
Arrays.sort(arr);
        System.out.println("Elements of the array: " + Arrays.toString(arr));

/*İstifadəçidən 8 ədəd daxil edin və həmin ədədləri böyükdən kiçiyə doğru sıralayın*/

       Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Elements of the ReverseArray: " + Arrays.toString(arr));

       /* Bir massivdəki ədədləri əks sıralama (böyükdən kiçiyə) ilə düzün. Bunu for dövrəsi və ya sort
        metodunu istifadə edərək həyata keçirin.*/
        System.out.print( "Elements of the EksArray: [");
      for (int i = arr.length-1; i >= 0; i--) {
          System.out.print( arr[i] + " ");

      }
        System.out.print( "]");
    }
}
