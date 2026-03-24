import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=String.valueOf(n);
        String reversed=new StringBuilder(str).reverse().toString();
        int last=Integer.parseInt(reversed);
        System.out.println(last);
        sc.close();
    }
}
