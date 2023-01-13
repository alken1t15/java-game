import java.util.Scanner;

public class Main {

    public static int rows = 3;
    public static int columns = 4;
    public static int amountOfEnemies = 10;
    public static int transistorsNeeded = 100;
    public static int moves = 40;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("Welcome to BigJavaGame v 1.0 Please make your choice:");
            System.out.println("1: Start new game");
            System.out.println("2: Options");
            System.out.println("3: Credits");
            System.out.println("4: Exit");
            command = scanner.nextLine();
            switch (command) {
                case "1":
                    startNewGame();
                    break;
                case "2":
                    OptionsMenu.showOptionsMenu();
                    break;
                case "3":
                    showCredits();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Command not recognized! Please try again");
                    break;
            }
        } while (!command.equals("4"));
    }

    private static void showCredits() {
        System.out.println("Created by Alexey Zarubin\n" +
                "version 1.0, last modified on 27.11.2020\n" +
                "contact me at alken1t15@gmail.com\n");
    }

    private static void openOptionsMenu() {

    }

    private static void startNewGame() {

    }
}