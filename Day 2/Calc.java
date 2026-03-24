import java.util.*;
class Calc{
    public static void main(String[] args){
        int a,b;
        System.out.println("mathematical operations");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        String s = sc.next();
        switch(s){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
        }        
    }
}
