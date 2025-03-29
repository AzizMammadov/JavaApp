package Quiz.Quiz3.Encapsulation;

import java.util.Scanner;

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
        double salary1 = 0;
        salary1 += salary1 * (percent / 100);
        System.out.println("Artim sonrasi maas : " + salary1);
        //   return salary;


    }

}