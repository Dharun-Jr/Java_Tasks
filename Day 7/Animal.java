class Animal {
    void eat() {
        System.out.println("animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("dog barks");
    }
}

public class AniInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }

}
