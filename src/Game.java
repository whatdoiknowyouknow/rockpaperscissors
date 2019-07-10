public class Game {

    public static final String[] possibleHands = new String[]{"rock", "paper", "scissors"};
    Player player1 = new Player();
    Player player2 = new HumanPlayer();


    Game(){

        player1.setPlayerName();
        player2.setPlayerName();

    }

    public String compareHands(String hand1, String hand2) {


        if (hand1.equalsIgnoreCase(hand2)){
            return "no one";
        }
        if ( ((this.getHandIndex(hand2) + 1) % possibleHands.length) == this.getHandIndex(hand1)) {     // In a game of rock-paper-scissors, a hand always loses from the hand next in the array of possibleHands, and wins from the previous hand in it (or vice versa, depending on the order in the array). This line checks that, by comparing any hand to the next in the array of possibleHands. The % makes sure the last element in the array is compared with the first one: possibleHands[2] will be compared with possibleHands[0], not with possibleHands[3] (out of bounds)!
            player1.addToScore(1);
            return hand1;
        }

        player2.addToScore(1);
        return hand2;

    }



    public int getHandIndex(String hand){
        for (int i = 0; i<possibleHands.length;i++){
            if (hand.equalsIgnoreCase(possibleHands[i])) return i;
        }
        return -1;
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
