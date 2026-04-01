public class AutoBoxing{
    public static void main(String[] args) {
        int a=1000;
        Integer obj=a;
        System.out.println(a==obj);
        a=100;
        Integer obj2=100;
        System.out.println(a==obj2);
        Character a1='z';
        Character a2='z';
        
        System.out.println(a1==a2);
        Float c=127.5f;
        Float b=127.5f;
        System.out.println(c==b);
    }

}
