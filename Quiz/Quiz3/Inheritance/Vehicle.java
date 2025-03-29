package Quiz.Quiz3.Inheritance;

public class Vehicle {

 /*	Vehicle sinfi yaradın (brand və speed sahələri olsun).
 	displayInfo() metodu markanı və sürəti çap etsin.
    Car sinfi Vehicle-dən irs alsın və numberOfDoors əlavə olunsun.
 	Car obyektləri yaradıb məlumatlarını çap edin.
*/
 private String brand;
 private int speed;
public Vehicle() {
    this.brand = brand;
    this.speed = speed;
}
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void displayInfo(String brand, int speed) {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

}
