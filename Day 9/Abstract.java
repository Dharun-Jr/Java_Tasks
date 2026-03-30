abstract class Anim{
    abstract void sound();
    void eat(){
        System.out.println("Eating...");
    }
}
class Dg extends Anim{
    void sound(){
        System.out.println("Barks");
    }
}
class Ct extends Anim{
    void sound(){
        System.out.println("meows");
    }
}
public class Abc{
    public static void main(String[] args) {
        Anim a = new Dg();
        Anim b = new Ct();
        a.sound();
        b.sound();
    }
}
