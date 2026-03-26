class Father{
    void display(){
        System.out.println("I am father");
    }
}
class Son extends Father{
    void job(){
        System.out.println("son is working");
    }
}
class Daughter extends Father{
    void business(){
        System.out.println("Daughter is Doing business");
    }
}
public class Hierarchial {
    public static void main(String[] args) {
        Son s = new Son();
        s.job();
        s.display();
        Daughter d = new Daughter();
        d.business();
        d.display();
       
    }
}
