import java.util.Scanner;

public class Bladsteenschaar {


    public static void main(String[] args){

     playGame(3);
    }

    private static void playGame(int numberOfRounds){

        Game game = new Game();
        String hand1, hand2, winningHand;

        for (int i = 0; i < numberOfRounds; i++){

            hand1 = game.getPlayer1().getHand();
            hand2 = game.getPlayer2().getHand();
            winningHand = game.compareHands(hand1, hand2);
            String overview = game.getPlayer1().getPlayerName() + " picked " + hand1 + ", " + game.getPlayer2().getPlayerName() + " picked " + hand2 + ". " + winningHand.toUpperCase() + " wins!" ;
            System.out.println(overview);
        }

        if (game.getPlayer1().getScore() == game.getPlayer2().getScore()){
            System.out.println("It's a tie. Let's play another round!");
            playGame(1);
        }
        else {
            System.out.println(game.getWinner() + " won the game!");
        }

    }

}
