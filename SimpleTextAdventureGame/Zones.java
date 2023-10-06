package SimpleTextAdventureGame;

import java.util.Scanner;

public class Zones {

    Quests quests = new Quests();


    private int firstTimeInTavern = 0;
    private int firstTimeInSilverhelm = 0;

    public void setFirstTimeInTavern(int firstTimeInTavern) {
        this.firstTimeInTavern = firstTimeInTavern;
    }

    public void setFirstTimeInSilverhelm(int firstTimeInSilverhelm) {this.firstTimeInSilverhelm = firstTimeInSilverhelm;
    }

    public int getFirstTimeInTavern() {
        return firstTimeInTavern;
    }

    public int getFirstTimeInSilverhelm() {
        return firstTimeInSilverhelm;
    }

    public void Westshell() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are in the town of Westshell. A sprawling town located\n" +
                "on a beach.");
        System.out.println("What do you want to do?");
        System.out.println("1. *Enter the tavern*");
        System.out.println("2. *Talk to a guard*");
        System.out.println("3. *Leave the town*");
        String choice = scanner.nextLine();


        switch (choice) {
            case ("1"):
                WestshellTavern();
                break;
            case ("2"):
                WestshellGuardDialogue();
                break;
            case ("3"):
                WestshellOutside();
                break;
        }
    }

    public void WestshellTavern() {
        Scanner scanner = new Scanner(System.in);

        if (getFirstTimeInTavern() == 0) {
            System.out.println("You enter the Westshell tavern where the bartender greets you.");
            System.out.println("-------------------------");
            System.out.println("'Hello young adventurer! Haven't seen your face around here so you must be new. Welcome to Westshell!'");
            System.out.println("'My name is Durgstenbof but you can call me Durg. So what can I help you with?'");
            System.out.println("-------------------------");
            setFirstTimeInTavern(1);
        }
        System.out.println("1. *Ask for rumors*");
        System.out.println("2. *Rest*");
        System.out.println("3. *Leave*");

        String choice = scanner.nextLine();

        switch (choice) {
            case ("1"):
                System.out.println("-------------------------");
                System.out.println("'There's a town far to the north where ghosts and banshees are believed to live there.'");
                System.out.println("'Each adventurer that tried to go there hasn't returned.'");
                System.out.println("''Now now. Don't fool yourself that you ARE the hero *sniff*.");
                System.out.println("'You can go there but enter at your own risk and don't blame me in Heaven for sending you there. Hahah!'");
                System.out.println("-------------------------");
                WestshellTavern();
                break;
            case ("2"):
                //TODO Add resting mechanic which restores HP for gold coins
                WestshellTavern();
                break;
            case ("3"):
                Westshell();
                break;
        }
    }

    public void WestshellGuardDialogue() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Westshell Guard: 'What can I help you with?'");
        System.out.println("-------------------------");
        System.out.println("""
                1. *Ask about rumors*
                2. *Ask for directions to the capital*
                3. *Ask where you can rest*
                4. *Leave*
                """);
        String choice = scanner.nextLine();
        switch (choice) {
            case ("1"): // *Ask about rumors*
                if (quests.questWispsRunningRampant == 0) {
                    System.out.println("-------------------------");
                    System.out.println("'There are fairy-like insects that live in the forest next to us.'");
                    System.out.println("'We call them wisps. They are peaceful creatures but recently have become aggressive.'");
                    System.out.println("'I believe a magic spell is at play there. If you feel brave there's a reward for your findings.'");
                    System.out.println("-------------------------");
                    System.out.println("Accept the quest 'Wisps running rampant!'?");
                    System.out.println("1. Accept\n" +
                            "2. Reject");
                    choice = scanner.nextLine();
                    switch (choice) {
                        case ("1"):
                            System.out.println("-------------------------");
                            System.out.println("'Great! The forest is located near the entrance of the city. You can't miss it.'");
                            System.out.println("-------------------------");
                            System.out.println("Quest 'Wisps running rampant!' added to the quest log.");
                            System.out.println("-------------------------");
                            quests.questLog.add("'Wisps running rampant!'");
                            quests.questWispsRunningRampant++;
                            Westshell();
                            break;
                        case ("2"):
                            System.out.println("-------------------------");
                            System.out.println("'Heh. Someone else could do it too.'");
                            System.out.println("-------------------------");
                            WestshellGuardDialogue();
                            break;
                    }
                } else if (quests.questWispsRunningRampant == 1) {
                    System.out.println("-------------------------");
                    System.out.println("'You're back. Did you discover anything?'");
                    System.out.println("-------------------------");
                    //TODO Add quest completion
                    System.out.println("1. *PLACEHOLDER QUEST DISCOVERY");
                    System.out.println("2. *Leave*");
                    choice = scanner.nextLine();
                    switch (choice) {
                        case ("1"):
                            //TODO Add quest completion reward + create GOLD and XP mechanic
                            System.out.println("-------------------------");
                            System.out.println("PLACEHOLDER TEXT");
                            System.out.println("-------------------------");
                            System.out.println("Quest completed!");
                            System.out.println("Reward: PLACEHOLDER gold coins.\n" +
                                    "    XP: PLACEHOLDER XP.");
                            System.out.println("-------------------------");
                            quests.questWispsRunningRampant++;
                            WestshellGuardDialogue();
                            break;
                        case ("2"):
                            WestshellGuardDialogue();
                            break;
                    }
                } else if (quests.questWispsRunningRampant == 2) {
                    System.out.println("-------------------------");
                    System.out.println("'Haven't heard anything lately.'");
                    System.out.println("-------------------------");
                    WestshellGuardDialogue();
                }


                break;
            case ("2"): // *Ask for directions to the capital*
                System.out.println("-------------------------");
                System.out.println("'When you leave town you take the road north. Keep walking and you'll\n" +
                        "reach Silverhelm. Do say hi to '");
                System.out.println("-------------------------");
                break;
            case ("3"): // *Ask where you can rest*
                System.out.println("-------------------------");
                System.out.println("'You can go to the tavern right up ahead. Durgstenbof is the bartender there.'\n" +
                        "'He can offer you a room to rest for a coin or two.'");
                System.out.println("-------------------------");
                break;
            case ("4"): // *Leave*
                Westshell();
                break;
        }
    }

    public void WestshellOutside() {
        Scanner scanner = new Scanner(System.in);
        if (quests.questWispsRunningRampant == 2) {
            System.out.println("-------------------------");
            System.out.println("""
                    You're at the gates of Westshell. To the north you see a dense forest.
                    To the southeast is a well trodden path and a sign that says 'Silverhelm'.
                    Going west will lead you to the beach.""");
        } else {
            System.out.println("-------------------------");
            System.out.println("""
                    You're at the gates of Westshell. To the north you see a dense forest where
                    wisps roam around and chasing the wildlife.
                    To the southeast is a well trodden path and a sign that says 'Silverhelm'.
                    Going west will lead you to the beach.""");
            System.out.println("-------------------------");
        }
        System.out.println("""
                1. *Enter Westshell*
                2. *Head into the forest*
                3. *Head down the road to Silverhelm*
                4. *Go to the beach*
                """);
        String choice = scanner.nextLine();
        switch (choice) {
            case ("1"):
                Westshell();
                break;
            case ("2"):
                MistyForest();
                break;
            case ("3"):
                SilverhelmGates();
                break;
            case ("4"):
                WestshellBeach();
                break;
        }

    }

    public void WestshellBeach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("""
                You arrive at the beach of Westshell. You see a vast amount of water
                in front of you. The sea is calm and the sand is warm. You feel the
                warmth of the sun, the rays dancing over your skin.""");
        System.out.println("1. *Stay a bit more under the sunrays*");
        System.out.println("2. *Leave*");
        String choice = scanner.nextLine();
        switch (choice) {
            case ("1"):
                //TODO Add a positive effect from the sun along with a negative from being scorched
                //FIXME EXPANSION (After a spell from Fairlight wizard you can see a vortex that leads to an underwater kingdom)
                System.out.println("PLACEHOLDER");
                WestshellOutside();
                break;
            case ("2"):
                WestshellOutside();
                break;
        }
    }

    public void MistyForest() {
        if (quests.questWispsRunningRampant == 0){
            System.out.println("-------------------------");
            System.out.println("""
                    You enter the Misty forest.
                    You see fairy-like insects roaming around and terrorizing the wildlife.
                    """);
            System.out.println("-------------------------");
        } else if (quests.questWispsRunningRampant == 1) {
            System.out.println("-------------------------");
            System.out.println("""
                    You enter the Misty forest. You see the wisps terrorizing the wildlife.
                    In the distance, deep into the forest, you see a bright purple light shining
                    through the gaps between trees.
                    """);
            System.out.println("-------------------------");
        }else {
            System.out.println("-------------------------");
            System.out.println("""
                    You enter the Misty forest.
                    Cheerful wisps dance around you as you walk around.
                    """);
            System.out.println("-------------------------");
        }


    }

    public void SilverhelmGates() {
        Scanner scanner = new Scanner(System.in);
        if (getFirstTimeInSilverhelm() == 1) {
            System.out.println("-------------------------");
            System.out.println("""
                    You arrive at the gates of the capital of Goldgate - Silverhelm.
                    The signpost at the entrance says:  'Swiftpass - East'
                                                        'Coldstar - South'
                                                        'Westshell - West'
                    """);
            System.out.println("-------------------------");
        } else {
            System.out.println("-------------------------");
            System.out.println("""
                    You arrive at the gates of Silverhelm. You notice the structure of the city.
                    The walls are tall and pointy, almost cutting through the clouds. The gates
                    are colossal, wondering how do people constructed it let alone open it.
                    """);
            System.out.println("-------------------------");
            setFirstTimeInSilverhelm(1);
        }
        System.out.println("""
                1. *Enter Silverhelm*
                2. *Head East to Swiftpass*
                3. *Head South to Coldstar*
                4. *Head South to Oakenpass*
                5. *Head South to Pristine Pond*
                6. *Head West to Westshell*
                """);
        String choice = scanner.nextLine();
        switch (choice){
            case ("1"):
                Silverhelm();
                break;
            case ("2"):
                SwiftpassGates();
                break;
            case ("3"):
                ColdstarGates();
                break;
            case("4"):
                OakenpassGates();
                break;
            case("5"):
                PristinePond();
                break;
            case ("6"):
                WestshellOutside();
                break;
        }


    }

    public void Silverhelm() {
        //TODO Script a guard that knows the guard from Westshell
        System.out.println("-------------------------");
        System.out.println("-------------------------");
    }

    public void SwiftpassGates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("You arrived at the gates of Swiftpass");
        System.out.println("-------------------------");
        System.out.println("""
                1. *Enter Swiftpass*
                2. *Head Northeast to Fairlight*
                3. *Head East to Ashal'Thalor Ruins*
                4. *Head South to Coldstar*
                5. *Head South to Silkfront*
                6. *Head West to Silverhelm*
                """);
        String choice = scanner.nextLine();
        switch (choice){
            case ("1"):
                Swiftpass();
                break;
            case ("2"):
                FairlightGates();
                break;
            case("3"):
                AshalThaloreRuins();
                break;
            case ("4"):
                ColdstarGates();
                break;
            case ("5"):
                SilkfrontGates();
                break;
            case("6"):
                SilverhelmGates();
                break;
        }
    }

    public void Swiftpass() {

    }

    public void ColdstarGates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("You arrived at the gates of Coldstar");
        System.out.println("-------------------------");
        System.out.println("""
                1. *Enter Coldstar* 
                2. *Head North to Silverhelm*
                3. *Head North to Swiftpass*
                4. *Head South to Silkfront*
                """);
        String choice = scanner.nextLine();
        switch (choice){
            case("1"):
                Coldstar();
                break;
            case("2"):
                SilverhelmGates();
                break;
            case("3"):
                SwiftpassGates();
                break;
            case("4"):
                SilkfrontGates();
                break;
        }
    }

    public void Coldstar() {

    }

    public void OakenpassGates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("You arrived at the gates of Oakenpass");
        System.out.println("-------------------------");
        System.out.println("""
                1. *Enter Oakenpass*
                2. *Head North to the Pristine Pond*
                3. *Head North to Silverhelm*
                """);
        String choice = scanner.nextLine();
        switch (choice){
            case ("1"):
                Oakenpass();
                break;
            case ("2"):
                PristinePond();
                break;
            case ("3"):
                SilverhelmGates();
                break;
        }
    }

    public void Oakenpass() {

    }

    public void SilkfrontGates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("You arrived at the gate of Silkfront");
        System.out.println("-------------------------");
        System.out.println("""
                1. *Enter Silkfront*
                2. *Head North to Coldstar*
                3. *Head North to Swiftpass*
                """);
        String choice = scanner.nextLine();
        switch (choice){
            case ("1"):
                Silkfront();
                break;
            case ("2"):
                ColdstarGates();
                break;
            case ("3"):
                SwiftpassGates();
                break;
        }
    }

    public void Silkfront() {

    }

    public void FairlightGates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("You arrived at the gates of Fairlight");
        System.out.println("-------------------------");
        System.out.println("""
                1. *Enter Fairlight*
                2. *Head South to Ashal'Thalore Ruins*
                3. *Head Southwest to Swiftpass*
                4. *Head West to Moldy Groove*
                5. *Head West to Mistwall*
                """);
        String choice = scanner.nextLine();
        switch (choice){
            case("1"):
                Fairlight();
                break;
            case("2"):
                AshalThaloreRuins();
                break;
            case("3"):
                SwiftpassGates();
                break;
            case("4"):
                MoldyGrove();
                break;
            case("5"):
                MistwallGates();
                break;
        }
    }

    public void Fairlight() {

    }

    public void MistwallGates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("You arrived at the gates of Mistwall");
        System.out.println("-------------------------");
        System.out.println("""
                1. *Enter Mistwall*
                2. *Head East to Moldy Groove*
                3. *Head East to Fairlight*
                """);
        String choice = scanner.nextLine();
        switch (choice){
            case ("1"):
                Mistwall();
                break;
            case ("2"):
                MoldyGrove();
                break;
            case ("3"):
                FairlightGates();
                break;
        }
    }

    public void Mistwall() {

    }

    public void MoldyGrove() {

    }

    public void PristinePond() {

    }

    public void AshalThaloreRuins() {
    }
}
