package SimpleTextAdventureGame;

import java.util.ArrayList;
import java.util.List;

public class Quests {


    //TODO Add Quest Log as functionality. Currently only fills the list and can't be accessed.
    List<String> questLog = new ArrayList<>();
    List<String> completedQuests = new ArrayList<>();


    //Quests List Completion Tracker    0 = Not taken, 1 = Taken, not completed, 2 = Completed
    private int questWispsRunningRampant = 0;




    ///////////////////////////////GETTERS///////////////////////////////

    public int getQuestWispsRunningRampant() {
        return questWispsRunningRampant;
    }

    ///////////////////////////////SETTERS///////////////////////////////

    public void setQuestWispsRunningRampant(int questWispsRunningRampant){
        this.questWispsRunningRampant = questWispsRunningRampant;
    }
}
