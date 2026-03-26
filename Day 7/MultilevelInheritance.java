class Device{
    void type(){
        System.out.println("It's a laptop");
    }
}
class Brand extends Device{
    void brand(){
        System.out.println("Its from HP");
    }
}
class Model extends Brand{
    void model(){
        System.out.println("From notebook series");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Model mylap = new Model();
        mylap.type();
        mylap.brand();
        mylap.model();
    }
}
