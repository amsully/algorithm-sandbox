package dont_step_white_tile;
import java.util.Scanner;

public class DontStepTheWhiteTile {

    public static void main(String[] args) {

        //Variables
        int userInput = 0, numberEntered = 0, tileNumber;
        char start;

        //Scanner
        Scanner scanner = new Scanner(System.in);

        //Loop for tiles
        if (userInput == 0) {
            System.out.print("Enter the character 's' to begin: ");
            start = scanner.nextLine().charAt(0);
                if (start == 's') {
                    userInput = 1;
                }
        }

        //Starts the time
        long timeStart = System.currentTimeMillis();

        //Makes the tiles
        if (userInput == 1){
            for (int i = 0; i <= 25; i++) {
                int tile = (int) (3 * Math.random() + 1);
                    if (tile == 1){
                        System.out.print("1 | X | X = ");
                        numberEntered = scanner.nextInt();
                        }
                    else if (tile == 2){
                        System.out.print("X | 2 | X = ");
                        numberEntered = scanner.nextInt();
                        }
                    else {
                        System.out.print("X | X | 3 = ");
                        numberEntered = scanner.nextInt();
                        }
            }
        }

        //Calculates the ending time
        long timeEnd = System.currentTimeMillis();
        System.out.println("It took you " + ((timeEnd - timeStart) / 1000) + " seconds");
        scanner.close();
    }
}
