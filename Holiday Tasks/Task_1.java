import java.util.*;

public class SubwaySuffers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Enter number of moves:");
        int n = sc.nextInt();

        System.out.println("Commands: L (left), R (right), J (jump), S (slide)");

        for (int i = 0; i < n; i++) {
            char move = sc.next().charAt(0);

            switch (move) {
                case 'L':
                    System.out.println("Turned Left");
                    break;

                case 'R':
                    System.out.println("Turned Right");
                    break;

                case 'J':
                    score += 10;
                    System.out.println("Jumped!");
                    break;

                case 'S':
                    score += 5;
                    System.out.println("Slid!");
                    break;

                default:
                    System.out.println("Invalid move");
            }
        }
        System.out.println("Score: " + score);
    }
}
