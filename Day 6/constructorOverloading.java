class Overload{
    public Overload(){
        System.out.println("Default Constructor");
    }
    public Overload(int x){
        System.out.println("Parameter is:" + x);
    }
    public Overload(String str){
        System.out.println("Parameter is:" + str);
    }
}
public class ConstOverloading {
    public static void main(String[] args) {
        Overload obj1 = new Overload(5);
        Overload obj2 = new Overload("Hope");
        Overload obj3 = new Overload();
    }
}
