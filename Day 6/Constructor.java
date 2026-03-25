public class Constructor {
    public Constructor(){
        System.out.println("DefaultConstructor");
    }
    public Constructor(int x){
        System.out.println("Parameterised constructor" + x);
    }
    public static void main(String[] args) {
        Constructor dc = new Constructor();
        Constructor d = new Constructor(10);
        System.out.println(dc);
        System.out.println("Hello From main");
    }
}

