package Quiz.Quiz3;

import Quiz.Quiz3.ClassesAndObjects.Book;
import Quiz.Quiz3.ClassesAndObjects.Person;
import Quiz.Quiz3.Encapsulation.Employee;
import Quiz.Quiz3.Encapsulation.Student;
import Quiz.Quiz3.Inheritance.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Person person = new Person(" Aziz ", 25);
    person.introduce();
    Book book = new Book("JAVA", "Azizim", 1998);
        book.displayDetails();
        Book book2 = new Book("C#", "Eva", 1945);
        book2.displayDetails();
        Book book3 = new Book("C++", "Eliot", 1918);
        book3.displayDetails();
//
Student student = new Student();
student.setGrade();
//public void EmployeeMain () {

Scanner scanner = new Scanner(System.in);
            System.out.println("Employee name: " );
            String name = scanner.nextLine();

Employee employee = new Employee();

System.out.println("Employee salary: " + employee.getSalary());
        System.out.println("Employee grade: " );

double grade = scanner.nextDouble();

        employee.increaseSalary(grade);
        scanner.close();
System.out.println("*********************" );
        Car car = new Car();

       car.displayInfo("Nissan", 110);
//new Car().displayInfo("Nissan", 110);

        Animal dog = new Dog(); // upcasting-e ehtiyac yoxdur
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }
           // }
                }