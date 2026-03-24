public class Methods{
    public void square(int n){
        System.out.println(n*n);
    }
    public static void main(String[] args) {
        String s = "Hello";
        Methods m = new Methods();
        System.out.println(s);
        m.square(2);
    }
}
