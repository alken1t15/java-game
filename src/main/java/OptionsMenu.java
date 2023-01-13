import java.util.Scanner;

public class OptionsMenu {
    static Scanner scanner = new Scanner(System.in);
    static int command;

    public static void showOptionsMenu() {
        do {
            System.out.println("Make you choice and press Enter\n" +
                    "1: Show current settings\n" +
                    "2: Change settings\n" +
                    "3: Exit");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("\n Current settings\n" +
                            "rows: " + Main.rows +
                            "\ncolumns: " + Main.columns +
                            "\nenemies: " + Main.amountOfEnemies +
                            "\ntransistors: " + Main.transistorsNeeded +
                            "\nmoves: " + Main.moves);
                    break;
                case 2:
                    System.out.println("Enter a new value for rows: ");
                    Main.rows = scanner.nextInt();
                    System.out.println("Enter a new value for columns: ");
                    Main.columns = scanner.nextInt();
                    System.out.println("Enter a new value for : enemies");
                    Main.amountOfEnemies = scanner.nextInt();
                    System.out.println("Enter a new value for transistors: ");
                    Main.transistorsNeeded = scanner.nextInt();
                    System.out.println("Enter a new value for moves: ");
                    Main.moves = scanner.nextInt();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Command not recognized, please try again!");
                    break;
            }
        } while (command != 3);
    }
}