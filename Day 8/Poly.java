class Animal{
    void sound(){
        System.out.println("Animals always have a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meows");
    }
}
public class Poly {
    public static void main(String[] args) {
        Animal ani = new Cat();
        ani.sound();
        ani = new Dog();
        ani.sound();
    }
}
