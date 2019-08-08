public abstract class Player {

    private int score;
    protected String name;


    Player(){
        score = 0;
    }

    public abstract String getHand();
    public abstract void setPlayerName();

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
