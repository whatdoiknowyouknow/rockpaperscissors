public class Player {           // child class = humanPlayer.

    private int score;
    String name;


    Player(){
        score = 0;
    }

    public String getHand(){
        int i = (int)(Math.random()*Game.possibleHands.length);
        return Game.possibleHands[i];
    }

    public void setPlayerName(){
        this.name = "the computer";
    }

    public String getPlayerName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void addToScore(int points){
        score += points;
    }


}
