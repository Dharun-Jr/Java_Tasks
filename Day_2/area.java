import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter len: ");
        short len = sc.nextShort();

        System.out.print("Enter wid: ");
        short wid = sc.nextShort();

        int area = len * wid;

        System.out.println("Area = " + area);
    }
}
