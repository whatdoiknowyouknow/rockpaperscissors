import java.util.Scanner;

public class Bladsteenschaar {


    public static void main(String[] args){


     playGame(3);


    }

    public static void playGame(int numberOfRounds){

        Game game = new Game();
        String hand1, hand2, winningHand;

        for (int i = 0; i < numberOfRounds; i++){
            hand1 = game.player1.getHand();
            hand2 = game.player2.getHand();
            winningHand = game.compareHands(hand1, hand2);
            String overview = game.player1.getPlayerName() + " picked " + hand1 + ", " + game.player2.getPlayerName() + " picked " + hand2 + ". " + winningHand.toUpperCase() + " wins!" ;
            System.out.println(overview);
        }

        if (game.player1.getScore() == game.player2.getScore()){
            System.out.println("It's a tie. Let's play another round!");
            playGame(1);
        }
        else {
            System.out.println(game.getWinner() + " won the game!");
        }

    }

}
