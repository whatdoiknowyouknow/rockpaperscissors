import java.util.Scanner;

public class HumanPlayer extends Player {


    HumanPlayer(){
    }

    public String getHand(){
        String requestHandMessage = getPlayerName() + ", input your hand: ";
        for (String temp : Game.possibleHands){
            requestHandMessage += temp + " ";       // this loop will print out all possible hands, e.g. rock paper scissors.
        }
        System.out.println(requestHandMessage);
        Scanner scanner = new Scanner(System.in);
        String hand = scanner.nextLine();
        if (Game.possibleHands.contains(hand)){
            return hand;
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
