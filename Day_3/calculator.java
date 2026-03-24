import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println("The sum is "+(a+b));
                break;
            case '-':
                System.out.println("The difference is "+(a-b));
                break;
            case '*':
                System.out.println("The product is "+(a*b));
                break;
            case '/':
                System.out.println("The division is "+(a/b));
                break;
            case '%':
                System.out.println("The modulus is "+(a%b));
                break;
        }
        sc.close();
    }
}
