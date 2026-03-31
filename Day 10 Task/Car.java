class Car{
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void setPrice(double price){
        this.price = price;
    }
    void getPrice(double price){
        System.out.println("Price: " + price);
    }
    void display(){
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);

    }
}
public class BuildCar {
    public static void main(String[] args) {
        Car c1 = new Car("suzuki", "dzire", 2015);
        c1.setPrice(500000);
        c1.getClass();
        c1.display();
    }
}
