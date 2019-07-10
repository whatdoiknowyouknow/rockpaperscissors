import java.util.Scanner;

public class HumanPlayer extends Player {


    HumanPlayer(){
    }

    public String getHand(){
        String requestHandMessage = getPlayerName() + ", input your hand: ";
        for (int i = 0; i < Game.possibleHands.length; i++){
            requestHandMessage += Game.possibleHands[i] + " ";       // this loop will print out all possible hands, e.g. rock paper scissors.
        }
        System.out.println(requestHandMessage);
        Scanner scanner = new Scanner(System.in);
        String hand = scanner.nextLine();
        for (int i = 0; i<Game.possibleHands.length;i++){           // this checks if the input is a valid hand, by comparing it to all strings in the array possibleHands.
            if(hand.equalsIgnoreCase(Game.possibleHands[i])){
                return Game.possibleHands[i];
            }

        }
        System.out.println("This is not a correct hand, try again.");
        return this.getHand();
    }

    public void setPlayerName(){
        System.out.println("Typ your name and press enter.");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }



}
