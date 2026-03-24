public class Sbuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
    }
}
