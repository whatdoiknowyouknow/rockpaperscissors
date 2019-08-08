public class NonHumanPlayer extends Player {

    @Override
    public String getHand() {
        int i = (int)(Math.random()*Game.possibleHands.size());
        return Game.possibleHands.get(i);
    }

    @Override
    public void setPlayerName() {
        name = "the computer";

    }
}
