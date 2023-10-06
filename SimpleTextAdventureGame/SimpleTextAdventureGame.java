package SimpleTextAdventureGame;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SimpleTextAdventureGame {
    Scanner choice = new Scanner(System.in);
    static Zones zones = new Zones();
    static Player player = new Player();
    static Quests quests = new Quests();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialization
        SimpleTextAdventureGame game;
        game = new SimpleTextAdventureGame();
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
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println("   ▄██████▄   ▄██████▄   ▄█       ████████▄     ▄██████▄     ▄████████     ███        ▄████████ ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println( "  ███    ███ ███    ███ ███       ███   ▀███   ███    ███   ███    ███ ▀█████████▄   ███    ███ ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println("  ███    █▀  ███    ███ ███       ███    ███   ███    █▀    ███    ███    ▀███▀▀██   ███    █▀  ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println(" ▄███        ███    ███ ███       ███    ███  ▄███          ███    ███     ███   ▀  ▄███▄▄▄     ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println("▀▀███ ████▄  ███    ███ ███       ███    ███ ▀▀███ ████▄  ▀███████████     ███     ▀▀███▀▀▀     ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println("  ███    ███ ███    ███ ███       ███    ███   ███    ███   ███    ███     ███       ███    █▄  ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println("  ███    ███ ███    ███ ███▌    ▄ ███   ▄███   ███    ███   ███    ███     ███       ███    ███ ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println("  ████████▀   ▀██████▀  █████▄▄██ ████████▀    ████████▀    ███    █▀     ▄████▀     ██████████ ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println("                        ▀                                                                       ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println("-------------------------");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
