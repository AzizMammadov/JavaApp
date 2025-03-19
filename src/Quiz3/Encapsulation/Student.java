package Quiz3.Encapsulation;

import java.util.Scanner;

public class Student {

  private String name;
  private int grade;



    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
            }
    public void setGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qiymeti daxil edin: ");
        this.grade = scanner.nextInt();
        if (grade >= 0 && grade <= 100) {
           // this.grade = grade;
            System.out.println( " has been graded!");
        }
        else {
            System.out.println("Yanlış qiymət!");
        }
    }


}
