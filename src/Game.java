import java.util.ArrayList;
import java.util.Arrays;

public class Game {

    public static final ArrayList<String> possibleHands = new ArrayList<String>(Arrays.asList("rock", "paper", "scissors"));
    private Player player1 = new HumanPlayer();
    private Player player2 = new NonHumanPlayer();


    Game(){

        player1.setPlayerName();
        player2.setPlayerName();

    }

    public String compareHands(final String hand1, final String hand2) {


        if (hand1.equalsIgnoreCase(hand2)){
            return "no one";
        }
        if ( ((possibleHands.indexOf(hand2) + 1) % possibleHands.size()) == possibleHands.indexOf(hand1)) {     // In a game of rock-paper-scissors, a hand always loses from the hand next in the array of possibleHands, and wins from the previous hand in it (or vice versa, depending on the order in the array). This line checks that, by comparing any hand to the next in the array of possibleHands. The % makes sure the last element in the array is compared with the first one: possibleHands[2] will be compared with possibleHands[0], not with possibleHands[3] (out of bounds)!
            player1.addToScore(1);
            return hand1;
        }

        player2.addToScore(1);
        return hand2;

    }





    public Player getPlayer1(){
        return player1;
    }

    public Player getPlayer2(){
        return player2;
    }

    public String getWinner(){
        if (player1.getScore() > player2.getScore()){
            return player1.getPlayerName();
        }
        if (player2.getScore() > player1.getScore()){
            return player2.getPlayerName();
        }
        return "tie";
    }




}
