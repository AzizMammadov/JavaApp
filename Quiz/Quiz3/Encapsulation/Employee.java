package Quiz.Quiz3.Encapsulation;

import java.util.Scanner;
/*
Bir Employee sinfi yaradın.
•	name, salary sahələri olsun.
•	increaseSalary(double percent) metodu maaşı faizlə artırsın.
•	getSalary() metodu cari maaşı qaytarsın.
•	 Maaş artırıldıqdan sonra yeni dəyəri çap edin.

 */
public class Employee {

    private String name;
    private int salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        System.out.println("Enter the employee salary: ");
        Scanner scanner  = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            salary = scanner.nextInt();
            return salary;

        }

        else {
            System.out.println("Invalid salary");
        }
        return 0 ;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void  increaseSalary(double percent) {
        // double salary = getSalary();
        salary += salary * (percent / 100);
        System.out.println("Artim sonrasi maas : " + salary);
        //   return salary;


    }

}