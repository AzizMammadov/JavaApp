package Quiz2;

import java.util.Arrays;
import java.util.Scanner;

public class SearchWithArray {
    public static void main(String[] args) {


        System.out.println("Example 6.3.1 ");

/* İstifadəçidən 10 ədəd daxil edin və həmin massivdə istənilən bir ədədin olub olmadığını tapın.
Əgər varsa, "Ədəd tapıldı" mesajını, yoxdursa "Ədəd tapılmadı" mesajını yazdırın.*/


        Scanner scanner = new Scanner(System.in);
/*
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
 */
/* Bir massivdəki tək ədədləri tapın və ekrana yazdırın. (İstifadəçi tərəfindən daxil edilmiş ədəd
massivinə görə işləsin.) */
        System.out.println("Example 6.3.2 ");

  /*
        System.out.print("Array-in size: ");
        int arrsize = scanner.nextInt();
        int[] arr = new int[arrsize];
        System.out.println(arrsize);
        for (int i = 0; i < arrsize; i++) {
            arr[i] = scanner.nextInt();
            }
        System.out.println("Array-in element: " + Arrays.toString(arr));
        System.out.print("Array-in tek elementleri: ");

         for (int i = 0; i < arr.length; i++) {

             if(arr[i]%2 != 0){
               System.out.print(arr[i] + " ");
             }

         }
*/

      /*  Bir massivdə və ya növbəti ən böyük və ən kiçik ədədi tapın. Məsələn, əgər massivdə 3, 5, 7, 9
        ədədləri varsa, ən kiçikdən sonra ən kiçik olan 5 olmalıdır*/
        System.out.println("Example 6.3.3 ");
/*
        int[] arr = { 1,3,2,4,1,4};
        System.out.println("ARRAY"+ Arrays.toString(arr));
        Arrays.sort(arr);
        int secondSmallest = arr[1]; // Sıralanmış massivdə ikinci ən kiçik ədəd
        int secondLargest = arr[arr.length - 2]; // Sıralanmış massivdə ikinci ən böyük ədəd

        // Nəticələri ekrana yazdırırıq
        System.out.println("İkinci ən kiçik ədəd: " + secondSmallest);
        System.out.println("İkinci ən böyük ədəd: " + secondLargest);
*/

  /*  Bir massivdəki ədədlərin orta qiymətinə görə sıralama aparın. (Ən yaxın olanları bir-birinə
sıralayın*/
        System.out.println("Example 6.3.4 ");
        int[] arr = { 1,3,2,4,1,4};
















    }
}
