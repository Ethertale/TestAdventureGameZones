package SimpleTextAdventureGame;

public class Player {


    private String playerName;
    private int playerCurrentHP = 300;
    private int playerMaxHP = 300;

    public void setPlayerName(String playerName){this.playerName = playerName;}
    public String getPlayerName(){return playerName;}
    public void setPlayerCurrentHP(int playerCurrentHP){this.playerCurrentHP = playerCurrentHP;}
    public int getPlayerCurrentHP(){return playerCurrentHP;}
    public void setPlayerMaxHP(int playerMaxHP){this.playerMaxHP = playerMaxHP;}
    public int getPlayerMaxHP(){return playerMaxHP;}

}
