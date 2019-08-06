public class Player {           // child class = humanPlayer.

    private int score;
    protected String name;


    Player(){
        score = 0;
    }

    public String getHand(){
        int i = (int)(Math.random()*Game.possibleHands.size());
        return Game.possibleHands.get(i);
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
