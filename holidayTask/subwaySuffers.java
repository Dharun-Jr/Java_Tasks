import java.util.Scanner;

public class SubwaySurfers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n\t SUBWAY SURFERS MENU \t");
            System.out.println("1. Move Left");
            System.out.println("2. Move Right");
            System.out.println("3. Jump");
            System.out.println("4. Slide");
            System.out.println("5. Collect Coin");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Player moves LEFT ");
                    break;

                case 2:
                    System.out.println("Player moves RIGHT ");
                    break;

                case 3:
                    System.out.println("Player JUMPS over obstacle ");
                    break;

                case 4:
                    System.out.println("Player SLIDES under obstacle ");
                    break;

                case 5:
                    System.out.println("Coin collected! ");
                    break;

                case 6:
                    System.out.println("Exiting game... Thanks for playing!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
