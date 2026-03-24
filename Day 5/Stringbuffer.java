public class Sbuffer{
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append("Iran");
        System.out.println(sbf.toString());
        sbf.reverse();
        System.out.println(sbf.toString());
    }
}
