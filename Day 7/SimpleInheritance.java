class ParentClass{
    void display(){
        System.out.println("I am inside parent class");
    }
}
class Child1 extends ParentClass{
    void display1(){
        System.out.println("Hello from Child");
    }
}
public class SimpleInheritance{
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.display();
        obj.display1();
    }
}
