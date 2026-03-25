class Apartment{
    void display(){
        System.out.println("I am inside the apartment class");
    }
}
public class InsideApartment{
    public static void main(String[] args) {
        Apartment ap = new Apartment();
        ap.display();
    }
}
