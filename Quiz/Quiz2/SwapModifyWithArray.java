package Quiz.Quiz2;

import java.util.Arrays;
import java.util.Scanner;

public class SwapModifyWithArray {
    public static void main(String[] args) {

        /* İstifadəçidən iki ədəd massiv daxil edin (hər biri 5 ədəd olmalıdır). Hər iki massivdəki ədədləri
            bir-biri ilə mübadilə edin (yəni, massivlərin elementlərini dəyişdirin)*/

Scanner sc = new Scanner(System.in);

Integer[] arr1 = new Integer[5];
// Integer[] arr2 = new Integer[5];

System.out.println("Enter the elements of the FirstArray " );
for (int i = 0; i < arr1.length; i++) {
    arr1[i] = sc.nextInt();
    }
System.out.println("First  Array is  : " + Arrays.toString(arr1));
 /*       System.out.println("Enter the elements of the SecondArray " );
for (int i = 0; i < arr2.length; i++) {
    arr2[i] = sc.nextInt();
  }

System.out.println("Second Array is  : " + Arrays.toString(arr2));

for (int i = 0; i < arr1.length; i++) {
    int temp = arr1[i];
    arr1[i] = arr2[i];
    arr2[i] = temp;
}
System.out.println("NewFirst  Array is  : " + Arrays.toString(arr1));
System.out.println("NewSecond Array is  : " + Arrays.toString(arr2));

*/

       /* Bir massiv yaradın və həmin massivdəki hər bir ədədin yerini dəyişin (məsələn, ilk və sonuncu
                elementi mübadilə edin, sonra ikinci və sondan birinci elementi və s.).*/

/*
for (int i = 0; i < arr1.length; i++) {
    int temp = arr1[i];
    arr1[i] = arr1[arr1.length-1-i];
    arr1[arr1.length-1-i] = temp;
}
System.out.println("          Array  : " + Arrays.toString(arr1));
*/

      /*  Bir massiv yaradın və həmin massivdəki ədədləri ikiqat artırın.
       Məsələn, 1, 2, 3 massivini 2, 4, 6-ya çevirin. */
/*
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i] *2 ;
arr1[i] = temp;
        }
System.out.println(" Array   : " + Arrays.toString(arr1));

*/

/* Bir massivdəki iki ədədin yerini dəyişin. İstifadəçidən massivdə iki index daxil edin və həmin
indexlərdəki ədədləri bir-birinə mübadilə edin*/

        System.out.print("Massivde degisecek 1-ci indexi daxil edin  : ");
int FirstIndex = sc.nextInt();
        System.out.print("Massivde degisecek 2-ci indexi daxil edin  : ");
int SecondIndex = sc.nextInt();
int temp = arr1[FirstIndex];
arr1[FirstIndex] = arr1[SecondIndex];
arr1[SecondIndex] = temp;

System.out.println("Array is  : " + Arrays.toString(arr1));




    }
}
