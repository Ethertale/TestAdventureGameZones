package SimpleTextAdventureGame;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SimpleTextAdventureGame {
    static Zones zones = new Zones();
    static Player player = new Player();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialization
        DisplayIntro();
        InitializeGame(scanner);
    }
    private static void InitializeGame(Scanner scanner) {
        System.out.println("What is your name?");
        String command = scanner.nextLine();
        player.setPlayerName(command);

        System.out.println("Welcome " + player.getPlayerName() + " to the world of Goldgate!");
        System.out.println("-------------------------");
        zones.Westshell();
    }
    private static void DisplayIntro() {
        try {
            System.out.println("-------------------------");
            System.out.println("   ▄██████▄   ▄██████▄   ▄█       ████████▄     ▄██████▄     ▄████████     ███        ▄████████ ");
            System.out.println( "  ███    ███ ███    ███ ███       ███   ▀███   ███    ███   ███    ███ ▀█████████▄   ███    ███ ");
            System.out.println("  ███    █▀  ███    ███ ███       ███    ███   ███    █▀    ███    ███    ▀███▀▀██   ███    █▀  ");
            System.out.println(" ▄███        ███    ███ ███       ███    ███  ▄███          ███    ███     ███   ▀  ▄███▄▄▄     ");
            System.out.println("▀▀███ ████▄  ███    ███ ███       ███    ███ ▀▀███ ████▄  ▀███████████     ███     ▀▀███▀▀▀     ");
            System.out.println("  ███    ███ ███    ███ ███       ███    ███   ███    ███   ███    ███     ███       ███    █▄  ");
            System.out.println("  ███    ███ ███    ███ ███▌    ▄ ███   ▄███   ███    ███   ███    ███     ███       ███    ███ ");
            System.out.println("  ████████▀   ▀██████▀  █████▄▄██ ████████▀    ████████▀    ███    █▀     ▄████▀     ██████████ ");
            System.out.println("                        ▀                                                                       ");
            System.out.println("-------------------------");
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
