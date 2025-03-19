package Quiz3.ClassesAndObjects;

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




}
}