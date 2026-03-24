public class MethodTypes{
    public static void area1(){
        System.out.println("Area of circle");
    }
    public static void area2(int rad){
        System.out.println(3.14*rad*rad);
    }
    public static double area3(){
        return 3.14;
    }
    public static double area4(int r){
        return 3.14*r*r;
    }
    public static void main(String[] args) {
        area1();
        area2(2);
        System.out.println(area3());
        System.out.println(area4(5));
    }
}
